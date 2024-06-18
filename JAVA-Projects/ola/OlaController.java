package ola;

public class OlaController {
	
	public static void callMethod(Car car) {
		
		
		if(car instanceof Mini ) 
		{
			
			System.out.println("car details");
			System.out.println("Pickup loc :"+car.pl);
			System.out.println("drop loc :"+car.dl);
			Mini m = (Mini)car;
			System.out.println("Model :"+m.name);
			System.out.println("Driver  :"+m.Driver);
			System.out.println("Car No :"+m.Np);
			System.out.println("Fare /km :"+m.price);
		}
		else if(car instanceof Sedan ) 
		{
			
			System.out.println("car details");
			System.out.println("Pickup loc :"+car.pl);
			System.out.println("drop loc :"+car.dl);
			Sedan m = (Sedan)car;
			System.out.println("Model :"+m.name);
			System.out.println("Driver  :"+m.Driver);
			System.out.println("Car No :"+m.Np);
			System.out.println("Fare /km :"+m.price);
		}
		else if(car instanceof Luxury ) 
		{
			
			System.out.println("car details");
			System.out.println("Pickup loc :"+car.pl);
			System.out.println("drop loc :"+car.dl);
			Luxury m = (Luxury)car;
			System.out.println("Model :"+m.name);
			System.out.println("Driver  :"+m.Driver);
			System.out.println("Car No :"+m.Np);
			System.out.println("Fare /km :"+m.price);
		}
		
	
	}

}
