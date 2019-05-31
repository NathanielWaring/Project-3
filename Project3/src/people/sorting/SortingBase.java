package people.sorting;

import people.Person;

public abstract class SortingBase {
	public Person[] sortedArray;
	protected int size = 0;

	public SortingBase(int size) {
		sortedArray = new Person[size];
	
		this.size = size;
	}

	public Person getElement(int index) {
		return sortedArray[index];
	}
	
	public abstract boolean sort(int sortType);

	public void add(int index, Person element) {
		sortedArray[index] = element;
		
	}

}
