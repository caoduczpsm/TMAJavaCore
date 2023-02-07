package animal_project;

public class Frog extends Animal {
	
	public Frog() {
		super();
	}
	
	public Frog(String name, String sex, int age){
		super(name, sex, age);
	}
	
	@Override
	public void sound() {
		System.out.print("ooo!!");
	}

}
