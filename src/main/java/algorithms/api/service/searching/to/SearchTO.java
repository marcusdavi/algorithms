package algorithms.api.service.searching.to;

public class SearchTO {

	private boolean founded;
	private int steps;
	private int element;
	private int arrayLength;

	public SearchTO(boolean founded, int steps, int element, int arrayLength) {
		this.founded = founded;
		this.steps = steps;
		this.element = element;
		this.arrayLength = arrayLength;
	}

	public boolean isFounded() {
		return founded;
	}

	public void setFounded(boolean founded) {
		this.founded = founded;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public int getArrayLength() {
		return arrayLength;
	}

	public void setArrayLength(int arrayLength) {
		this.arrayLength = arrayLength;
	}

	@Override
	public String toString() {
		String elementFounded = founded ? "" : " not";
		return "element " + element + elementFounded + " founded. " + arrayLength + " elements. " + steps + " steps.";
	}

}
