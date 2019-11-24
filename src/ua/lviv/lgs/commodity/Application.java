package ua.lviv.lgs.zoo;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Zooclub zoo = new Zooclub();

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				zoo.addPerson();
				break;

			}
			case "2": {

				zoo.addAnimal();
				break;

			}
			case "3": {

				zoo.removeAnimalOne();
				break;

			}
			case "4": {

				zoo.removePerson();
				break;

			}
			case "5": {

				zoo.removeAnimalsAllOneKind();
				break;
			}
			case "6": {

				zoo.showZoo();
				break;
			}
			case "7": {

				System.exit(1);
				break;
			}

			}
		}
	}

	public static void menu() {
		System.out.println("Введіть 1, щоб додати нового учасника клубу");
		System.out.println("Введіть 2, щоб додати тваринку до учасника клубу");
		System.out.println("Введіть 3, щоб видалити тваринку в учасника клубу");
		System.out.println("Введіть 4, щоб видалити учасника з клубу");
		System.out.println("Введіть 5, щоб видалити певний вид тварини");
		System.out.println("Введіть 6, щоб вивести весь зооклуб");
		System.out.println("Введіть 7, щоб вийти з програми");
	}

}
