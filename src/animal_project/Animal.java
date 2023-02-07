package animal_project;

public abstract class Animal implements ISound{
	
	private String name, sex;
	private int age;
	
	public Animal() {
		
	}
	
	public Animal(Animal a) {
		this.age = a.age;
		this.name = a.name;
		this.sex = a.sex;
	}
	
	public Animal(String name, String sex, int age) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
