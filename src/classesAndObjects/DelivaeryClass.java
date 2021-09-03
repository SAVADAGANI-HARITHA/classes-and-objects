package classesAndObjects;
import java.util.Scanner;
public class DelivaeryClass {
	 long over;
	 long ball;
	 long runs;
	 String batsman;
	 String bowler;
	 String  nonstriker;
	 public DelivaeryClass(	 long over,	 long ball,	long runs,String batsman,String bowler,String nonstriker)
	 {
		 this.over=over;
		 this.ball=ball;
		 this.runs=runs;
		 this.batsman=batsman;
		 this.bowler=bowler;
		 this.nonstriker=nonstriker;
	 }
	 
	 public void DeliveryDetails() {
		 System.out.println(" delivery details");
		 System.out.println(" over:"+over);
		 System.out.println(" ball:"+ball);
		 System.out.println(" runs:"+runs);
		 System.out.println(" batsman:"+batsman);
		 System.out.println(" bowler:"+bowler);
		 System.out.println(" nonstriker:"+nonstriker);
	 }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the over ");
		 long over =sc.nextLong();
		 System.out.println(" enter the  ball ");
		 long ball =sc.nextLong();
		 System.out.println(" entr the runs");
		 long runs = sc.nextLong();
		 System.out.println(" entr the batsman  name");
		 String batsman=sc.nextLine();
		System.out.println(" entr the bowler name ");
		String bowler=sc.nextLine();
		System.out.println(" entr the nonstriker name");
		String nonstriker=sc.nextLine();
		DelivaeryClass obj=new DelivaeryClass(over,ball,runs,batsman,bowler,nonstriker);
		obj.DeliveryDetails();
	}

}