package ua.lgs.lviv.wr;

import java.util.Comparator;

public class BribeComparator implements Comparator<Deputate> {

	@Override
	public int compare(Deputate o1, Deputate o2) {

		return o1.getBribeSize() > o2.getBribeSize() ? 1 : -1;
	}

}
