package ua.lviv.lgs.avto;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = getRandomFromRange(2, 10);
		int y = getRandomFromRange(2, 10);

		ArrayList mas = new ArrayList();
		ArrayList mas3 = new ArrayList();

		for (int i = 0; i < x; i++) {
			ArrayList mas1 = new ArrayList();
			for (int j = 0; j < y; j++) {
				Avto2 avto = new Avto2("Mazda", new Handlebar2(getRandomFromRange(30, 40), "leather"),
						new Engine2(2 * getRandomFromRange(2, 6)), getRandomFromRange(200, 400),
						getRandomFromRange(2000, 2018));
				mas1.add(avto);
			}
			mas.add(mas1);
		}

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				System.out.println(mas);
				break;

			}

			case 2: {
				
				Avto2 avto = new Avto2("Mazda", new Handlebar2(getRandomFromRange(30, 40), "leather"),
						new Engine2(2 * getRandomFromRange(2, 6)), getRandomFromRange(200, 400),
						getRandomFromRange(2000, 2018));

				ArrayList mas2 = new ArrayList();

				for (int i = 0; i < x; i++) {

					for (int j = 0; j < y; j++) {
						mas2.add(avto);
					}
					mas3.add(mas2);
					System.out.println(mas3);

					break;
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
