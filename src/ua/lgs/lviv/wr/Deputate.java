package ua.lgs.lviv.wr;

import java.util.Scanner;

public class Deputate extends Human {

	private String firstName;
	private String lastName;
	private int age;
	private boolean bribeTaker;
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

	

	public void giveBribe(boolean bribeTaker) throws NonLessZeroException {

		if (!bribeTaker) {

			System.out.println(" Диво дивнеє! Цей депутат не бере хабарів");
		} else {
			System.out.println("Введіть суму, яку пропонуєте");
			Scanner sc = new Scanner(System.in);
			int bribeSize = sc.nextInt();

			if (bribeSize < 5000 && bribeSize > 100) {

				System.out.println("Депутат отримав хабар в розмірі:" + bribeSize);

			}

			else if (bribeSize >= 5000) {

				System.out.println("Міліція увязнила депутата за отримання хабаря в розмірі:" + bribeSize);
			} else {

				String message = "Депутат ніколи не буде в мінусі,працювати задарма чи за мізерію";
				throw new NonLessZeroException(message);
			}

		}

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

	public boolean isBribeTaker(boolean bribeTaker) {

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
	
	

}
