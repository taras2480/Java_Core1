package ua.lviv.lgs.Enum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws WrongInputConsoleParametersException {

		Scanner sc = new Scanner(System.in);

		ArrayList<Year> list1 = new ArrayList();

		list1.add(new Year("March", "Sprint", 31));
		list1.add(new Year("April", "Sprint", 30));
		list1.add(new Year("May", "Sprint", 31));
		list1.add(new Year("June", "Summer", 30));
		list1.add(new Year("Julay", "Summer", 31));
		list1.add(new Year("August", "Summer", 31));
		list1.add(new Year("September", "Autumn", 30));
		list1.add(new Year("October", "Autumn", 31));
		list1.add(new Year("November", "Autumn", 30));
		list1.add(new Year("December", "Winter", 31));
		list1.add(new Year("January", "Winter", 31));
		list1.add(new Year("February", "Winter", 28));

		ArrayList<Year> list2 = new ArrayList();
		list2.add(list1.get(0));
		list2.add(list1.get(3));
		list2.add(list1.get(6));
		list2.add(list1.get(9));

		while (true) {
			menu();
			switch (sc.next()) {
			/* counting input parametres */
			case "1": {
				System.out.println("Enter Month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(list1, month);

				if (!flag) {
					String message = "Month does not exist";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "2": {
				System.out.println("Enter Seasons");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();
				boolean flag = isSeasonPresent(list1, season);

				if (!flag) {
					String message = "Season does not exist";
					throw new WrongInputConsoleParametersException(message);
				}
				if (flag) {
					for (Year m : list1) {
						if (m.getSeason().equalsIgnoreCase(season)) {
							System.out.println(m.getMonth());
						}
					}
				}
				break;
			}

			case "3": {
				System.out.println("Enter Number of days per month");
				sc = new Scanner(System.in);
				Integer days = sc.nextInt();

				boolean flag = false;
				for (Year m : list1) {
					if (m.getDays().equals(days)) {

						flag = true;
					}
				}
				if (flag) {

					for (Year mft : list1) {
						if (mft.getDays().equals(days)) {
							System.out.println(mft.getMonth());
						}
					}
				}
				if (!flag) {
					String message = "Month does not exist";
					throw new WrongInputConsoleParametersException(message);
				}
				break;

			}
			case "4": {
				System.out.println("Enter number (if this number lower than q-ty days of month pls try again");
				sc = new Scanner(System.in);
				Integer days = sc.nextInt();

				boolean flag = false;
				for (Year mon : list1) {
					if (mon.getDays() < days) {
						System.out.println(mon.getMonth() + " " + mon.getDays());

					}

				}

				break;

			}
			case "5": {
				System.out.println("Enter number (if this number higher than q-ty days of month pls try again");
				sc = new Scanner(System.in);
				Integer days = sc.nextInt();

				boolean flag = false;
				for (Year mon : list1) {
					if (mon.getDays() > days) {
						System.out.println(mon.getMonth() + " " + mon.getDays());

					}

				}

				break;

			}
			case "6": {
				System.out.println("Enter Season");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(list2, season);

				if (flag) {

					for (Year seas : list2) {
						if (seas.getSeason().equalsIgnoreCase(season)) {

							if (list2.get(0).getSeason().equalsIgnoreCase(season)) {

								System.out.println(list2.get(1).getSeason());

							}
							if (list2.get(1).getSeason().equalsIgnoreCase(season)) {

								System.out.println(list2.get(2).getSeason());

							}
							if (list2.get(2).getSeason().equalsIgnoreCase(season)) {

								System.out.println(list2.get(3).getSeason());

							}
							if (list2.get(3).getSeason().equalsIgnoreCase(season)) {

								System.out.println(list2.get(0).getSeason());

							}

						}

					}

				}

				if (!flag) {
					String message = "Season does not exist";
					throw new WrongInputConsoleParametersException(message);
				}
				break;

			}
			case "7": {
				System.out.println("Enter Season");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(list2, season);
				String ind = list2.get(0).getSeason();

				if (flag) {

					for (Year seas : list2) {
						if (seas.getSeason().equalsIgnoreCase(season)) {

							if (list2.get(0).getSeason().equalsIgnoreCase(season)) {

								System.out.println(list2.get(3).getSeason());

							}
							if (list2.get(1).getSeason().equalsIgnoreCase(season)) {

								System.out.println(list2.get(0).getSeason());

							}
							if (list2.get(2).getSeason().equalsIgnoreCase(season)) {

								System.out.println(list2.get(1).getSeason());

							}
							if (list2.get(3).getSeason().equalsIgnoreCase(season)) {

								System.out.println(list2.get(2).getSeason());

							}

						}

					}

				}

				if (!flag) {
					String message = "Season does not exist";
					throw new WrongInputConsoleParametersException(message);
				}
				break;

			}
//
			case "8": {
				sc = new Scanner(System.in);

				for (Year mon : list1) {

					if (mon.getDays() % 2 == 0) {

						System.out.println(mon.getMonth() + " " + mon.getDays());

					}

				}

				break;

			}
			case "9": {
				sc = new Scanner(System.in);

				for (Year mon : list1) {

					if (mon.getDays() % 2 == 1) {

						System.out.println(mon.getMonth() + " " + mon.getDays());

					}

				}

				break;

			}
			case "10": {
				System.out.println("Enter Month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(list1, month);

				if (flag) {

					for (Year mnth : list1) {

						if (mnth.getMonth().equalsIgnoreCase(month)) {

							if (mnth.getDays() % 2 == 0) {

								System.out.println("The month has an even number of days");

							} else {
								System.out.println("The month has an odd number of days");
							}
						}
					}
				}
				if (!flag) {

					String message = "Month does not exist";
					throw new WrongInputConsoleParametersException(message);

				}

				break;

			}

			}
		}

	}

	/**
	 * @param input params users menu
	 * @author taras2409
	 */

	static void menu() {
		System.out.println("Натисніть 1, щоб перевірити чи такий місяць існує");
		System.out.println("Натисніть 2, щоб вивести всі місяці однієї пори року");
		System.out.println("Натисніть 3, щоб вивести всі місяці з одинаковою кількістю днів");
		System.out.println("Натисніть 4, щоб вивести місяці з найменшою кількістю днів");
		System.out.println("Натисніть 5, щоб вивести місяці з найбільшою кількістю днів");
		System.out.println("Натисніть 6 , щоб вивести наступну пору року");
		System.out.println("Натисніть 7 , щоб вивести попередню пору року");
		System.out.println("Натисніть 8 , щоб вивести місяці, які мають парну кількість днів");
		System.out.println("Натисніть 9 , щоб вивести місяці, які мають непарну кількість днів");
		System.out.println("Натисніть 10 і місяць ,щоб перевірити чи парна кількість днів в місяці");

	}

	private static boolean isMonthPresent(ArrayList<Year> list1, String month) {
		boolean flag = false;

		for (Year m : list1) {
			if (m.getMonth().equalsIgnoreCase(month)) {
				flag = true;
				System.out.println("Month exist");
			}
		}

		return flag;
	}

	private static boolean isSeasonPresent(ArrayList<Year> list1, String season) {
		boolean flag = false;

		for (Year m : list1) {
			if (m.getSeason().equalsIgnoreCase(season)) {
				flag = true;

			}

		}

		return flag;
	}

}
