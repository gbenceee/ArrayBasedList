package arrayBasedList;

public class ArrayBasedList implements Listt {

	private int size;
	private int[] arrayBasedList;
	private boolean[] isModified;

	public ArrayBasedList() {
		this.arrayBasedList = new int[10];
		this.isModified = new boolean[arrayBasedList.length];
	}

	@Override
	public boolean add(int number) {
		if (size >= arrayBasedList.length) {
			int[] newArrayBasedList = new int[arrayBasedList.length * 2];
			boolean[] newIsModified = new boolean[newArrayBasedList.length];
			for (int i = 0; i < arrayBasedList.length; i++) {
				newArrayBasedList[i] = arrayBasedList[i];
				newIsModified[i] = isModified[i];
			}
			size = arrayBasedList.length;
			arrayBasedList = newArrayBasedList;
			isModified = newIsModified;
		}
		arrayBasedList[size] = number;
		isModified[size] = true;
		size++;
		return !contains(number);
	}

	@Override
	public boolean contains(int number) {
		for (int i = 0; i < arrayBasedList.length; i++) {
			if (arrayBasedList[i] == number && isModified[i] == true) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void delete(int number) {
		int indexOfLastElement = 0;
		outer: for (int i = 0; i < arrayBasedList.length && isModified[i] == true; i++) {
			if (number == arrayBasedList[i] && isModified[i] == true) {
				for (int j = i; j < arrayBasedList.length && isModified[j] == true; j++) {
					arrayBasedList[j] = arrayBasedList[j + 1];
					indexOfLastElement = j;
				}
				isModified[indexOfLastElement] = false;
				size--;
				break outer;
			}
		}
		if (size < arrayBasedList.length / 2) {
			int[] newArrayBasedList = new int[arrayBasedList.length / 2];
			boolean[] newIsModified = new boolean[arrayBasedList.length / 2];
			for (int i = 0; i < arrayBasedList.length && isModified[i] == true; i++) {
				newArrayBasedList[i] = arrayBasedList[i];
				newIsModified[i] = isModified[i];
			}
			arrayBasedList = newArrayBasedList;
			isModified = newIsModified;
		}
	}

	@Override
	public String getElementsAsString() {
		StringBuilder builder = new StringBuilder();
		builder.append(isModified[0] == true ? arrayBasedList[0] : "");
		for (int i = 1; i < arrayBasedList.length; i++) {
			if (isModified[i] == true) {
				builder.append(" - ").append(arrayBasedList[i]);
			}
		}
		return builder.toString();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
