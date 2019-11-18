package ua.lgs.lviv.wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NonLessZeroException {

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				VerRada.getVerRada().addNewFraction();

			}
				break;

			case "2": {
				VerRada.getVerRada().deleteFraction();

			}
				break;

			case "3": {
				VerRada.getVerRada().allFractions();

			}
				break;

			case "4": {
				System.out.println("Введіть фракцію");
				Fraction fr = new Fraction();
				String nameOfFraction = sc.next();

				ListIterator<Fraction> fractionIterator = VerRada.getFractionArray().listIterator();

				while (fractionIterator.hasNext()) {
					Fraction tempFraction = fractionIterator.next();
					if (tempFraction.getNameOfFraction().equals(nameOfFraction)) {
						fr.cleanFraction();
					}
				}
				break;
			}

			case "5": {
				VerRada.getVerRada().findOutFraction();

			}
				break;

			case "6": {
				VerRada.getVerRada().addDeputateToFraction();

			}
				break;

			case "7": {
				VerRada.getVerRada().deleteDeputate();

			}
				break;

			case "8": {
				ListIterator<Fraction> fractionIterator = VerRada.getFractionArray().listIterator();
				while (fractionIterator.hasNext()) {
					Fraction tempFraction = fractionIterator.next();
					tempFraction.allBribe();
				}
				break;

			}
			case "9": {
				ArrayList<Deputate> maxBriberAll = new ArrayList<>();

				ListIterator<Fraction> fractionIterator = VerRada.getFractionArray().listIterator();
				while (fractionIterator.hasNext()) {
					Fraction tempFraction = fractionIterator.next();
					maxBriberAll.add(tempFraction.maxBrider());
				}

				System.out.println(Collections.max(maxBriberAll, new BribeComparator()));
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
