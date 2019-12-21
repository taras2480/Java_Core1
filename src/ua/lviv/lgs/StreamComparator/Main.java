package ua.lviv.lgs.StreamComparator;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<BestWorkerForYear> bwfy = new HashSet<>();

		bwfy.add(new BestWorkerForYear("Олексій Горб", 38));
		bwfy.add(new BestWorkerForYear("Яван Парко", 22));
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

		System.out.println("Друкуємо несортований список");
		bwfy.forEach(System.out::println);

		System.out.println();

		System.out.println("Сортування за ім'ям");
		bwfy.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(x -> System.out.println(x));
		
		System.out.println();

		System.out.println("Сортування за віком");
		

		System.out.println();
		bwfy.stream().sorted(new SortAge()).forEach(System.out::println);
		System.out.println();

		System.out.println("Сортування за всіма полями");
        bwfy.stream().sorted(new BestWorkerForYearAllFieldComparator()).forEach(System.out::println);
        
        

	}

}
