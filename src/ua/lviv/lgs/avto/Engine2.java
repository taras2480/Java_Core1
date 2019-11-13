package ua.lviv.lgs.avto;

public class Engine2 {
	
	private int qtyСylinder;

	public Engine2(int qtyСylinder) {
		super();
		this.qtyСylinder = qtyСylinder;
	}

	public int getQtyСylinder() {
		return qtyСylinder;
	}

	public void setQtyСylinder(int qtyСylinder) {
		this.qtyСylinder = qtyСylinder;
	}

	@Override
	public String toString() {
		return "Engine [qtyСylinder=" + qtyСylinder + "]";
	}
	
	
	

}
