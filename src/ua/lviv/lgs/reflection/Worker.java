package ua.lviv.lgs.reflection;

public class Worker extends Person implements HumanResourcesDepartmentInterfaces{
	
	private int salary;
	private int premium;
	public String lastaName;
	public String firstName;
	public String position;
	
	public Worker() {
		
	}

	public Worker(int salary, int premium, String lastaName, String firstName, String position) {
		super();
		this.salary = salary;
		this.premium = premium;
		this.lastaName = lastaName;
		this.firstName = firstName;
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public String getLastaName() {
		return lastaName;
	}

	public void setLastaName(String lastaName)  {
		this.lastaName = lastaName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	private void myMethod(String st, int in) {
		st="myMethod";
		in=1;
		System.out.println(st+" "+in);
		
		
	}

	private void myMethod1(String st) {
		st="This method is for reflection";
		System.out.println(st);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastaName == null) ? 0 : lastaName.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + premium;
		result = prime * result + salary;
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
		Worker other = (Worker) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastaName == null) {
			if (other.lastaName != null)
				return false;
		} else if (!lastaName.equals(other.lastaName))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (premium != other.premium)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Worker [salary=" + salary + ", premium=" + premium + ", lastaName=" + lastaName + ", firstName="
				+ firstName + ", position=" + position + "]";
	}
	
	
	
	
	
	
	
	

}
