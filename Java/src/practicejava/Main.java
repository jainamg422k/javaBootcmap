package practicejava;

import java.util.Scanner;

public class Main {
	public static void maxInt(int [] arr , int n) {
        int position = 0;
		int max =  Integer.MIN_VALUE;
		for(int i =0; i< n; i++) {
			if(max < arr[i]) {
				max = arr[i];
				position  = i;
			}
		}
		System.out.println(max + " "+ position);
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		  int [] arr = new int[5];
//		   int n = arr.length;
//		  for(int i = 0; i< n; i++) {
//			  arr[i] = sc.nextInt();
//		  }
//         maxInt(arr , n);
		
		
//		Specialist d = new Specialist(0, "raj", "asda", "special");
//		System.out.println(d);
		
		for(int i = 0 ; i<26 ;i++) {
			char ch= (char) ('a'+i);
			System.out.println(ch + "  is at " +i);
		}
	}

}


class Doctor {
	int id;
	String name;
	String location;
	
	public Doctor(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

//	@Override
//	public String toString() {
//		return "Doctor [id=" + id + ", name=" + name + ", location=" + location + "]";
//	}
	
	
	
}

class Specialist extends Doctor {
	
	String special;

	public Specialist(int id, String name, String location, String special) {
		super(id, name, location);
		this.special = special;
	}

//	@Override
//	public String toString() {
//		return "Specialist [special=" + special + "]";
//	}
	
	
	
}