package ua.lviv.lgs.Int;

import java.util.Arrays;
import java.util.Random;

//Task 1

public class Main {

	public static void main(String[] args) {
		
		int [] integer={getRandomFromRange(1,1000),getRandomFromRange(1,1000),getRandomFromRange(1,1000),getRandomFromRange(1,1000),getRandomFromRange(1,1000),};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(integer));
		
		System.out.println("After sorting");
		Arrays.sort(integer);
		System.out.println(Arrays.toString(integer));

	}
	public static int getRandomFromRange(int min, int max) {

		if (min > max) {

			throw new IllegalArgumentException("nonsens");

		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;// 1-10

	}

}
