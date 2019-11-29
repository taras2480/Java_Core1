package ua.lviv.lgs;

import java.util.Random;

public class Main {

	private static Iterator stt;

	public static void main(String[] args) {

		Number[] array = new Integer[10];
		Random generator = new Random();

		for (int i = 0; i < array.length; i++) {

			int nextInt = generator.nextInt(100);
			array[i] = nextInt;
		}

		Collection collection = new Collection(array);

		// Виводимо всі елементи масиву
		Iterator iteratorForward1 = collection.createForward1();
		while (iteratorForward1.hasNext()) {

			Integer next = (Integer) iteratorForward1.next();

			System.out.println(next);

		}

		System.out.println();

		// task1

		Iterator iteratorForward = collection.createForward();

		while (iteratorForward.hasNext()) {

			Integer next = (Integer) iteratorForward.next();

			System.out.println((next % 2 == 0) ? next : 0);

		}

		System.out.println();

		// task2
		Iterator iteratorBackWord = collection.createBackWord();

		int count = 0;
		while (iteratorBackWord.hasNext()) {
			Integer next = (Integer) iteratorBackWord.next();
			if (count == 2)
				count = 0;
			if (count == 1) {
				System.out.println(next);
			}
			count++;
		}

		System.out.println();

		// Task 3.
		Iterator anm = collection.anonim();
		while (anm.hasNext()) {
			Integer next = (Integer) anm.next();
			if (count == 3)
				count = 0;
			if (count == 1) {
				if (next % 2 == 1) {
					System.out.println(next);
				}
			}
			count++;
		}

		System.out.println();

		// Task 4.

		Iterator lcl = collection.local();
		while (lcl.hasNext()) {

			lcl.next();

		}

		// Task 5.
		System.out.println();
		Iterator staticClass = Collection.createStaticClass();
		while (staticClass.hasNext()) {

			staticClass.next();

		}

	}
}
