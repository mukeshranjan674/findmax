package generics.findmax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum<x extends Comparable<x>, y extends Comparable<y>, z extends Comparable<z>> {

	private x[] myIntegerArray;
	private y[] myFloatArray;
	private z[] myStringArray;

	public FindMaximum(x[] myIntegerArray, y[] myFloatArray, z[] myStringArray) {
		this.myIntegerArray = myIntegerArray;
		this.myFloatArray = myFloatArray;
		this.myStringArray = myStringArray;
	}

	public Object[] testMaximum() {
		x maxInteger = getMaxValue(myIntegerArray);
		y maxFloat = getMaxValue(myFloatArray);
		z maxString = getMaxValue(myStringArray);
		Object[] max = { maxInteger, maxFloat, maxString };
		return max;
	}

	public static void main(String[] args) {

	}

	public <E extends Comparable<E>> E getMaxValue(E myArray[]) {
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
	public <T> T findMaximum(T... args) {
		Arrays.sort(args);
		T max = args[args.length - 1];
		return max;
	}
}
