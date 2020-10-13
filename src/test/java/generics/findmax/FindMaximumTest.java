package generics.findmax;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenThreeIntegersShouldReturnMaximumAtPositionOne() {
		Integer[] integerArray = { 40, 20, 30 };
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(integerArray);
		Integer max = findMaximum.getMaxValue();
		assertEquals(integerArray[0], max);
	}
	@Test
	public void givenThreeIntegersShouldReturnMaximumAtPositionTwo() {
		Integer[] integerArray = { 10, 50, 30 };
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(integerArray);
		Integer max = findMaximum.getMaxValue();
		assertEquals(integerArray[1], max);
	}
	@Test
	public void givenThreeIntegersShouldReturnMaximumAtPositionThree() {
		Integer[] integerArray = { 10, 5, 60 };
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(integerArray);
		Integer max = findMaximum.getMaxValue();
		assertEquals(integerArray[2], max);
	}
	@Test
	public void givenThreeFloatsShouldReturnMaximumAtPositionOne() {
		Float[] floatArray = { 40.12f, 20.05f, 30.80f };
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(floatArray);
		Float max = findMaximum.getMaxValue();
		assertEquals(floatArray[0], max);
	}
	@Test
	public void givenThreeFloatsShouldReturnMaximumAtPositionTwo() {
		Float[] floatArray = { 40.12f, 50.05f, 30.80f };
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(floatArray);
		Float max = findMaximum.getMaxValue();
		assertEquals(floatArray[1], max);
	}
	@Test
	public void givenThreeFloatsShouldReturnMaximumAtPositionThree() {
		Float[] floatArray = { 40.12f, 20.05f, 300.80f };
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(floatArray);
		Float max = findMaximum.getMaxValue();
		assertEquals(floatArray[2], max);
	}

}
