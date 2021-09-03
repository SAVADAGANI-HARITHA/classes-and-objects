package classesAndObjects;
import java.util.Scanner;
public class Player {
			String name;
			String country;
			String skill;
			public Player(String name,String country,String skill) {
				this.name=name;
				this.country=country;
				this.skill=skill;
			}
			public void PlayerDetails()
			{
				System.out.println("Player Details:");
				System.out.println("player name:" +name);
				System.out.println("Player country:"+country);
				System.out.println(  "skill:"+skill);
			}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enbter  the player name");
			String name=sc.nextLine();
			System.out.println("enbter  the player country");
			String  country=sc.nextLine();
			System.out.println("enbter  the player skill");
			String skill=sc.nextLine();
			Player obj=new Player(name,country,skill);
			obj.PlayerDetails();
	}
	

}