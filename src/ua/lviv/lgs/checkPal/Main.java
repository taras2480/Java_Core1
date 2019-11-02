package ua.lviv.lgs.checkPal;

public class Main {

	public static void main(String[] args) throws NonFiveLessons {

		String word = new String("ddddd");
		word = word.toUpperCase();

		if ((word.length() == 5) && (word.charAt(0) == word.charAt(4)) && (word.charAt(1) == word.charAt(3))) {

			System.out.println("This is Palindrom");

		} else if ((word.length() == 5) && ((word.charAt(0) != word.charAt(4)) || (word.charAt(1) != word.charAt(3)))) {
			System.out.println("This is not Palindrom");

		} else {

			String message = "Not 5 letters";
			throw new NonFiveLessons(message);

		}

	}

}
