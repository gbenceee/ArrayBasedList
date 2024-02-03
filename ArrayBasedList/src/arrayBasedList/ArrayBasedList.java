package arrayBasedList;

import list.IntList;

public class ArrayBasedList implements IntList {

	protected int size;
	protected int[] arrayBasedList = new int[10];

	@Override
	public boolean add(int number) {
		increaseListSizeIfNecessary();
		arrayBasedList[size] = number;
		size++;
		return !contains(number);
	}

	protected void increaseListSizeIfNecessary() {
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
				arrayBasedList[size - 1] = 0;
				size--;
				i--;
			}
		}
		decreaseListSizeIfNecessary();
	}

	protected void decreaseListSizeIfNecessary() {
		if (size < arrayBasedList.length / 2) {
			int[] newArrayBasedList = new int[arrayBasedList.length / 2];
			System.arraycopy(arrayBasedList, 0, newArrayBasedList, 0, size);
			arrayBasedList = newArrayBasedList;
		}
	}

	@Override
	public String getElementsAsString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < size - 1; i++) {
			builder.append(arrayBasedList[i]).append(" - ");
		}
		if (size > 0) {
			builder.append(arrayBasedList[size - 1]);
		}
		return builder.toString();
	}

	@Override
	public int getSize() {
		return size;
	}

}
