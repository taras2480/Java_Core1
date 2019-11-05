package ua.lviv.lgs.avto;

public class Handlebar {
	
	private int diameter;
	private String material;
	public Handlebar(int diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Handlebar [diameter=" + diameter + ", material=" + material + "]";
	}
	
	
	

}
