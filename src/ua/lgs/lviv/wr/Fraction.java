package ua.lgs.lviv.wr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

public class Fraction {

	private String nameOfFraction;

	private ArrayList<Deputate> deputateArray = new ArrayList<>();

	
	
	public Fraction() {
		
	}

	public Fraction(String nameOfFraction) {

		this.nameOfFraction = nameOfFraction;
	}

	public String getNameOfFraction() {
		return nameOfFraction;
	}

	public void setNameOfFraction(String nameOfFraction) {
		this.nameOfFraction = nameOfFraction;
	}

	public ArrayList<Deputate> getDeputateArray() {
		return deputateArray;
	}

	public void setDeputateArray(ArrayList<Deputate> deputateArray) {
		this.deputateArray = deputateArray;
	}

	public void addDeputate() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть вагу депутата");
		int weight = scanner.nextInt();

		System.out.println("Введіть ріст депутата");
		int height = scanner.nextInt();

		System.out.println("Чи вживає депутат алкоголь? (true, якщо так ; false, якщо ні)");
		boolean drinkAlcogol = scanner.nextBoolean();

		System.out.println("Введіть стать депутата");
		String sex = scanner.next();

		System.out.println("Введіть імя депутата");
		String firstName = scanner.next();

		System.out.println("Введіть прізвище депутата");
		String lastName = scanner.next();

		System.out.println("Введіть вік депутата");
		int age = scanner.nextInt();

		System.out.println("Введіть чи бере депутат хабарі (true, якщо так ; false, якщо ні)");
		boolean bribeTaker = scanner.nextBoolean();

		System.out.println("Введіть авто депутата");
		String avto = scanner.next();

		System.out.println("Введіть наручний годинник депутата");
		String wristwatch = scanner.next();

		Deputate deputate = new Deputate(weight, height, drinkAlcogol, sex, firstName, lastName, age, bribeTaker, avto,
				wristwatch);

		deputateArray.add(deputate);

	}

	public void removeDeputate() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Для виключення депутата з фракції введіть його прізвище");
		String LastName = scanner.next();

		System.out.println("Для виключення депутата з фракції введіть його імя");
		String FirstName = scanner.next();

		ListIterator<Deputate> deputateIterator = deputateArray.listIterator();

		while (deputateIterator.hasNext()) {
			if (FirstName.equals(deputateIterator.next().getLastName())) {
				deputateIterator.remove();
			} else {
				System.out.println("Невірні дані - спробуйте ще раз");
			}
		}
	}

	public void allBribe() {

		ListIterator<Deputate> deputateIterator = deputateArray.listIterator();

		while (deputateIterator.hasNext()) {
			Deputate tempDeputate = deputateIterator.next();
			if (tempDeputate.isBribeTaker(true)) {
				System.out.println(tempDeputate);
			}
		}
	}

	public Deputate maxBrider() {
		return Collections.max(deputateArray, new BribeComparator());
	}

	public void allDeputate() {

		System.out.println(deputateArray);

	}

	public void cleanFraction() {
		deputateArray.clear();
	}

	@Override
	public String toString() {
		return nameOfFraction;
	}

}
