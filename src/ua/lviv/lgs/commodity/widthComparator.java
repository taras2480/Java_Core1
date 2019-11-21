package ua.lviv.lgs.commodity;

import java.util.Comparator;

public class widthComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return o1.getWidth() > o2.getWidth() ? 1 : -1;
	}
	
	
	

}
