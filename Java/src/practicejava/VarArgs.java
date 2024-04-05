package practicejava;

import java.util.Arrays;
import java.util.Objects;

public class VarArgs {
   
    
	public static void main(String[] args) {
		
		Person p = new Person("Raj", 12, 'M');
		
		Person p1 = new Person("Raj", 12, 'M');
		
		Person p3 = new Person();
		p3.setName("asda");
		p3.setAge(12);
		//p3.setGender('X');
		
		p3.gender = 'X';
		//System.out.println(p);
	}
}

class Person {
	
	String name;
	int age;
	 char gender;
	
	
	
	
	
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if(gender == 'M' || gender == 'F')
		this.gender = gender;
		else
			System.out.println("Invalid input " + gender);
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}