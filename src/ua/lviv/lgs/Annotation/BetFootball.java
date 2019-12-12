package ua.lviv.lgs.Annotation;

public class BetFootball {

	private String teamHome;
	private String teamGuest;

	@CommandsFootball(description = "written: id1-coeff for win home team, id2-coeff for win guest team,id0 - coeff for draw")
	private double coefficient;

	@CommandsFootball(description = "can be next value - id=0 - draw (default), id=1 - win home team, id=2 - win guest team")
	private String result;

	public BetFootball() {

	}

	public BetFootball(String teamHome, String guestTeam, double coefficient, String resault) {
		super();
		this.teamHome = teamHome;
		this.teamGuest = teamGuest;
		this.coefficient = coefficient;
		this.result = resault;
	}

	public String getTeamHome() {
		return teamHome;
	}

	public void setTeamHome(String teamHome) {
		this.teamHome = teamHome;
	}

	public String getGuestHome() {
		return teamGuest;
	}

	public void setGuestHome(String guestHome) {
		this.teamGuest = guestHome;
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public String getResault() {
		return result;
	}

	public void setResault(String resault) {
		this.result = resault;
	}

	@Override
	public String toString() {
		return "BetFootball [teamHome=" + teamHome + ", guestHome=" + teamGuest + ", coefficient=" + coefficient
				+ ", result=" + result + "]";
	}

}
