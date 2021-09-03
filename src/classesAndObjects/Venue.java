package classesAndObjects;

import java.util.Scanner;

import classesAndObjects.Player;

public class Venue {
	String name;
	String city;
	public Venue(String name,String city) {
		this.name=name;
		this.city=city;
	}
	public void VenueDetails(){
		System.out.println("venue details:");
		System.out.println("venue name:"+name);
		System.out.println("venue city"+city);
	}
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enbter  the venue name");
	String name=sc.nextLine();
	System.out.println("enbter  the player city");
	String  city=sc.nextLine();
	Venue obj=new Venue(name,city);
	obj.VenueDetails();

	
		
	}

}