package arrayBasedList;

public interface List {

	boolean add(int number);

	boolean contains(int number);

	void delete(int number);

	String getElementsAsString();

	int getSize();
}
