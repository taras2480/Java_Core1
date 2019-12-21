package ua.lviv.lgs.StreamVerRada;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class VerRadaStream {

	private static final VerRadaStream verRada = new VerRadaStream();
	private static List<Fraction> fractionArray = new ArrayList<>();

	// for SigleTone
	private static volatile VerRadaStream instance;

	public static VerRadaStream getInstance() {
		VerRadaStream localInstance = instance;
		if (localInstance == null) {
			synchronized (VerRadaStream.class) {
				localInstance = instance;
				if (localInstance == null) {
					instance = localInstance = new VerRadaStream();
				}
			}
		}
		return localInstance;
	}

	private VerRadaStream() {
	}

	public static VerRadaStream getVerRada() {
		return verRada;
	}

	public void addNewFraction() {
		System.out.println("Введіть назву фракції");
		Scanner sc = new Scanner(System.in);
		String nameOfFraction = sc.next();

		Stream<String> fractionArray = Stream.of(nameOfFraction);

	}

	public void deleteFraction() {
		System.out.println("Введіть назву фракції, яку бажаєте видалити");
		Scanner sc = new Scanner(System.in);
		String nameOfFraction = sc.next();

		fractionArray.remove(nameOfFraction);

	}

	public void allFractions() {

		fractionArray.forEach(System.out::println);

	}

	public void findOutFraction() {
		System.out.println("Введіть назву фракції");
		Scanner sc = new Scanner(System.in);
		String nameOfFraction = sc.next();

		Optional<Fraction> fractionOne = fractionArray.stream()
				.filter(s -> s.getNameOfFraction().equals(nameOfFraction)).findFirst();

		if (fractionOne.isPresent()) {

			System.out.println(fractionOne.get().toString());
			fractionOne.get().allDeputate();

		}

	}

	public void addDeputateToFraction() {
		System.out.println("Введіть фракцію, в яку потрібно додати депутата");
		Scanner sc = new Scanner(System.in);
		String nameOfFraction = sc.next();

		Optional<Fraction> addDep = fractionArray.stream().filter(s -> s.getNameOfFraction().equals(nameOfFraction))
				.findFirst();

		if (addDep.isPresent()) {
			addDep.get().addDeputate();
		}
	}

	public void deleteDeputate() {
		System.out.println("Введіть фракцію,щоб видалити його з фракції");
		Scanner sc = new Scanner(System.in);
		String nameOfFraction = sc.next();

		Optional<Fraction> delDep = fractionArray.stream().filter(s -> s.getNameOfFraction().equals(nameOfFraction))
				.findFirst();

		if (delDep.isPresent()) {
			delDep.get().removeDeputate();
		}
	}

	public void showAllBribersFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String nameOfFraction = sc.next();

		Optional<Fraction> bribers = fractionArray.stream().filter(s -> s.getNameOfFraction().equals(nameOfFraction))
				.findFirst();

		if (bribers.isPresent()) {
			bribers.get().allBribe();
		}
	}

	public void maxBribersFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String nameOfFraction = sc.next();

		Optional<Fraction> maxBribers = fractionArray.stream().filter(s -> s.getNameOfFraction().equals(nameOfFraction))
				.findFirst();

		if (maxBribers.isPresent()) {
			maxBribers.get().maxBrider();
		}
	}

	public void showAllDeputateFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String nameOfFraction = sc.next();

		Optional<Fraction> allDep = fractionArray.stream().filter(s -> s.getNameOfFraction().equals(nameOfFraction))
				.findFirst();

		if (allDep.isPresent()) {

			allDep.get().allDeputate();

		}
	}

}
