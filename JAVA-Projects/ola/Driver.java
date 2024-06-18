package ola;

import java.util.Scanner;


public class Driver {
	
	static String pl,dl;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.Mini Car");
		System.out.println(" 2.Sedan \n 3.Luxury  \n 4.exit \n Select your car");
		int ch = sc.nextInt();
		
				switch(ch){
		
			case 1:
				 System.out.println("enter your Pick up location");
				  pl=sc.next();
				 System.out.println("enter your drop loacation ");
				 dl=sc.next();

				 Car m= new Mini("Mini-Cooper",pl,dl,"Ravi",25,"AP03AK3223");
				 OlaController.callMethod(m);
				 break;
			case 2 :
				 System.out.println("enter your Pick up location");
				 pl=sc.next();
				 System.out.println("enter your drop loacation ");
				 dl=sc.next();

				Car s= new Sedan("Tata-Nexon",pl,dl,"Kiran",60,"AP03AK3224");
				OlaController.callMethod(s);
				break;
			case 3:
				 System.out.println("enter your Pick up location");
				 pl=sc.next();
				 System.out.println("enter your drop loacation ");
				 dl=sc.next();

				Car l= new Luxury("Volvo XC60",pl,dl,"Kumar",125,"AP03AK3225");
				OlaController.callMethod(l);
				break;
			case 4:
				break;
		}
				sc.close();
		
	}

}
