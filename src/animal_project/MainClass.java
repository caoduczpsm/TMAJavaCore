package animal_project;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<>();
		
		dogs.add(new Dog("DOGDOG", "male", 3));
		dogs.add(new Dog("AA", "male", 2));
		dogs.add(new Dog("BB", "female", 1));
		dogs.add(new Dog("QQ", "male", 5));
		dogs.add(new Dog("RR", "female", 2));
		
		int sumAgeOfDog = 0;
		for(Dog dog : dogs) {
			sumAgeOfDog = sumAgeOfDog + dog.getAge();
		}
		
		System.out.println("The average age of the dog is: " + (sumAgeOfDog/dogs.size()));
		
		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat("Tom", "male", 3));
		cats.add(new Cat("YY", "female", 2));
		cats.add(new Cat("XX", "female", 2));
		cats.add(new Cat("TT", "male", 5));
		cats.add(new Cat("LL", "male", 1));
		
		int sumAgeOfCat = 0;
		for(Cat cat : cats) {
			sumAgeOfCat = sumAgeOfCat + cat.getAge();
		}
		
		System.out.println("The average age of the cat is: " + (sumAgeOfCat/cats.size()));
		
		List<Frog> frogs = new ArrayList<>();
		frogs.add(new Frog("FOGFOG", "female", 4));
		frogs.add(new Frog("FF", "female", 1));
		frogs.add(new Frog("WW", "male", 3));
		frogs.add(new Frog("DD", "female", 4));
		frogs.add(new Frog("KK", "female", 2));
		
		int sumAgeOfFrog = 0;
		for(Frog frog : frogs) {
			sumAgeOfFrog = sumAgeOfFrog + frog.getAge();
		}
		
		System.out.println("The average age of the frog is: " + (sumAgeOfFrog/frogs.size()));
		
		List<Kitten> kittens = new ArrayList<>();
		kittens.add(new Kitten("FOGFOG", 4));
		kittens.add(new Kitten("FF", 1));
		kittens.add(new Kitten("WW", 3));
		kittens.add(new Kitten("DD", 4));
		kittens.add(new Kitten("KK", 2));
		
		int sumAgeOfKitten = 0;
		for(Kitten kitten : kittens) {
			sumAgeOfKitten = sumAgeOfKitten + kitten.getAge();
		}
		
		System.out.println("The average age of the kitten is: " + (sumAgeOfKitten/kittens.size()));
		
		List<Tomcat> tomcats = new ArrayList<>();
		tomcats.add(new Tomcat("FOGFOG", 1));
		tomcats.add(new Tomcat("FF", 1));
		tomcats.add(new Tomcat("WW", 2));
		tomcats.add(new Tomcat("DD", 2));
		tomcats.add(new Tomcat("KK", 1));
		
		int sumAgeOfTomcat = 0;
		for(Tomcat tomcat : tomcats) {
			sumAgeOfTomcat = sumAgeOfTomcat + tomcat.getAge();
		}
		
		System.out.println("The average age of the kitten is: " + (sumAgeOfTomcat/tomcats.size()));

	}

}
