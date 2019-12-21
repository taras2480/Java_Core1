package ua.lviv.lgs.StreamComparator;

import java.util.Comparator;

public class SortAge implements Comparator<BestWorkerForYear>{

	@Override
	public int compare(BestWorkerForYear o1, BestWorkerForYear o2) {
		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else if (o1.getAge() < o2.getAge()) {
			return -1;
		}
		return 0;
	}

}
