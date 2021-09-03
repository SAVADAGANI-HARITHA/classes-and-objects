package classesAndObjects;
import java.util.Scanner;
public class InnigsClass {
	String Number;
	String battingTeam;
	 long runs;
	public InnigsClass(String Number,String battingTeam,long runs)
	 {
		 this.Number=Number;
		 this.battingTeam=battingTeam;
		 this.runs=runs;
	 }
	 void InngindDetials()
	 {
		 System.out.println(" innigs  number:"+Number);
		 System.out.println(" batting team:"+battingTeam);
		 System.out.println("runs:"+runs);
	 }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the innigs number ");
		String Number=sc.nextLine();
		System.out.println(" enter the  batting taem ");
		String battingTeam=sc.nextLine();
		System.out.println(" enter the runs scored ");
		long runs=sc.nextLong();
		InnigsClass obj= new InnigsClass(Number,battingTeam,runs);
		obj.InngindDetials(); 

	}

}