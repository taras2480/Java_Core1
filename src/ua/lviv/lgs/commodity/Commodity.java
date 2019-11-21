package ua.lviv.lgs.commodity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Commodity {

	private String name;
	private int lenth;
	private int width;
	private int weight;

	public Commodity(String name, int lenth, int width, int weight) {

		this.name = name;
		this.lenth = lenth;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLenth() {
		return lenth;
	}

	public void setLenth(int lenth) {
		this.lenth = lenth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", lenth=" + lenth + ", width=" + width + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lenth;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (lenth != other.lenth)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	public static void addCommodity(ArrayList<Commodity> commodityArray, String name, int length, int width,
			int weight) {
		commodityArray.add(new Commodity(name, length, width, weight));
	}

	public static void removeCommodity(ArrayList<Commodity> commodityArray, String name) {
		Iterator<Commodity> iterator = commodityArray.iterator();
		while (iterator.hasNext()) {
			Commodity tempCommodity = iterator.next();
			if (tempCommodity.getName().equals(name)) {
				iterator.remove();
			}
		}
	}

	public static void changeCommodity(ArrayList<Commodity> commodityArray, String oldName, String name, int length,
			int width, int weight) {
		ListIterator<Commodity> iterator = commodityArray.listIterator();
		while (iterator.hasNext()) {
			Commodity tempCommodity = iterator.next();
			if (tempCommodity.getName().equals(oldName)) {
				iterator.set(new Commodity(name, length, width, weight));
			}
		}
	}

	public static void sortName(ArrayList<Commodity> commodityArray) {
		commodityArray.sort(new NameComparator());
	}

	public static void sortLength(ArrayList<Commodity> commodityArray) {
		commodityArray.sort(new lenthComparator());
	}

	public static void sortWidth(ArrayList<Commodity> commodityArray) {
		commodityArray.sort(new widthComparator());
	}

	public static void sortWeight(ArrayList<Commodity> commodityArray) {
		commodityArray.sort(new weightComparator());
	}

}
