package arrayBasedList;

public class Main {

	public static void main(String[] args) {
		ArrayBasedList arrayBasedList = new ArrayBasedList();
		arrayBasedList.add(15);
		arrayBasedList.add(10);
		arrayBasedList.add(1);
		arrayBasedList.add(42);
		arrayBasedList.add(99);
		arrayBasedList.add(1);
		arrayBasedList.add(1);
		arrayBasedList.add(22);
		System.out.println(arrayBasedList.getElementsAsString());
		arrayBasedList.delete(1);
		System.out.println(arrayBasedList.getElementsAsString());
	}

}
