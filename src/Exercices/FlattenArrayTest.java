package Exercices;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Testing class for Flatten Array
 * Sample Input : Nested array = [[1,2,[3]],4] 
 * Sample Output : Array [1,2,3,4]
 * 
 * @author Florent PROHOULY
 */

class FlattenArrayTest {

	// Nested input array for JUnit Test = [[1,2,[3]],4]
	Object[] nestedArrayInput = new Object[] { new Object[] {1, 2, new Object[] {3}}, 4};
	// Flatten array expected as output = [1,2,3,4]
	Integer[] finalFlattenedArrayOutput = new Integer[]{1, 2, 3, 4};

    @Test
    public void testNestedArrayFromInstructions() {
    	System.out.println(Arrays.toString(FlattenArray.flatten(nestedArrayInput)));
        Assert.assertArrayEquals("Testing with [[1,2,[3]],4]", finalFlattenedArrayOutput, FlattenArray.flatten(nestedArrayInput));
    }

    @Test
    public void testAnEmptyArray() {
        Assert.assertArrayEquals("Testing an empty array", new Integer[]{}, FlattenArray.flatten(new Integer[]{}));
    }
}
