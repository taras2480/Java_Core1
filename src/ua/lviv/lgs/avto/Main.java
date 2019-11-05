package ua.lviv.lgs.avto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = getRandomFromRange(2, 10);
		int y = getRandomFromRange(2, 10);

		Avto[][] mas = new Avto[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				mas[i][j] = new Avto("Mazda", new Handlebar(getRandomFromRange(30, 40), "leather"),
						new Engine(2 * getRandomFromRange(2, 6)), getRandomFromRange(200, 400),
						getRandomFromRange(2000, 2018));
			}
		}

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				System.out.println(Arrays.deepToString(mas));
				break;

			}

			case 2: {

				for (int i = 0; i < x; i++) {
					for (int j = 0; j < y; j++) {
						Arrays.fill(mas[i],
								new Avto("Mazda", new Handlebar(getRandomFromRange(30, 40), "leather"),
										new Engine(2 * getRandomFromRange(2, 4)), getRandomFromRange(200, 400),
										getRandomFromRange(2000, 2018)));

						System.out.println(Arrays.deepToString(mas));

					}
				}

			}

			}
		}
	}

	static void menu() {

		System.out.println("Натисніть 1, чтоб переглянути всі авто , випадково вибрані");
		System.out.println("Натисніть 2, щоб були всі одинакові значення авто");
	}

	public static int getRandomFromRange(int min, int max) {

		if (min > max) {

			throw new IllegalArgumentException("nonsens");

		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;// 1-10

	}
}
