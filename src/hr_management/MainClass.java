package hr_management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {


	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("A", "Nguyen", 3));
		students.add(new Student("E", "Tran", 3));
		students.add(new Student("D", "Le", 3));
		students.add(new Student("Q", "Quach", 3));
		students.add(new Student("H", "Ly", 3));
		students.add(new Student("T", "Nguyen", 3));
		students.add(new Student("P", "Ong", 3));
		students.add(new Student("B", "Cao", 3));
		students.add(new Student("U", "Nguyen", 3));
		students.add(new Student("O", "Ly", 3));
		
		Collections.sort(students, new Comparator<Student>(){
            public int compare(Student s1,Student s2){
            	if(s1.getGrade() > s2.getGrade())
            		return -1;
            	else if(s1.getGrade() < s2.getGrade())
            		return 1;
            	else return 0;
				
            }});
		
		//System.out.println(students.toString());
		
		List<Worker> workers = new ArrayList<>();
		workers.add(new Worker("T", "Tran", 17, 1));
		workers.add(new Worker("C", "Tran", 90, 2));
		workers.add(new Worker("E", "Ly", 30, 5));
		workers.add(new Worker("Q", "Le", 43, 4));
		workers.add(new Worker("P", "Lam", 12, 1));
		workers.add(new Worker("I", "Tran", 65, 7));
		workers.add(new Worker("W", "Phan", 66, 2));
		workers.add(new Worker("O", "Lam", 87, 1));
		workers.add(new Worker("S", "Nguyen", 77, 2));
		workers.add(new Worker("T", "Nguyen", 22, 1));
		
		Collections.sort(workers, new Comparator<Worker>(){
            public int compare(Worker w1,Worker w2){
            	if(w1.moneyPerHour() > w1.moneyPerHour())
            		return 1;
            	else if(w1.moneyPerHour() < w1.moneyPerHour())
            		return -1;
            	else return 0;
				
            }});
		
		//System.out.println(workers.toString());
		
		List<Human> humans = new ArrayList<>();
		humans.addAll(students);
		humans.addAll(workers);
		
		Collections.sort(humans, new Comparator<Human>(){
            public int compare(Human h1, Human h2){
            	if(h1.getSurname().compareTo(h2.getSurname()) > 0) {
            		return 1;
            	} else if (h1.getSurname().compareTo(h2.getSurname()) < 0) {
            		return -1;
            	} else {
            		if(h1.getName().compareTo(h2.getName()) > 0) {
            			return 1;
            		} else if(h1.getName().compareTo(h2.getName()) < 0) {
            			return -1;
            		} else return 0;
            	}
				
            }});
		
		for(Human human : humans) {
			System.out.println(human.toString());
		}
	}

}
