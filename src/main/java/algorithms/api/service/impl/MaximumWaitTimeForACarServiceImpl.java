package algorithms.api.service.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.stereotype.Service;

import algorithms.api.service.codility.MaximumWaitTimeForACarService;

@Service
public class MaximumWaitTimeForACarServiceImpl implements MaximumWaitTimeForACarService {

	@Override
	public int getMaximumWaitTimeForACar(int[] A, int X, int Y, int Z) {

		Queue<Car> carsQueue = new LinkedList<>();
		List<Car> fueledCars = new ArrayList<>();

		for (int fuelDemand : A) {
			carsQueue.offer(new Car(fuelDemand, 0));
		}

		List<Dispenser> dispensers = new ArrayList<>();
		dispensers.add(new Dispenser(X));
		dispensers.add(new Dispenser(Y));
		dispensers.add(new Dispenser(Z));

		while (!carsQueue.isEmpty() || !existFreeDispenser(dispensers)) {
			Dispenser freeDispenser = null;
			if (!carsQueue.isEmpty()) {
				if (!existFuelDemandDispenser(dispensers, carsQueue.peek().fuelDemand)) {
					return -1;
				}

				freeDispenser = getNextFreeDispenser(dispensers, carsQueue.peek().fuelDemand);
			}

			if (freeDispenser != null) {
				freeDispenser.setCar(carsQueue.poll());
			} else {
				if (carsQueue.isEmpty()) {
					for (Dispenser dispenser : dispensers) {
						if (dispenser.car != null) {
							fueledCars.add(dispenser.car);
							dispenser.setCapacity(dispenser.car.fuelDemand);
							dispenser.setCar(null);
						}
					}
				} else {
					int waitTimeMin = getWaitTimeMin(dispensers, carsQueue.peek());
					for (Dispenser dispenser : dispensers) {
						if (dispenser.car != null && dispenser.car.getFuelDemand() == waitTimeMin) {
							fueledCars.add(dispenser.car);
							dispenser.setCapacity(dispenser.car.fuelDemand);
							dispenser.setCar(null);
						}
					}
					carsQueue.forEach(c -> c.setWaitTime(waitTimeMin));
				}
			}

		}
		return fueledCars.stream().mapToInt(Car::getWaitTime).max().orElse(-1);
	}

	private int getWaitTimeMin(List<Dispenser> dispensers, Car nextCar) {
		return dispensers.stream()
				.filter(dispenser -> dispenser.car != null && nextCar.fuelDemand <= dispenser.futureCapacity())
				.mapToInt(dispenser -> dispenser.car.getFuelDemand()).min().orElse(0);
	}

	private Dispenser getNextFreeDispenser(List<Dispenser> dispensers, int fuelDemand) {
		return dispensers.stream().filter(d -> d.capacity >= fuelDemand && d.car == null).findFirst().orElse(null);
	}

	private boolean existFuelDemandDispenser(List<Dispenser> dispensers, int fuelDemand) {
		return dispensers.stream().anyMatch(d -> d.futureCapacity() >= fuelDemand);
	}

	private boolean existFreeDispenser(List<Dispenser> dispensers) {
		return dispensers.stream().anyMatch(Dispenser::isAvailable);
	}

	class Car {
		int fuelDemand;
		int waitTime;

		public Car(int fuelDemand, int waitTime) {
			this.fuelDemand = fuelDemand;
			this.waitTime = waitTime;
		}

		public int getFuelDemand() {
			return this.fuelDemand;
		}

		public void setWaitTime(int waitTime) {
			this.waitTime = waitTime;
		}

		public int getWaitTime() {
			return this.waitTime;
		}

	}

	class Dispenser {
		int capacity;
		Car car;

		public Dispenser(int capacity) {
			this.capacity = capacity;
		}

		public int futureCapacity() {
			if (car != null) {
				return capacity - car.fuelDemand;
			} else {
				return capacity;
			}

		}

		public void setCar(Car car) {
			this.car = car;
		}

		public void setCapacity(int liters) {
			this.capacity = capacity - liters;
		}

		public boolean isAvailable() {
			return car == null;
		}
	}

}