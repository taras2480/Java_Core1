package ua.lviv.lgs.ReloadLamda;

public class Rectangle1 {

	private int longside;
	private int shortside;
	private double diagonal;

	public Rectangle1() {

	}

	public Rectangle1(int longside, int shortside) {

		this.longside = longside;
		this.shortside = shortside;
	}

	public Rectangle1(int longside, int shortside, double diagonal) {

		this(longside, shortside);

		this.diagonal = diagonal;
	}

	@Override
	public String toString() {
		return "Rectangle1 [longside=" + longside + ", shortside=" + shortside + ", diagonal=" + diagonal + "]";
	}

}
