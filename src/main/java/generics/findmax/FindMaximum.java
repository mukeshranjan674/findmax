package generics.findmax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum<E extends Comparable<E> >{

	private E[] myArray;

	public FindMaximum(E[] integerArray) {
		this.myArray = integerArray;
	}

	public static void main(String[] args) {

	}

	public E getMaxValue() {
		E max = (E) myArray[0];
		if (max instanceof String) {
			E[] newArray = myArray.clone();
			List<E> myArrayList = Arrays.asList(newArray);
			Collections.sort(myArrayList);
			max = newArray[0];
		} else {
			if (myArray[1].compareTo(max) > 0)
				max = myArray[1];
			if (myArray[2].compareTo(max) > 0)
				max = myArray[2];
		}
		return max;
	}
}
