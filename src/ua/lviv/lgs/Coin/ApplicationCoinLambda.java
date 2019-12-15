package ua.lviv.lgs.Coin;


import java.util.Scanner;
import java.util.function.BiConsumer;



public class ApplicationCoinLambda {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		//Кількість обертів монети в повітрі
		int turns;

		BiConsumer<Integer, Boolean> function = (Integer trn, Boolean hd) -> System.out
				.println(((trn % 2 < 1 & hd == true) || (trn % 2 > 0 & hd == false)) ? "you win" : "you lose");

		while (true) {

			System.out.println("Введіть кількість оборотів, скільки монета повинна зробити  в повітрі");
			turns = sc.nextInt();

			//початкова позиція монети - приймає випадкове значення орел або копійка
			boolean head = Math.random() > 0.5;

			function.accept(turns, head);

		}

	}

}
