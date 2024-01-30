package arrayBasedList;

public class Main {

	public static void main(String[] args) {
		ArrayBasedList arrayBasedList = new ArrayBasedList();
		arrayBasedList.add(15);
		arrayBasedList.add(10);
		arrayBasedList.add(1);
		arrayBasedList.add(1);
		arrayBasedList.add(1);
		arrayBasedList.add(42);
		for (int i = 1; i < 3; i++) {
			arrayBasedList.add(1);
		}
		arrayBasedList.add(99);
		arrayBasedList.delete(1);

		System.out.println(arrayBasedList.getElementsAsString());
//		System.out.println(arrayBasedList.contains(7));
	}

}
