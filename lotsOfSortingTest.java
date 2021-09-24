import static org.junit.Assert.*;
import org.junit.Test;

public class lotsOfSortingTest {

	@Test
	public void bubbleSortTest() {

		lotsOfSorting o = new lotsOfSorting();

		int[] i = { 5, 2, 4, 3, 1 };
		int[] s = { 1, 2, 3, 4, 5 };

		int[] r = o.bubbleSort(i);

		assertArrayEquals(s, r);
	}

	@Test
	public void selectionSortTest() {

		lotsOfSorting o = new lotsOfSorting();

		int[] i = { 5, 2, 4, 3, 1 };
		int[] s = { 1, 2, 3, 4, 5 };

		int[] r = o.selectionSort(i);

		assertArrayEquals(s, r);
	}

	@Test
	public void randomSortTest() {

		lotsOfSorting o = new lotsOfSorting();

		int[] i = { 5, 2, 4, 3, 1 };
		int[] s = { 1, 2, 3, 4, 5 };

		int[] r = o.randomSort(i);

		assertArrayEquals(s, r);
	}

}
