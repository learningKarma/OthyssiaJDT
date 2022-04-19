package Exercices;

/**
 * Given an array of distinct integer values,
 * here is a simple way to count the number of pairs of integers that have a difference "k".
 * 
 * @author Florent PROHOULY
 */

public class NumberDifference {
	
	public static int twoNumberDifference(Integer Array[], int k) {
		int nbOfPairsFound = 0;
		
		for(int i = 0; i < Array.length; i++) {
			for(int j = i+1; j < Array.length; j++) {
				if(Array[i] - Array[j] == k || Array[j] - Array[i] ==k) {
					nbOfPairsFound++;
				}
			}
		}
		
		System.out.println(nbOfPairsFound + " pair(s) with difference " + k);
		return nbOfPairsFound;
	}
}

