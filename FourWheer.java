
import java.util.Scanner;

class FourWheller{
	String name;
	int cc;
	int safety;
	int price;
	FourWheller(String n,int c,int sft,int p){
		this.name=n;
		this.cc=c;
		this.safety=sft;
		this.price=p;
	}
	void VehicleException() {
		System.out.println("Enter Available cc: ");
		Scanner s=new Scanner(System.in);
		int carcc=s.nextInt();
		if(carcc<1000||carcc>4000) {
			System.out.println("It is a two wheller,not four wheller");
		}
	}
	void display()  {
		System.out.println(name+" "+cc+" "+safety+" "+price);
	}
	void UnsafetyException() {
		System.out.println("Enter safety value: ");
		Scanner s=new Scanner(System.in);
		int sftvalue=s.nextInt();
		if(sftvalue!=5) {
			System.out.println("Sorry,Invalid safety features !!");
		}
		
	}
}



public class FourWheer {

	public static void main(String[] args) {
		System.out.println("Car 1: ");
		FourWheller c1=new FourWheller("Honda City", 1200 , 5 ,1500000);
		c1.display();
		c1.VehicleException();
		c1.UnsafetyException();
		System.out.println();
		System.out.println("Car 2: ");
		FourWheller c2=new FourWheller("Hyundai Verna", 1500 , 5 ,1400000);
		c2.display();
		c2.VehicleException();
		c2.UnsafetyException();
		System.out.println();
		System.out.println("Car 3: ");
		FourWheller c3=new FourWheller("Honda Jazz", 900 , 4 ,500000);
		c3.display();
		c3.VehicleException();
		c3.UnsafetyException();
		System.out.println();
		System.out.println("Car 4: ");
		FourWheller c4=new FourWheller("Maruti Ciaz", 1300 , 6 ,1000000);
		c4.display();
		c4.VehicleException();
		c4.UnsafetyException();

	}

}