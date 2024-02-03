package arrayBasedList;

import java.util.Random;

import list.IntList;

public class Main {

	public static void main(String[] args) {
		ArrayBasedList arrayBasedList = new ArrayBasedList();
		Random random = new Random();
		int randomNumber;
		for (int i = 0; i < 15; i++) {
			randomNumber = random.nextInt(150) + 1;
			System.out.println("The following random number was generated: " + randomNumber);
			System.out.println("I will add it to the end of the list.");
			arrayBasedList.add(randomNumber);
			System.out.println("The list now: " + arrayBasedList.getElementsAsString());
		}
		System.out.println("-------------");
		arrayBasedList.add(10);
		arrayBasedList.add(1);
		arrayBasedList.add(99);
		arrayBasedList.add(1);
		arrayBasedList.add(1);
		arrayBasedList.add(1);
		System.out.println("The list is filled with int numbers: " + arrayBasedList.getElementsAsString());
		System.out.println("----------------");
		int numberToDelete = 1;
		arrayBasedList.delete(numberToDelete);
		System.out.println("Number " + numberToDelete + " deleted, the list contains the following numbers: "
				+ arrayBasedList.getElementsAsString());

		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");

		IntList orderedArrayBasedList = new OrderedArrayBasedList();
		for (int i = 0; i < 12; i++) {
			randomNumber = random.nextInt(150) + 1;
			System.out.println("The following random number was generated: " + randomNumber);
			System.out.println("I will add it to the list and sort the numbers.");
			orderedArrayBasedList.add(randomNumber);
			System.out.println("The list now: " + orderedArrayBasedList.getElementsAsString());
		}
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(105);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1000);
		System.out.println("----------------");
		System.out.println("The list is filled with int numbers: " + orderedArrayBasedList.getElementsAsString());
		System.out.println("----------------");
		numberToDelete = 1;
		orderedArrayBasedList.delete(numberToDelete);
		System.out.println("Number " + numberToDelete + " deleted, the list contains the following numbers: "
				+ orderedArrayBasedList.getElementsAsString());
	}
}
