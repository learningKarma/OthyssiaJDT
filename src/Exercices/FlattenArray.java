package Exercices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Here is some code that will flatten an array of arbitrarily nested arrays of integer
 * into a flat array of integers.
 * 
 * @author Florent PROHOULY
 */

public class FlattenArray {

    public static Integer[] flatten(Object[] nested) {

    	// Use a list in order to flatten easily
        List<Integer> flatten = new ArrayList<Integer>();
        Integer[] flattenedArray = new Integer[]{};
        
        for (Object element : nested) {
            if (element instanceof Integer) {
            	flatten.add((Integer) element);
            } else if (element instanceof Object[]) {
            	flatten.addAll(Arrays.asList(flatten((Object[]) element)));
            } 
        }
        
        // Push back the flattened list into an Array
        flattenedArray = flatten.toArray(new Integer[flatten.size()]);
        
        // Return the flattened array
        return flattenedArray;
    }
}
