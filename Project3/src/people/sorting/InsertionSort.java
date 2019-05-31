package people.sorting;

import people.Person;

public class InsertionSort extends SortingBase {

	/**
	 * Creates the sorted array by using the size passed in
	 * 
	 * @param size
	 */
	public InsertionSort(int size) {
		super(size);
	}

	public boolean sort(int sortType) {

		int in, out;

		Person temp;
		String tempOut;
		String tempIn;

		if (sortType == 0) {
			int length = sortedArray[0].getFirstName().length();
			for (int k = 0; k < size; k++) {
				if (length > sortedArray[k].getFirstName().length()) {
					length = sortedArray[k].getFirstName().length();
				}
			}
			for (out = 1; out < size; out++) {
				in = out;
				temp = sortedArray[out];

				tempOut = sortedArray[out].getFirstName().substring(0, length);
				tempIn = sortedArray[in - 1].getFirstName().substring(0, length);
				int compare = tempIn.compareTo(tempOut);

				while (in > 0 && compare >= 0) {
					sortedArray[in] = sortedArray[in - 1];
					--in;
					if (in>0) {
					tempIn = sortedArray[in-1].getFirstName().substring(0, length);
					compare = tempIn.compareTo(tempOut);
					}
					
					
				}
				sortedArray[in] = temp;
				for (int i = 0; i < size; i++) {
					System.out.print(sortedArray[i].getFirstName().toString() + " ");

				}
				System.out.println("");
			}

		}
		if (sortType == 1) {
			int length = sortedArray[0].getLastName().length();
			for (int k = 0; k < size; k++) {
				if (length > sortedArray[k].getLastName().length()) {
					length = sortedArray[k].getLastName().length();
				}
			}
			for (out = 1; out < size; out++) {
				in = out;
				temp = sortedArray[out];

				tempOut = sortedArray[out].getLastName().substring(0, length);
				tempIn = sortedArray[in - 1].getLastName().substring(0, length);
				int compare = tempIn.compareTo(tempOut);

				while (in > 0 && compare >= 0) {
					sortedArray[in] = sortedArray[in - 1];
					--in;
					if (in>0) {
					tempIn = sortedArray[in-1].getLastName().substring(0, length);
					compare = tempIn.compareTo(tempOut);
					}
					
					
				}
				sortedArray[in] = temp;
				for (int i = 0; i < size; i++) {
					System.out.print(sortedArray[i].getLastName().toString() + " ");

				}
				System.out.println("");
			}

		}
		if (sortType == 2) {
			int length = sortedArray[0].getAddress().length();
			for (int k = 0; k < size; k++) {
				if (length > sortedArray[k].getAddress().length()) {
					length = sortedArray[k].getAddress().length();
				}
			}
			for (out = 1; out < size; out++) {
				in = out;
				temp = sortedArray[out];

				tempOut = sortedArray[out].getAddress().substring(0, length);
				tempIn = sortedArray[in - 1].getAddress().substring(0, length);
				int compare = tempIn.compareTo(tempOut);

				while (in > 0 && compare >= 0) {
					sortedArray[in] = sortedArray[in - 1];
					--in;
					if (in>0) {
					tempIn = sortedArray[in-1].getAddress().substring(0, length);
					compare = tempIn.compareTo(tempOut);
					}
					
					
				}
				sortedArray[in] = temp;
				for (int i = 0; i < size; i++) {
					System.out.print(sortedArray[i].getAddress().toString() + " ");

				}
				System.out.println("");
			}

		}
		if (sortType == 3) {
			int length = sortedArray[0].getCity().length();
			for (int k = 0; k < size; k++) {
				if (length > sortedArray[k].getCity().length()) {
					length = sortedArray[k].getCity().length();
				}
			}
			for (out = 1; out < size; out++) {
				in = out;
				temp = sortedArray[out];

				tempOut = sortedArray[out].getCity().substring(0, length);
				tempIn = sortedArray[in - 1].getCity().substring(0, length);
				int compare = tempIn.compareTo(tempOut);

				while (in > 0 && compare >= 0) {
					sortedArray[in] = sortedArray[in - 1];
					--in;
					if (in>0) {
					tempIn = sortedArray[in-1].getCity().substring(0, length);
					compare = tempIn.compareTo(tempOut);
					}
					
					
				}
				sortedArray[in] = temp;
				for (int i = 0; i < size; i++) {
					System.out.print(sortedArray[i].getCity().toString() + " ");

				}
				System.out.println("");
			}

		}
		if (sortType == 4) {
			int length = sortedArray[0].getState().length();
			for (int k = 0; k < size; k++) {
				if (length > sortedArray[k].getState().length()) {
					length = sortedArray[k].getState().length();
				}
			}
			for (out = 1; out < size; out++) {
				in = out;
				temp = sortedArray[out];

				tempOut = sortedArray[out].getState().substring(0, length);
				tempIn = sortedArray[in - 1].getState().substring(0, length);
				int compare = tempIn.compareTo(tempOut);

				while (in > 0 && compare >= 0) {
					sortedArray[in] = sortedArray[in - 1];
					--in;
					if (in>0) {
					tempIn = sortedArray[in-1].getState().substring(0, length);
					compare = tempIn.compareTo(tempOut);
					}
					
					
				}
				sortedArray[in] = temp;
				for (int i = 0; i < size; i++) {
					System.out.print(sortedArray[i].getState().toString() + " ");

				}
				System.out.println("");
			}

		}
		if (sortType == 5) {
			int length = sortedArray[0].getZipCode().length();
			for (int k = 0; k < size; k++) {
				if (length > sortedArray[k].getZipCode().length()) {
					length = sortedArray[k].getZipCode().length();
				}
			}
			for (out = 1; out < size; out++) {
				in = out;
				temp = sortedArray[out];

				tempOut = sortedArray[out].getZipCode().substring(0, length);
				tempIn = sortedArray[in - 1].getZipCode().substring(0, length);
				int compare = tempIn.compareTo(tempOut);

				while (in > 0 && compare >= 0) {
					sortedArray[in] = sortedArray[in - 1];
					--in;
					if (in>0) {
					tempIn = sortedArray[in-1].getZipCode().substring(0, length);
					compare = tempIn.compareTo(tempOut);
					}
					
					
				}
				sortedArray[in] = temp;
				for (int i = 0; i < size; i++) {
					System.out.print(sortedArray[i].getZipCode().toString() + " ");

				}
				System.out.println("");
			}

		}
		return true;

	}
}
