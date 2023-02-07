package animal_project;

public class Dog extends Animal{
	
	public Dog() {
		super();
	}
	
	public Dog(String name, String sex, int age){
		super(name, sex, age);
	}

	@Override
	public void sound() {
		System.out.print("woof");
	}


}
