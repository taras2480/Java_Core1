package ua.lviv.lgs.Fibonachi;

import java.util.ArrayList;
import java.util.Scanner;

public class RunnableThread implements Runnable {

	private ArrayList<Integer> arrlist;

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть кількість елементів числа фібоначчі: ");
		arrlist = new ArrayList<Integer>();

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
			System.out.println(" "+n1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		else {
			arrlist.add(n0);
			arrlist.add(n1);
			for (int i = 3; i <= count; i++) {
				n2 = n0 + n1;

				arrlist.add(n2);
				n0 = n1;
				n1 = n2;
			}

		}
		for (int i=arrlist.size()-1;i>=0;i--) 
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(arrlist.get(i));
			
			
		}

	}

}
