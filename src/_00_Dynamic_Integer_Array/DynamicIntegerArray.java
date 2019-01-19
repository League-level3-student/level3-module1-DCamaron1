package _00_Dynamic_Integer_Array;

public class DynamicIntegerArray {
	private int[] numList;

	public DynamicIntegerArray() {
		numList = new int[0];
	}

	public void add(int v) {
		int[] newArray = new int[numList.length + 1];
		newArray[newArray.length - 1] = v;
		for (int i = 0; i < numList.length; i++) {
			newArray[i] = numList[i];
		}
		numList = newArray;
	}

	public int get(int location) {
		return numList[location];
	}

	public void set(int v, int location) {
		numList[location] = v;
	}

	public void insert(int v, int location) {
		int[] newArray = new int[numList.length + 1];
		for (int i = 0; i < newArray.length; i++) {
			if (i < location) {
				newArray[i] = numList[i];
			} else if (i > location) {
				newArray[i] = numList[i - 1];
			} else {
				newArray[i] = v;
			}
		}
		numList = newArray;
	}

	public void remove(int location) {
		int[] newArray = new int[numList.length + 1];
		for (int i = 0; i < numList.length; i++) {
			if (i < location) {
				newArray[i] = numList[i];
			}
			else if (i > location) {
				newArray[i - 1] = numList[i];
			}
		}
		numList = newArray;
	}

	public int size() {
		return numList.length;
	}

	public void clear() {
		numList = new int[0];
	}
}
