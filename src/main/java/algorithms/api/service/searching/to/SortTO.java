package algorithms.api.service.searching.to;

public class SortTO {

	private int steps;
	private int[] array;

	public SortTO(int steps, int[] array) {
		this.steps = steps;
		this.array = array;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public String getReport() {
		return array.length + " elements. --> " + steps + " steps";
	}

}
