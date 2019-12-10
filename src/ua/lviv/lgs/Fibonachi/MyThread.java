package ua.lviv.lgs.Fibonachi;

import java.util.Scanner;

public class MyThread extends Thread {
	
	

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть кількість елементів числа фібоначчі: ");
		

		int n0 = 1;
		int n1 = 1;
		int n2;
		int count = sc.nextInt();

		if (count == 1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(n0);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} else if (count == 2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(n0);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(" "+n1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(n0 + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(n1 + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (int i = 3; i <= count; i++) {

				n2 = n0 + n1;
				System.out.print(n2 + " ");
				n0 = n1;
				n1 = n2;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
