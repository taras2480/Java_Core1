package ua.lviv.lgs.avto;

public class Avto {

	private String name;
	private Handlebar handlebar;
	private Engine engine;
	private int horsepower;
	private int madeOF;

	public Avto(String name, Handlebar handlebar, Engine engine, int horsepower, int madeOF) {
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

	public Handlebar getHandlebar() {
		return handlebar;
	}

	public void setHandlebar(Handlebar handlebar) {
		this.handlebar = handlebar;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
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
