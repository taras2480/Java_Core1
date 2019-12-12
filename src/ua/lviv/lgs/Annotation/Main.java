package ua.lviv.lgs.Annotation;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {

		getBet(BetFootball.class);

	}

	public static void getBet(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(CommandsFootball.class) instanceof CommandsFootball) {

				System.out.println(field.getName());

				System.out.println("result: " + field.getAnnotation(CommandsFootball.class).value());
				System.out.println("id: " + field.getAnnotation(CommandsFootball.class).id());
				System.out.println("description: " + field.getAnnotation(CommandsFootball.class).description());

			}
		}

	}

}
