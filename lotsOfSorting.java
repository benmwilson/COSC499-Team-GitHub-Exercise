import java.util.Arrays;
import java.util.Scanner;

public class lotsOfSorting {

	
	
	public static void main(String[] args) {
		
		/*
		 * To Do:
		 * 1. Input a list of integers to be sorted
		 * 2. Simple menu to decide which sorting alg to use on the list	
		 * 3. Returns sorted list and time to sort using the chosen sorting alg
		 */


	// method for first sorting algorithm
	public static int[] sort1(int[] a) {


		return a;

	}

	// method for second sorting algorithm
	public static int[] sort2(int[] a) {
		//bubblesort
		int n = a.length;
		int temp = 0;
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				if(a[j-1] > a[j]){
					//swap elements
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}

			}
		}

		return a;

	}

	// method for third sorting algorithm
	public static int[] sort3(int[] a) {

		return a;

	}

}