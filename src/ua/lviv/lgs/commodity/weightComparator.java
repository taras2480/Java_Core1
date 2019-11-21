package ua.lviv.lgs.commodity;

import java.util.Comparator;

public class weightComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return o1.getWeight() > o2.getWeight() ? 1 : -1;
	}

}
