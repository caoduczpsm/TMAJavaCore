package animal_project;

public class Cat extends Animal{
	

	public Cat() {
		super();
	}
	
	public Cat(String name, String sex, int age){
		super(name, sex, age);
	}
	
	@Override
	public void sound() {
		System.out.print("meow");
	}

}
