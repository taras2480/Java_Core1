package ua.lviv.lgs.ReloadLamda;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {

		Rectangle1 rectangle = new Rectangle1(5, 8, 14);
		Consumer<Rectangle1> consumer = x -> System.out.println(x.toString());
		consumer.accept(rectangle);

	}

}
