package ua.lviv.lgs.commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Commodity> commodityArray = new ArrayList<>();

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {

				System.out.println("Введіть назву товару");
				String name = sc.next();
				System.out.println("Введіть довжину товару");
				int length = sc.nextInt();
				System.out.println("Введіть ширину товару");
				int width = sc.nextInt();
				System.out.println("Введіть вагу товару");
				int weight = sc.nextInt();

				System.out.println();

				System.out.println("До додавання товару ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}
				System.out.println();

				Commodity.addCommodity(commodityArray, name, length, width, weight);

				System.out.println("Після додавання ");
				System.out.println();
				for (Object object : commodityArray) {
					System.out.println(object);
				}

			}
				break;
			case "2": {
				System.out.println("Введіть назву товару, який потрібно видалити");
				String name = sc.next();
				System.out.println();
				System.out.println("До видалення товару ");
				for (Object object : commodityArray) {
					System.out.println(object);
				}

				Commodity.removeCommodity(commodityArray, name);

				System.out.println();
				System.out.println("Після видалення товару ");
				for (Object object : commodityArray) {
					System.out.println(object);
				}

			}
				break;
			case "3": {

				System.out.println("Введіть назву товару, який хочете замінити");
				String oldName = sc.next();

				System.out.println("Введіть новий товар");
				String name = sc.next();
				System.out.println("Введіть довжину товару");
				int length = sc.nextInt();
				System.out.println("Введіть ширину товару");
				int width = sc.nextInt();
				System.out.println("Введіть вагу товару");
				int weight = sc.nextInt();

				System.out.println();
				System.out.println("До заміни товару ");
				for (Object object : commodityArray) {
					System.out.println(object);
				}
				Commodity.changeCommodity(commodityArray, oldName, name, length, width, weight);

				System.out.println();
				System.out.println("Після заміни товару ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

			}
				break;
			case "4": {

				System.out.println();
				System.out.println("До сортування за назвою ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

				Commodity.sortName(commodityArray);

				System.out.println();
				System.out.println("Після сортування за назвою ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

			}
				break;
			case "5": {

				System.out.println();
				System.out.println("До сортування за довжиною ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

				Commodity.sortLength(commodityArray);

				System.out.println();
				System.out.println("Після сортування за довжиною ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

			}
				break;
			case "6": {

				System.out.println();
				System.out.println("До сортування за шириною ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

				Commodity.sortWidth(commodityArray);

				System.out.println();
				System.out.println("Після сортування за шириною ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

			}
				break;
			case "7": {

				System.out.println();
				System.out.println("До сортування за вагою ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

				Commodity.sortWeight(commodityArray);

				System.out.println();
				System.out.println("Після сортування за вагою ");

				for (Object object : commodityArray) {
					System.out.println(object);
				}

			}
				break;
			case "8": {
				System.out.println("Введіть порядковий номер елемента");
				int index = sc.nextInt();

				System.out.println(commodityArray.get(index));

				break;

			}
			case "9" :{
                System.exit(1);
                break;
            }

			}

		}

	}

	public static void menu() {
		System.out.println("Введіть 1 щоб додати товар");
		System.out.println("Введіть 2 щоб видалити товар");
		System.out.println("Введіть 3 щоб замінити товар");
		System.out.println("Введіть 4 щоб відсортувати товари за назвою");
		System.out.println("Введіть 5 щоб відсортувати товари за довжиною");
		System.out.println("Введіть 6 щоб відсортувати товари за шириною");
		System.out.println("Введіть 7 щоб відсортувати товари за вагою");
		System.out.println("Введіть 8 щоб вивести товар за порядковим номером");
		System.out.println("Введіть 9 щоб вийти з програми");

	}
}
