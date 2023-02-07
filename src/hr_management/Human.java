package hr_management;

public abstract class Human {

	private String name, surname;
	
	public Human() {
		
	}
	
	public Human(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Human(Human human) {
		this.name = human.name;
		this.surname = human.surname;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
