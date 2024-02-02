package orderedArrayBasedList;

import java.util.Random;

import list.InitList;

public class Main {

	public static void main(String[] args) {
		InitList orderedArrayBasedList = new OrderedArrayBasedList();
		Random random = new Random();
		for (int i = 12; i > 0; i--) {
			orderedArrayBasedList.add(random.nextInt(150) + 1);
			System.out.println(orderedArrayBasedList.getElementsAsString());
		}
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(105);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1);
		orderedArrayBasedList.add(1000);
		System.out.println(orderedArrayBasedList.getElementsAsString());
		System.out.println("-----");
		orderedArrayBasedList.delete(1000);
		System.out.println(orderedArrayBasedList.getElementsAsString());
	}

}
