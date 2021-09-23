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

	}

	// method for first sorting algorithm
	public static int[] sort1(int[] a) {

		return a;

	}

	// method for second sorting algorithm
	public static int[] sort2(int[] a) {

		return a;

	}

	// Random Sort
	// Stops after 100 000 attempt
	public static int[] randomSort(int[] a) {

		int counter = 0;
		
		while(counter < 100000 && checkSequential(a) == false) {
			a = shuffle(a);
			counter++;
		}
		
		if(counter == 100000) {
			System.out.println("Trials exceeded 100 000");
		}else {
			System.out.println("Array sorted");
		}

		return a;

	}

	//Random Number Generator
	public static int RNG(int min, int max) {
		int random = (int) (Math.random() * (max - min + 1) + min);
		return random;
	}

	//Check if the array is in order
	public static boolean checkSequential(int[] a) {
		boolean sequential = true;
		int size = a.length;
		
		for (int i = 0; i < size; i++) {
			if(a[i] != i + 1) {
				sequential = false;
			}	
		}
		
		return sequential;
	}

	public static int[] shuffle(int[] a) {
		int rand1 = 0;
		int rand2 = 0;
		int size = a.length;

		for (int i = 0; i < (size * size); i++) {
			int temp1 = 0;
			int temp2 = 0;

			rand1 = RNG(0, (size - 1));
			rand2 = RNG(0, (size - 1));

			temp1 = a[rand1];
			temp2 = a[rand2];
			a[rand1] = temp2;
			a[rand2] = temp1;
		}
		return a;
	}

	

}