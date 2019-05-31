package people.sorting;

import people.Person;

/**
 * This is selection sort that chooses the smallest element in the array and
 * moves it to the outer location during each iteration.
 * 
 * @author JoyD
 *
 */
public class SelectionSort extends SortingBase {

	/**
	 * Creates the sorted array by using the size passed in
	 * 
	 * @param size
	 */
	public SelectionSort(int size) {
		super(size);
	}

	public boolean sort(int sortType) {

		boolean sorted = false;
		String Prior = "";
		String Index = "";

		for (int outer = 0; outer < size; outer++) {

			int min = outer;
			for (int inner = outer + 1; inner < size; inner++) {
				if (sortType == 0) {
					Index = sortedArray[inner].getFirstName();
					Prior = sortedArray[outer].getFirstName();
				}
				if (sortType == 1) {
					Index = sortedArray[inner].getLastName();
					Prior = sortedArray[outer].getLastName();
				}
				if (sortType == 2) {
					Index = sortedArray[inner].getAddress();
					Prior = sortedArray[outer].getAddress();
				}
				if (sortType == 3) {
					Index = sortedArray[inner].getCity();
					Prior = sortedArray[outer].getCity();
				}
				if (sortType == 4) {
					Index = sortedArray[inner].getState();
					Prior = sortedArray[outer].getState();
				}
				if (sortType == 5) {
					Index = sortedArray[inner].getZipCode();
					Prior = sortedArray[outer].getZipCode();
				}
				if (Index.compareTo(Prior) < 0) {
					min = inner;
					swap(min, outer);
				}

				
			}

		}

		return sorted;

	}

	public void swap(int min, int outer) {
		Person temp = sortedArray[min];
		sortedArray[min] = sortedArray[outer];
		sortedArray[outer] = temp;

	}

}