import java.util.Arrays;
import java.util.Scanner;

public class lotsOfSorting {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * To Do: 1. Input a list of integers to be sorted 2. Simple menu to decide
		 * which sorting alg to use on the list 3. Returns sorted list and time to sort
		 * using the chosen sorting alg
		 */

		boolean exit = false;
		int input = 0;
		int a[] = { 5, 3, 4, 1, 2 };

		displayMenu();

		do {

			input = numberInput(0, 5);

			if (input == 0) {
				exit = true;
			} else if (input == 1) {
				displayArray(a);
			} else if (input == 2) {
				a = shuffle(a);
			} else if (input == 3) {
				a = randomSort(a);
			} else if (input == 4) {
				a = bubbleSort(a);
			} else if (input == 5) {
				a = selectionSort(a);
			}
		} while (exit == false);

	}

	public static void displayMenu() {
		System.out.println("|---------------------------------------|");
		System.out.println("|0.	Exit The Program		|");
		System.out.println("|					|");
		System.out.println("|1.	Display the Array		|");
		System.out.println("|					|");
		System.out.println("|2.	Shuffle the Array		|");
		System.out.println("|					|");
		System.out.println("|3. 	Sort array randomly		|");
		System.out.println("|					|");
		System.out.println("|4. 	Sort array using bubble sort	|");
		System.out.println("|					|");
		System.out.println("|5. 	Sort array using selection sort	|");
		System.out.println("|					|");
		System.out.println("|---------------------------------------|");
	}

	// method for first sorting algorithm
	public static int[] bubbleSort(int[] a) {

		return a;

	}

	// method for second sorting algorithm
	public static int[] selectionSort(int[] a) {
		int size = a.length;
		
		for (int x = 0; x < size - 1; x++) {
			int lastSmallestPosition = x;

			for (int y = x + 1; y < size; y++) {
				if (a[x] > a[y] && a[y] <= a[lastSmallestPosition]) {
					lastSmallestPosition = y;
				}
			}
			int temp = a[lastSmallestPosition];
			a[lastSmallestPosition] = a[x];
			a[x] = temp;
		}
		return a;

	}

	// method for third sorting algorithm
	public static int[] randomSort(int[] a) {

		return a;

	}

	// Display array function
	public static void displayArray(int[] a) {
		int size = a.length;
		for (int x = 0; x < size; x++) {
			System.out.print(a[x] + "	");
			if ((x + 1) % 5 == 0) {
				System.out.println();
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}

	// Random Number Generator
	public static int RNG(int min, int max) {
		int random = (int) (Math.random() * (max - min + 1) + min);
		return random;
	}

	// Number input with range
	public static int numberInput(int min, int max) {
		boolean success = true;
		int number = 0;

		do {
			success = true;

			try {
				number = input.nextInt();
			} catch (Exception e) {
				input.nextLine();
				success = false;
			}
			if (number < min || number > max) {
				System.out.println("Invalid Data. Please enter only the numbers specified.");
			}

		} while (number < min || number > max || success == false);
		return number;
	}

	// Check if the array is in order
	public static boolean checkSequential(int[] a) {
		boolean sequential = true;
		int size = a.length;

		for (int i = 0; i < size; i++) {
			if (a[i] != i + 1) {
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