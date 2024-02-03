package orderedArrayBasedList;

import list.IntList;

public class OrderedArrayBasedList implements IntList {

	private int size;
	private int[] orderedArrayBasedList = new int[10];

	@Override
	public boolean add(int number) {
		increaseSizeIfNecessary();
		for (int i = 0; i < size; i++) {
			if (orderedArrayBasedList[i] > number) {
				for (int j = size; j > i; j--) {
					orderedArrayBasedList[j] = orderedArrayBasedList[j - 1];
				}
				orderedArrayBasedList[i] = number;
				size++;
				return !contains(number);
			}
		}
		orderedArrayBasedList[size] = number;
		size++;
		return !contains(number);
	}

	@Override
	public boolean contains(int number) {
		for (int i = 0; i < size; i++) {
			if (number == orderedArrayBasedList[i]) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void delete(int number) {
		decreaseSizeIfNecessary();
		for (int i = 0; i < size; i++) {
			if (number == orderedArrayBasedList[i]) {
				for (int j = i; j < size - 1; j++) {
					orderedArrayBasedList[j] = orderedArrayBasedList[j + 1];
				}
				size--;
				i--;
			}
		}
	}

	@Override
	public String getElementsAsString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < size - 1; i++) {
			builder.append(orderedArrayBasedList[i]).append(" - ");
		}
		if (size > 0) {
			builder.append(orderedArrayBasedList[size - 1]);
		}
		return builder.toString();
	}

	@Override
	public int getSize() {
		return size;
	}

	private void increaseSizeIfNecessary() {
		if (size >= orderedArrayBasedList.length) {
			int[] newOrderedArrayBaseList = new int[orderedArrayBasedList.length * 2];
			System.arraycopy(orderedArrayBasedList, 0, newOrderedArrayBaseList, 0, size);
			orderedArrayBasedList = newOrderedArrayBaseList;
		}

	}

	private void decreaseSizeIfNecessary() {
		if (size < orderedArrayBasedList.length / 2) {
			int[] newOrderedArrayBaseList = new int[orderedArrayBasedList.length / 2];
			System.arraycopy(orderedArrayBasedList, 0, newOrderedArrayBaseList, 0, size);
			orderedArrayBasedList = newOrderedArrayBaseList;
		}

	}

}
