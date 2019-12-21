package ua.lviv.lgs.StreamVerRada;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Deputate extends Human {

	private String firstName;
	private String lastName;
	private int age;
	private boolean bribeTaker = false;
	private int bribeSize;
	private String avto;
	private String wristwatch;

	public Deputate(int weight, int height, boolean drinkAlcogol, String sex, String firstName, String lastName,
			int age, boolean bribeTaker, String avto, String wristwatch) {
		super(weight, height, drinkAlcogol, sex);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.bribeTaker = bribeTaker;

		this.avto = avto;
		this.wristwatch = wristwatch;
	}

	public Deputate(int weight, int height, boolean drinkAlcogol, String sex, List<Boolean> deputies) {
		super(weight, height, drinkAlcogol, sex);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	public String getAvto() {
		return avto;
	}

	public void setAvto(String avto) {
		this.avto = avto;
	}

	public String getWristwatch() {
		return wristwatch;
	}

	public void setWristwatch(String wristwatch) {
		this.wristwatch = wristwatch;
	}

	@Override
	public String toString() {
		return "Deputate [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", bribeTaker="
				+ bribeTaker + ", bribeSize=" + bribeSize + ", avto=" + avto + ", wristwatch=" + wristwatch + "]";
	}

	public void giveBribe() {

		if (bribeTaker) {

			System.out.println(" Диво дивнеє! Цей депутат не бере хабарів");
		} else {
			System.out.println("Введіть суму, яку пропонуєте");
			Scanner sc = new Scanner(System.in);
			int bribeSize = sc.nextInt();

			Consumer<Integer> function = (Integer bs) -> System.out
					.println(((bs < 5000) || (bs >= 5000)) ? "Депутат отримав хабар в розмірі:" + bribeSize
							: "Міліція увязнила депутата за отримання хабаря в розмірі:" + bribeSize);

			function.accept(bribeSize);

		}

	}
}
