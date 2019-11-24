package ua.lviv.lgs.zoo;

public class Animal {
	
	private String kind;
	private String nameAnimal;
	
	public Animal(String kind, String nameAnimal) {
		super();
		this.kind = kind;
		this.nameAnimal = nameAnimal;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return nameAnimal;
	}

	public void setName(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result + ((nameAnimal == null) ? 0 : nameAnimal.hashCode());
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
		Animal other = (Animal) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		if (nameAnimal == null) {
			if (other.nameAnimal != null)
				return false;
		} else if (!nameAnimal.equals(other.nameAnimal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [kind=" + kind + ", nameAnimal=" + nameAnimal + "]";
	}
	
	
	

}
