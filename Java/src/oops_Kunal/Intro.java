package oops_Kunal;

import java.util.Arrays;

public class Intro {
    
	public static void main(String[] args) {
		Student[] stud = new Student[5];
		System.out.println(Arrays.toString(stud));
		
		Student kunal = new Student();
		Student akash = new Student( 2 , "akash"  , 78.5f);
		System.out.println(kunal.name);
		System.out.println(kunal.roll);
		System.out.println(kunal.marks);
		
	   Student jainam = new Student(akash);
	   System.out.println(jainam.marks);
	   System.out.println(jainam.roll);
	   System.out.println(jainam.name);
		
		
		
	}


}
class Student {
	int roll;
   String name ;
   float marks ;
   
   

Student(){
	this.roll = 18;
	this.name = "Kunal Khushwa";
	this.marks =68.5f;	
 }

Student(int roll , String name , float marks){
	this.roll = roll;
	this.name = name;
	this.marks = marks;	
 }

Student(Student other){
	this.name = other.name;
	this.marks = other.marks;
	this.roll = other.roll;
 }

}
