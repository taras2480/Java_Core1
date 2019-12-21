package ua.lviv.lgs.StreamVerRada;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
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
		Scanner sc = new Scanner(System.in);

		System.out.println("Для виключення депутата з фракції введіть його прізвище");
		String lastName = sc.next();

		Deputate dep = deputateArray.stream().filter(c->c.getLastName().equalsIgnoreCase(lastName)).findFirst().get();
		deputateArray.remove(dep);
		

	}

	public void allBribe() {

		deputateArray.stream().filter(Deputate::isBribeTaker).forEach(System.out::println);

	}

	public void maxBrider() {

		Deputate maxBrider = deputateArray.stream().filter(Deputate::isBribeTaker).max(Comparator.comparing(Deputate::getBribeSize))
				.orElseThrow(NoSuchElementException::new);

	}

	public void allDeputate() {

		deputateArray.forEach(System.out::println);

	}

	public void cleanFraction() {
		deputateArray.removeAll(deputateArray);
	}

	@Override
	public String toString() {
		return nameOfFraction;
	}

}
