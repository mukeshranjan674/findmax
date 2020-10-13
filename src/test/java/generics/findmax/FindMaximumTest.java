package generics.findmax;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenThreeIntegersShouldReturnMaximumAtPositionOne() {
		Integer[] integerArray = { 40, 20, 30 };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		Integer max = findMaximum.getMaxValue(integerArray);
		assertEquals(integerArray[0], max);
	}

	@Test
	public void givenThreeIntegersShouldReturnMaximumAtPositionTwo() {
		Integer[] integerArray = { 10, 50, 30 };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		Integer max = findMaximum.getMaxValue(integerArray);
		assertEquals(integerArray[1], max);
	}

	@Test
	public void givenThreeIntegersShouldReturnMaximumAtPositionThree() {
		Integer[] integerArray = { 10, 5, 60 };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		Integer max = findMaximum.getMaxValue(integerArray);
		assertEquals(integerArray[2], max);
	}

	@Test
	public void givenThreeFloatsShouldReturnMaximumAtPositionOne() {
		Float[] floatArray = { 40.12f, 20.05f, 30.80f };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		Float max = findMaximum.getMaxValue(floatArray);
		assertEquals(floatArray[0], max);
	}

	@Test
	public void givenThreeFloatsShouldReturnMaximumAtPositionTwo() {
		Float[] floatArray = { 40.12f, 50.05f, 30.80f };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		Float max = findMaximum.getMaxValue(floatArray);
		assertEquals(floatArray[1], max);
	}

	@Test
	public void givenThreeFloatsShouldReturnMaximumAtPositionThree() {
		Float[] floatArray = { 40.12f, 20.05f, 300.80f };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		Float max = findMaximum.getMaxValue(floatArray);
		assertEquals(floatArray[2], max);
	}

	@Test
	public void givenThreeStringsShouldReturnMaximumAtPositionOne() {
		String[] stringArray = { "Apple", "Peach", "Banana" };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		String max = findMaximum.getMaxValue(stringArray);
		assertEquals(stringArray[0], max);
	}
	
	@Test
	public void givenThreeStringsShouldReturnMaximumAtPositionTwo() {
		String[] stringArray = { "Peach", "Apple", "Banana" };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		String max = findMaximum.getMaxValue(stringArray);
		assertEquals(stringArray[1], max);
	}
	
	@Test
	public void givenThreeStringsShouldReturnMaximumAtPositionThree() {
		String[] stringArray = { "Banana", "Peach", "Apple" };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(null,null,null);
		String max = findMaximum.getMaxValue(stringArray);
		assertEquals(stringArray[2], max);
	}
	
	@Test
	public void givenAllThreeDataTypesShouldReturnMaximum() {
		String[] stringArray = { "Banana", "Peach", "Apple" };
		Float[] floatArray = { 40.12f, 20.05f, 300.80f };
		Integer[] integerArray = { 10, 5, 60 };
		FindMaximum<Integer,Float,String> findMaximum = new FindMaximum<Integer,Float,String>(integerArray,floatArray,stringArray);
		Object[] max = findMaximum.testMaximum();
		assertEquals(integerArray[2], max[0]);
		assertEquals(floatArray[2], max[1]);
		assertEquals(stringArray[2], max[2]);
	}

}
