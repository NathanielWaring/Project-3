package people;

import java.awt.Font;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import people.sorting.BubbleSort;
import people.sorting.InsertionSort;
import people.sorting.SelectionSort;
import people.sorting.SortingBase;

@SuppressWarnings("unused")
public class Sorting {

	private static SortingBase newSort;

	public static void main(String[] args) {

		int size = 10;

		Person testPerson[] = new Person[10];
		Person temp = new Person("Joe", "Smith", "612 School Street", "Greenfield", "Massachusetts", "01301");
		testPerson[0] = temp;
		temp = new Person("Fred", "Jones", "123 Maple Street", "Greenfield", "Massachusetts", "01301");
		testPerson[1] = temp;
		temp = new Person("Mary", "Jones", "123 Maple Street", "Greenfield", "Massachusetts", "01301");
		testPerson[2] = temp;
		temp = new Person("Elizabeth", "Magpie", "200 High Street", "Greenfield", "Massachusetts", "01301");
		testPerson[3] = temp;
		temp = new Person("Hector", "Ortiz", "450 Maple Street", "Deerfield", "Massachusetts", "01373");
		testPerson[4] = temp;
		temp = new Person("Alphonso", "Freeman", "Green Drive", "Deerfield", "Massachusetts", "01373");
		testPerson[5] = temp;
		temp = new Person("Sarah", "Hugh", "5 Oak Street", "Hartford", "Connecticut", "06101");
		testPerson[6] = temp;
		temp = new Person("Gloria", "Goodall", "5 South Main Street", "Sunderland", "Massachusetts", "01375");
		testPerson[7] = temp;
		temp = new Person("Herminie", "Granger", "PO Box 15", "Brattleboro", "Vermont", "05301");
		testPerson[8] = temp;
		temp = new Person("Joe", "Black", "500 New Street", "Los Angeles", "California", "90001");
		testPerson[9] = temp;
		size = 10;

		String welcomeMessage1 = "Welcome to the person sorter!\nPlease choose a sort-type";
		String welcomeMessage2 = "Thank you,\nPlease choose a field to sort";
		// Start Screen //
		ImageIcon icon = new ImageIcon("icon.gif");
		UIManager.put(icon, "OptionPane.informationIcon");
		UIManager.put("OptionPane.messageFont", new Font("Monospaced", Font.BOLD, 28));
		UIManager.put("OptionPane.buttonFont", new Font("Monospaced", Font.BOLD, 20));
		UIManager.put("TextField.font", new Font("Monospaced", Font.BOLD, 20));

		while (true) {

			Object[] loginOptions1 = { "BubbleSort", "SelectionSort", "InsertionSort" };
			Object[] loginOptions2 = { "First Name", "Last Name", "Address", "City", "State", "Zip Code" };
			int loginChoice1 = JOptionPane.showOptionDialog(null, welcomeMessage1, "Welcome to NateBank",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icon, loginOptions1, loginOptions1[0]);
			int loginChoice2 = JOptionPane.showOptionDialog(null, welcomeMessage2, "Welcome to NateBank",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icon, loginOptions2, loginOptions2[0]);

			// BubbleSort //
			if (loginChoice1 == 0) {
				newSort = new BubbleSort(size);

			}
			// SelectionSort //
			if (loginChoice1 == 1) {
				newSort = new SelectionSort(size);

			}
			// InsertionSort //
			if (loginChoice1 == 2) {
				newSort = new InsertionSort(size);

			}

			for (int j = 0;j < size;j++) {
				newSort.add(j,testPerson[j]);
			}
			boolean result = newSort.sort(loginChoice2);

			for (int i = 0; i < size; i++) {
				System.out.println(newSort.getElement(i).toString());

			
			}
			System.exit(0);
		}
	}
}
