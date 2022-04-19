package Exercices;

/**
 * The price of an item on each day is stored in an array Prices[] of size N.
 * Here is a method that finds all the days on which you buy and sell the item will maximize your profits
 * and prints all the days with profit in a single line.
 * If there is no profit then "No Profit" is printed.
 * 
 * @author Florent PROHOULY
 */

public class PurchasePriceAndSale {
	
    public static void computeBestDays(Integer Prices[], int N) {
 
    	int purchaseDate = 0;
    	int saleDate = 0;
 
    	// We loop on Prices[] in order to get the best purchaseDate
        for (int i = 1; i < N; i++) {
            if (Prices[i-1] > Prices[i]) {
            	purchaseDate = i;
            }
            
            // Here we compute the best sellingDate according  to the previous purchase found.
            if (Prices[i-1] <= Prices[i] && (i+1 == N || Prices[i] > Prices[i+1])) {
            	saleDate = i;
                System.out.printf("(" + purchaseDate + " " + saleDate + ")");
            } 
        }
    }
 
    public static void main(String[] args)
    {
    	Integer[] PricesCase1 = {110, 190, 270, 320, 50, 545, 705};
    	Integer[] PricesCase2 = {33, 23, 35, 39, 43, 29, 44, 55, 75, 77};
    	int N1 = PricesCase1.length;
    	int N2 = PricesCase2.length;
    	
 
        computeBestDays(PricesCase1, N1);
        System.out.println(System.getProperty("line.separator"));
        computeBestDays(PricesCase2, N2);
        
    }
}