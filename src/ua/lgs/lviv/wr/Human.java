package ua.lgs.lviv.wr;

public class Human {

	private int weight;
	private int height;
	private boolean drinkAlcogol;
	private String sex;
	public Human(int weight, int height, boolean drinkAlcogol, String sex) {
		super();
		this.weight = weight;
		this.height = height;
		this.drinkAlcogol = drinkAlcogol;
		this.sex = sex;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isDrinkAlcogol() {
		return drinkAlcogol;
	}
	public void setDrinkAlcogol(boolean drinkAlcogol) {
		this.drinkAlcogol = drinkAlcogol;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
