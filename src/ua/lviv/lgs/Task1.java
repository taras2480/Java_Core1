package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
	public static void main(String args[]) {

		ListString ls = new ListString();

		
		//Геттер робимо RawTypes - в середині класу інформація про тип не зберігається і 
		//відповідно getArrList автоматично стає <Object> прошу поправити, якщо невірно пояснив
		ls.getArrList().add(5);
		ls.getArrList().add(18);
		ls.getArrList().add("5");
		ls.getArrList().add("type erasure");

		System.out.println(ls);

	}

}