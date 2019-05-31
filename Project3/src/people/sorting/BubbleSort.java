package people.sorting;

import people.Person;

public class BubbleSort extends SortingBase {


    public BubbleSort(int size) {
      super(size);
    }



    public boolean sort(int sortType) {
    	
        

        for (int i = 0; i < size; i++) {
            boolean notDone = true;
            int priorIndex = 0;
            int elementIndex = 1;
            while (notDone) {
            	String Prior = "";
            	String Index = "";
            	if (sortType == 0) {
            	 Index = sortedArray[elementIndex].getFirstName();
            	 Prior = sortedArray[priorIndex].getFirstName();
            	}
            	if (sortType == 1) {
            	 Index = sortedArray[elementIndex].getLastName();
            	 Prior = sortedArray[priorIndex].getLastName();
            	}
            	if (sortType == 2) {
            	 Index = sortedArray[elementIndex].getAddress();
            	 Prior = sortedArray[priorIndex].getAddress();
            	}
            	if (sortType == 3) {
            	 Index = sortedArray[elementIndex].getCity();
            	 Prior = sortedArray[priorIndex].getCity();
            	}
            	if (sortType == 4) {
            	 Index = sortedArray[elementIndex].getState();
            	 Prior = sortedArray[priorIndex].getState();
            	}
            	if (sortType == 5) {
            	 Index = sortedArray[elementIndex].getZipCode();
            	 Prior = sortedArray[priorIndex].getZipCode();
            	}
                if (Index.compareTo(Prior) < 0) {
                    swap(elementIndex, priorIndex);
                }
                elementIndex++;
                priorIndex++;
                if (elementIndex == size) {
                    notDone = false;
                }
            }
        }

        return true;
    }

    private void swap(int elementIndex, int priorIndex) {

        Person swapArea = sortedArray[priorIndex];
        sortedArray[priorIndex] = sortedArray[elementIndex];
        sortedArray[elementIndex] = swapArea;
    }








}

