package ua.lviv.lgs.commodity;

import java.util.Comparator;

public class lenthComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return o1.getLenth() > o2.getLenth() ? 1 : -1;
	}

}
