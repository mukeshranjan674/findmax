package generics.findmax;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FindMaximumTest 
{
  
    @Test
    public void givenThreeIntegersShouldReturnMaximumAtPositionOne()
    {
    	Integer[] integerArray = {40, 20, 30};
    	FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(integerArray);
    	Integer max = findMaximum.getMaxValue();
        assertEquals(integerArray[0], max);
    }
    public void givenThreeIntegersShouldReturnMaximumAtPositionTwo()
    {
    	Integer[] integerArray = {10, 50, 30};
    	FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(integerArray);
    	Integer max = findMaximum.getMaxValue();
        assertEquals(integerArray[1], max);
    }
}
