package Exercices;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Testing class for Number Difference
 * Sample Input : Array = [1, 7, 5, 9, 2, 12, 3]
 * Sample Output : Result 4 pairs with difference 2
 * 
 * @author Florent PROHOULY
 */

class NumberDifferenceTest {

	/* Input datas for JUnit Tests */
	Integer[] intputArrayFromInstructions = new Integer[]{1, 7, 5, 9, 2, 12, 3};
	Integer[] newInputArray = new Integer[]{0, 7, 22, 4, 9, 12, 6, 37};
	Integer[] anotherInputArray = new Integer[]{27, 9, 90, 30, 6, 97};

	//Differences
	int k = 2;
	int k2 = 4;
	int k3 = 3;
    
	@Test
	public void testFromExercice() {
		Assert.assertEquals("Testing with array from instructions", 4, NumberDifference.twoNumberDifference(intputArrayFromInstructions, k));
	}
	
	@Test
	public void testWithNewInput() {
		Assert.assertEquals("Testing with a new array", 1, NumberDifference.twoNumberDifference(newInputArray, k2));
	}
	
	@Test
	public void testWithAnotherInput() {
		Assert.assertEquals("Testing with another array", 2, NumberDifference.twoNumberDifference(anotherInputArray, k3));
	}

}
