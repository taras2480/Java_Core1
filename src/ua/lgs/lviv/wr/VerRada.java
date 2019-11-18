package ua.lgs.lviv.wr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class VerRada {

	private static final VerRada verRada = new VerRada();
	private static ArrayList<Fraction> fractionArray = new ArrayList<>();

	private VerRada() {
	}

	public static VerRada getVerRada() {
		return verRada;
	}	

	public static ArrayList<Fraction> getFractionArray() {
		return fractionArray;
	}

	public void addNewFraction() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String nameOfFraction = scanner.next();
		getFractionArray().add(new Fraction(nameOfFraction));
	}

	public void deleteFraction() {
		System.out.println("Введіть назву фракції, яку бажаєте видалити");
		Scanner scanner = new Scanner(System.in);
		String nameOfFraction = scanner.next();

		Iterator<Fraction> fractionDel = getFractionArray().iterator();

		while (fractionDel.hasNext()) {
			Fraction tempFraction = fractionDel.next();
			if (tempFraction.getNameOfFraction().equals(nameOfFraction)) {
				fractionDel.remove();
			}
		}
	}

	public void allFractions() {

		System.out.println(fractionArray);
//		Iterator<Fraction> fractionIterator = getFractionArray().iterator();
//
//		while (fractionIterator.hasNext()) {
//			System.out.println(fractionIterator.next());
//		}
	
	}
	public void findOutFraction() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String nameOfFraction = scanner.next();
		Iterator<Fraction> fractionFind = getFractionArray().iterator();
		while (fractionFind.hasNext()) {
			Fraction tempFraction = fractionFind.next();
			if (tempFraction.getNameOfFraction().equals(nameOfFraction)) {
				System.out.println(nameOfFraction);
			}
		}
	}

	public void addDeputateToFraction() {
		System.out.println("Введіть фракцію, в яку потрібно додати депутата");
		Scanner scanner = new Scanner(System.in);
		String nameOfFraction = scanner.next();

		Iterator<Fraction> fractionAddDep = getFractionArray().iterator();

		while (fractionAddDep.hasNext()) {
			Fraction tempFraction = fractionAddDep.next();
			if (tempFraction.getNameOfFraction().equals(nameOfFraction)) {
				tempFraction.addDeputate();
			}
		}
	}

	public void deleteDeputate() {
		System.out.println("Введіть фракцію,щоб видалити його з фракції");
		Scanner scanner = new Scanner(System.in);
		String nameOfFraction = scanner.next();

		Iterator<Fraction> fractionDelDep = getFractionArray().iterator();

		while (fractionDelDep.hasNext()) {
			Fraction tempFraction = fractionDelDep.next();
			if (tempFraction.getNameOfFraction().equals(nameOfFraction)) {
				tempFraction.removeDeputate();
			}
		}
	}

	public void showAllBribersFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String nameOfFraction = scanner.next();

		Iterator<Fraction> briberIteratorShow = getFractionArray().iterator();

		while (briberIteratorShow.hasNext()) {
			Fraction tempFraction = briberIteratorShow.next();
			if (tempFraction.getNameOfFraction().equals(nameOfFraction)) {
				tempFraction.allBribe();
			}
		}
	}

	public void maxBribersFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String nameOfFraction = scanner.next();

		Iterator<Fraction> briberIteratorMax = getFractionArray().iterator();

		while (briberIteratorMax.hasNext()) {
			Fraction tempFraction = briberIteratorMax.next();
			if (tempFraction.getNameOfFraction().equals(nameOfFraction)) {
				tempFraction.maxBrider();
			}
		}
	}

	public void showAllDeputateFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції");
		String nameOfFraction = scanner.next();

		Iterator<Fraction> allDeputate = getFractionArray().iterator();

		while (allDeputate.hasNext()) {
			Fraction tempFraction = allDeputate.next();
			if (tempFraction.getNameOfFraction().equals(nameOfFraction)) {
				tempFraction.allDeputate();
			}
		}
	}

}
