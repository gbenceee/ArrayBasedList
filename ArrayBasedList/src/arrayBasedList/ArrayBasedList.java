package arrayBasedList;

public class ArrayBasedList implements List {

	private int size;
	private int[] arrayBasedList = new int[10];

	@Override
	public boolean add(int number) {
		increaseArrayBasedListSizeIfNecessary();
		arrayBasedList[size] = number;
		size++;
		return !contains(number);
	}

	private void increaseArrayBasedListSizeIfNecessary() {
		if (size >= arrayBasedList.length) {
			int[] newArrayBasedList = new int[arrayBasedList.length * 2];
			System.arraycopy(arrayBasedList, 0, newArrayBasedList, 0, arrayBasedList.length);
			arrayBasedList = newArrayBasedList;
		}
	}

	@Override
	public boolean contains(int number) {
		for (int i = 0; i < size; i++) {
			if (arrayBasedList[i] == number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void delete(int number) {
		for (int i = 0; i < size; i++) {
			if (number == arrayBasedList[i]) {
				for (int j = i; j < size - 1; j++) {
					arrayBasedList[j] = arrayBasedList[j + 1];
				}
				size--;
				i--;
			}
		}
		decreaseArrayBasedListSizeIfNecessary();
	}

	private void decreaseArrayBasedListSizeIfNecessary() {
		if (size < arrayBasedList.length / 2) {
			int[] newArrayBasedList = new int[arrayBasedList.length / 2];
			System.arraycopy(arrayBasedList, 0, newArrayBasedList, 0, newArrayBasedList.length);
			boolean[] newIsModified = new boolean[arrayBasedList.length / 2];
			arrayBasedList = newArrayBasedList;
		}
	}

	@Override
	public String getElementsAsString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < size - 1; i++) {
			builder.append(arrayBasedList[i]).append(" - ");
		}
		builder.append(arrayBasedList[size - 1]);
		return builder.toString();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
