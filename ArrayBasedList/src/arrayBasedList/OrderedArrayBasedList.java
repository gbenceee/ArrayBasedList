package arrayBasedList;

import list.IntList;

public class OrderedArrayBasedList extends ArrayBasedList implements IntList {

	@Override
	public boolean add(int number) {
		increaseListSizeIfNecessary();
		for (int i = 0; i < size; i++) {
			if (arrayBasedList[i] > number) {
				for (int j = size; j > i; j--) {
					arrayBasedList[j] = arrayBasedList[j - 1];
				}
				arrayBasedList[i] = number;
				size++;
				return !contains(number);
			}
		}
		arrayBasedList[size] = number;
		size++;
		return !contains(number);
	}

}