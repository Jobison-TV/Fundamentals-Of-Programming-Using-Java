package String_method;

import java.util.Scanner;

public class Polimorphism_String {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
						  System.out.println("1.Car\n2.Bike");
						   System.out.println("Enter the choice");
						   int n=sc.nextInt();
						   //Scanner sc=new Scanner(System.in);
							StringBuffer s=new StringBuffer();
							
						vehicles f=new vehicles();
					
						   switch(n)
						   {
						     case 1:
						     System.out.println("Enter the details of car");
						     System.out.println("Enter the name of the car");
						     s.append("\nName of the car->"+sc.next());
						   System.out.println("Enter the colour of the car");
						     s.append("\nColor of the car->"+sc.next());
						   System.out.println("Enter the max speed of the car");
						     s.append("\nName of the car->"+sc.next());
						   System.out.println("Enter the number of seat ");
						     s.append("\nName of the car->"+sc.next());
						   System.out.println("Enter the number of wheelsr");
						     s.append("\nName of the car->"+sc.next());
						   
						    System.out.println("Enter the status of disc break(true/false)");
						     s.append("\nName of the car->"+sc.next());
						     System.out.println(s);

						     break;
						     
						     case 2:
						     System.out.println("Enter the details of bike");
						  
						   System.out.println("Enter the name of the bike");
						     s.append("\nName of the bike->"+sc.next());
						    System.out.println("Enter the colour of the car");
						     s.append("\ncolor of the bike->"+sc.next());
							   System.out.println("Enter the max speed of the car");
							     s.append("\nspeed of the bike->"+sc.next());
							   System.out.println("Enter the number of seat ");
							     s.append("\nseats in the bike->"+sc.next());
							   System.out.println("Enter the number of wheelsr");
							     s.append("\nNumber  of  wheels in bike->"+sc.next());
							   System.out.println("Enter the status of disc break(true/false)");
							     s.append("\nstastus of the bike->"+sc.next());
						    // f.Vehicle(j,j1,j2,j3,j4,j5);
							     System.out.println(s);

						     break;
						    
						     default:System.out.println("Invalid Option");
						     break;
						   }
						 }
				}
	class vehicles{
		StringBuilder car;
		StringBuilder bike;
		public 		StringBuilder getcar() {
			return car;
		}
		public void setcar(		StringBuilder car) {
			this.car=car;
		}
		public 		StringBuilder getbike()
		{
			return bike;
		}
		public void setbike(		StringBuilder bike) {
			this.bike=bike;
}}