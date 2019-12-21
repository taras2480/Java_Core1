package ua.lviv.lgs.StreamVerRada;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				VerRadaStream.getVerRada().addNewFraction();

			}
				break;

			case "2": {
				VerRadaStream.getVerRada().deleteFraction();

			}
				break;

			case "3": {
				VerRadaStream.getVerRada().allFractions();

			}
				break;

			case "4": {
				System.out.println("Введіть фракцію");

				VerRadaStream.getInstance().deleteDeputate();

				break;
			}

			case "5": {
				VerRadaStream.getVerRada().findOutFraction();

			}
				break;

			case "6": {
				VerRadaStream.getVerRada().addDeputateToFraction();

			}
				break;

			case "7": {
				VerRadaStream.getVerRada().deleteDeputate();

			}
				break;

			case "8": {
				VerRadaStream.getVerRada().showAllBribersFraction();

			}
			case "9": {
				ArrayList<Deputate> maxBriberAll = new ArrayList<>();

				VerRadaStream.getVerRada().maxBribersFraction();
				break;

			}

			}

		}

	}

	public static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарник");

	}

}
