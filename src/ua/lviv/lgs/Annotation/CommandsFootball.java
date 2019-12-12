package ua.lviv.lgs.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface CommandsFootball {

	String value() default "draw";

	int id() default 1;

	String description() default "no description";

}
