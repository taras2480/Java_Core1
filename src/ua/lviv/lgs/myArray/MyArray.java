package ua.lviv.lgs.myArray;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray<E> implements MyArrayInterface<E> {

	private E[] values;

	public MyArray() {
		values = (E[]) new Object[0];
	}

	@Override
	public Iterator<E> iterator() {

		return new MyArrayIterator<>(values);
	}

	@Override
	public boolean add(E addInt) {

		try {
			E[] interim = values;
			values = (E[]) new Object[interim.length + 1];
			System.arraycopy(interim, 0, values, 0, interim.length);
			values[values.length - 1] = addInt;

			return true;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void removable(int index) {
		try {
			E[] interim = values;
			values = (E[]) new Object[interim.length - 1];
			System.arraycopy(interim, 0, values, 0, index);
			int qtyElementAfterIndex = interim.length - index - 1;
			System.arraycopy(interim, index + 1, values, index, qtyElementAfterIndex);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return Arrays.toString(values);
	}

}
