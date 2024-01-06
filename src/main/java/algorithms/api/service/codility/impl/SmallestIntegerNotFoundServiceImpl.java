package algorithms.api.service.codility.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import algorithms.api.service.codility.SmallestIntegerNotFoundService;

@Service
public class SmallestIntegerNotFoundServiceImpl implements SmallestIntegerNotFoundService {

	@Override
	public int getSmallestIntegerNotFound(int[] params) {
		int result = 1;

		Set<Integer> numbers = new HashSet<>();

		for (int n : params) {
			if (n > 0)
				numbers.add(n);
		}

		if (!numbers.isEmpty()) {
			int index = 1;
			boolean notFounded = false;

			while (!notFounded) {
				if (numbers.contains(index)) {
					index++;
				} else {
					notFounded = true;
					result = index;
				}
			}
		}

		return result;
	}

}