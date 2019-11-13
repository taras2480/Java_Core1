package ua.lviv.lgs.avto;

public class Avto2 {

	private String name;
	private Handlebar2 handlebar;
	private Engine2 engine;
	private int horsepower;
	private int madeOF;

	public Avto2(String name, Handlebar2 handlebar, Engine2 engine, int horsepower, int madeOF) {
		super();
		this.name = name;
		this.handlebar = handlebar;
		this.engine = engine;
		this.horsepower = horsepower;
		this.madeOF = madeOF;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Handlebar2 getHandlebar() {
		return handlebar;
	}

	public void setHandlebar(Handlebar2 handlebar) {
		this.handlebar = handlebar;
	}

	public Engine2 getEngine() {
		return engine;
	}

	public void setEngine(Engine2 engine) {
		this.engine = engine;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getMadeOF() {
		return madeOF;
	}

	public void setMadeOF(int madeOF) {
		this.madeOF = madeOF;
	}

	@Override
	public String toString() {
		return "Avto [name=" + name +" has " + handlebar + ", engine=" + engine + ", horsepower=" + horsepower
				+ ", madeOF=" + madeOF + "]";
	}

	

}
