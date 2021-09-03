package classesAndObjects;
import java.util.Scanner;
public class PlayerSplit {
	String name;
	String country;
	String skill;
	 PlayerSplit(String n,String c,String s)
	 {
		 this.  name=n;
		 this. country=c;
		 this. skill=s;
	 }    
	 void PlayerDetails()
	 {
		 System.out.println("plare details:");
		 System.out.println("player name :"+name);
		 System.out.println("player country:"+country);
		 System.out.println("player skill:"+skill);
		 
	 }

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter  plyer details");
		String str= sc.nextLine();
		String [] split=str.split(",");
		PlayerSplit obj1 = new PlayerSplit(split[0],split[1],split[2]);
		obj1.PlayerDetails();
	}

}