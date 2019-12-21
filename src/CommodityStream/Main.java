package CommodityStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Commodity> commodityArray = new ArrayList<>();

		commodityArray.add(new Commodity("Костюм", 54, 47, 13));
		commodityArray.add(new Commodity("Курткаl", 17, 42, 85));
		commodityArray.add(new Commodity("Азбука", 4, 345, 45));
		commodityArray.add(new Commodity("Чоботи", 42, 12, 66));
		commodityArray.add(new Commodity("Черевики", 84, 153, 32));

		while (true) {
			menu();

			switch (sc.next()) {

			case "1": {

				commodityArray.add(getNewCommodity());

			}

				break;
			case "2": {

				Scanner sс = new Scanner(System.in);
				String name;

				System.out.println("Введіть назву товару, який потрібно видалити");

				name = sс.next();
				Commodity commodity = commodityArray.stream().filter(c -> c.getName().equalsIgnoreCase(name))
						.findFirst().get();
				commodityArray.remove(commodity);

			}
				break;

			case "3": {

				System.out.println("Введіть назву товару, який хочете замінити");
				String oldName = sc.next();

				Commodity commodity = commodityArray.stream().filter(c -> c.getName().equalsIgnoreCase(oldName))
						.findFirst().get();
				commodityArray.remove(commodity);
				commodityArray.add(getNewCommodity());

				break;

			}

			case "4": {

				commodityArray.stream().sorted(Comparator.comparing(Commodity::getName)).forEach(System.out::println);

				break;
			}

			case "5": {

				commodityArray.stream().sorted(Comparator.comparingInt(Commodity::getLenght))
						.forEach(System.out::println);
				break;

			}

			case "6": {

				commodityArray.stream().sorted(Comparator.comparingInt(Commodity::getWidth))
						.forEach(System.out::println);
				break;

			}

			case "7": {

				commodityArray.stream().sorted(Comparator.comparingInt(Commodity::getWeight))
						.forEach(System.out::println);
				break;

			}

			case "8": {

				System.out.println("Введіть порядковий номер товару");
				int index = sc.nextInt();

				System.out.println(commodityArray.get(index));
				break;

			}
			case "9": {
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

	private static Commodity getNewCommodity() {
		String name;
		int width;
		int length;
		int weight;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть назву товару");
		name = sc.nextLine();
		System.out.println("Введіть довжину товару");
		width = sc.nextInt();
		System.out.println("Введіть ширину товару");
		length = sc.nextInt();
		System.out.println("Введіть вагу товару");
		weight = sc.nextInt();

		return new Commodity(name, width, length, weight);
	}

}
