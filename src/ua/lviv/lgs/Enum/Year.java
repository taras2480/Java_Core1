package ua.lviv.lgs.Enum;

public class Year {
	
	private String month;
	private String season;
	private Integer days;
	public Year(String month, String season, Integer days) {
		super();
		this.month = month;
		this.season = season;
		this.days = days;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "Year [month=" + month + ", season=" + season + ", days=" + days + "]";
	}
	
	
	
	
	

}
