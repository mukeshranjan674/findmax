package generics.findmax;

public class FindMaximum<E extends Comparable<E>> implements Comparable<E> {

	private E[] myArray;

	public FindMaximum(E[] integerArray) {
		this.myArray = integerArray;
	}

	public static void main(String[] args) {

	}

	public E getMaxValue() {
		E max = (E) myArray[0];
		if (myArray[1].compareTo(max) > 0)
			max = myArray[1];
		if (myArray[2].compareTo(max) > 0)
			max = myArray[2];
		return max;
	}

	@Override
	public int compareTo(E o) {
		return 0;
	}
}
