package orderedArrayBasedList;

import list.InitList;

public class Main {

	public static void main(String[] args) {
		InitList orderedArrayBasedList = new OrderedArrayBasedList();
		for (int i = 12; i > 0; i--) {
			orderedArrayBasedList.add(i);
			System.out.println(orderedArrayBasedList.getElementsAsString());
		}
	}

}
