package ua.lviv.lgs.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Zooclub {

	Map<Person, List<Animal>> map = new HashMap<>();

	public Zooclub() {

	}

	public Zooclub(Map<Person, List<Animal>> map) {
		super();
		this.map = map;
	}

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	public void addPerson() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть ім'я учасника");
		String name = sc.next();

		System.out.println("Введіть вік учасника");
		int age = sc.nextInt();

		map.put(new Person(name, age), new ArrayList<>());

	}

	public void addAnimal() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть ім'я учасника");
		String name = sc.next();

		System.out.println("Введіть вік учасника");
		String age = sc.next();

		System.out.println("Введіть вид тварини");
		String kind = sc.next();

		System.out.println("Введіть імя тварини");
		String nameAnimal = sc.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				next.getValue().add(new Animal(kind, nameAnimal));
			}
		}

	}

	public void removeAnimalOne() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть ім'я учасника");
		String name = sc.next();

		System.out.println("Введіть вид тварини");
		String kind = sc.next();

		System.out.println("Введіть імя тварини");
		String nameAnimal = sc.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {

			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {

				Iterator<Animal> iterator2 = next.getValue().iterator();
				while (iterator2.hasNext()) {
					if (iterator2.next().getName().equals(nameAnimal)) {
						iterator2.remove();
					}
				}
			}

		}
	}

	public void removePerson() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть ім'я учасника");
		String name = sc.next();

		System.out.println("Введіть вік учасника");
		int age = sc.nextInt();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {

			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {

				iterator.remove();
			}
		}

	}

	public void removeAnimalsAllOneKind() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть вид тварини");
		String kind = sc.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();

			Iterator<Animal> iterator2 = next.getValue().iterator();
			while (iterator2.hasNext()) {
				if (iterator2.next().getKind().equals(kind)) {
					iterator2.remove();
				}
			}

		}

	}

	public void showZoo() {

		
		System.out.println(map);

	}

}
