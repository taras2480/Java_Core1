package ua.lviv.lgs;

import java.util.Random;

public interface Iterator {

	public boolean hasNext();

	public Number next();

}

class Collection {

	private static Number[] arr;

	Collection(Number[] arr) {

		Collection.arr = arr;

	}

	public class Forward1 implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {

			return count < arr.length;
		}

		@Override
		public Number next() {

			return arr[count++];
		}

	}

	public Forward1 createForward1() {

		return new Forward1();
	}

	public class Forward implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {

			return count < arr.length;
		}

		@Override
		public Number next() {

			return arr[count++];
		}

	}

	public Forward createForward() {

		return new Forward();
	}

	public class BackWord implements Iterator {
		private int count = arr.length - 1;

		@Override
		public boolean hasNext() {

			return count >= 0;
		}

		@Override
		public Number next() {

			return arr[count--];
		}

	}

	public BackWord createBackWord() {

		return new BackWord();
	}

	public Iterator anonim() {
		return new Iterator() {
			private int count = arr.length - 1;

			@Override
			public boolean hasNext() {
				return count >= 0;
			}

			@Override
			public Number next() {
				return arr[count--];
			}

		};
	}

	public Iterator local() {
		class Local implements Iterator {
			private int count = 0;
			private int index;

			@Override
			public boolean hasNext() {

				return count < arr.length;
			}

			@Override
			public Number next() {

				if (count % 5 == 0) {

					if ((Integer) arr[count] % 2 == 0) {

						System.out.println((Integer) arr[count] - 100);

					}

				}

				return count++;

			}

		}
		return new Local();

	}

	private static class StaticClass implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {

			return count < arr.length;
		}

		@Override
		public Number next() {

			if (count % 2 == 1) {

				if ((Integer) arr[count] % 2 == 0) {

					System.out.println((Integer) arr[count] - 1);

				}

			}

			return count++;

		}

	}

	public static StaticClass createStaticClass() {

		return new StaticClass();

	}

}
