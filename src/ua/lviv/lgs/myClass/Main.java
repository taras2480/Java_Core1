package ua.lviv.lgs.myClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<BestWorkerForYear> bwfy = new HashSet<>();

		bwfy.add(new BestWorkerForYear("Олексій Горб", 32));
		bwfy.add(new BestWorkerForYear("Іван Парко", 22));
		bwfy.add(new BestWorkerForYear("Олексій Горб", 35));
		bwfy.add(new BestWorkerForYear("Володимир Шеремет", 44));
		bwfy.add(new BestWorkerForYear("Олександр Поломар", 20));
		bwfy.add(new BestWorkerForYear("Катерина Марініна", 31));
		bwfy.add(new BestWorkerForYear("Олег Ковтало", 32));
		bwfy.add(new BestWorkerForYear("Василь Корж", 51));
		bwfy.add(new BestWorkerForYear("Січенко Анатолій", 25));
		bwfy.add(new BestWorkerForYear("Констянтин Величко", 20));
		bwfy.add(new BestWorkerForYear("Олексій Горб", 32));
		bwfy.add(new BestWorkerForYear("Борис Філ", 37));

		System.out.println("Unsorting:");
		System.out.println();

		for (BestWorkerForYear bestWorkerForYear : bwfy) {
			System.out.println(bestWorkerForYear);
		}
		
		TreeSet<BestWorkerForYear> bwfy1 = new TreeSet<>();
		bwfy1.addAll(bwfy);
		System.out.println();
		System.out.println("Sorting Comparable:");
		System.out.println();
		
		for (BestWorkerForYear bestWorkerForYear : bwfy1) {
			System.out.println(bestWorkerForYear);
		}
		
		System.out.println();
		System.out.println("Sorting Comparator:");
		System.out.println();
		
		TreeSet<BestWorkerForYear> bwfy2 = new TreeSet<>(new BestWorkerForYearAllFieldComparator());
		bwfy2.addAll(bwfy);
		for (BestWorkerForYear bestWorkerForYear : bwfy2) {
			System.out.println(bestWorkerForYear);
		}
		

	}

}
