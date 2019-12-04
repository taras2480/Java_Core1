package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class ListString {
	
	
	List<Integer> arrList= new ArrayList<Integer>();

	
	
	
	public ListString() {
		super();
	}

	public ListString(List<Integer> arrList) {
		super();
		this.arrList = arrList;
	}

	//Геттер робимо RawTypes - в середині класу інформація про тип не зберігається і 
	//відповідно getArrList автоматично стає <Object>, прошу поправити, якщо невірно пояснив
	public List getArrList() {
		return arrList;
	}

	public void setArrList(List<Integer> arrList) {
		this.arrList = arrList;
	}

	@Override
	public String toString() {
		return "ListString [arrList=" + arrList + "]";
	}
	
	
	
	

	
	
	
	
	
	

	

}
