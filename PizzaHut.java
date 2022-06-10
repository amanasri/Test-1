import  java.util.*;
class Pizza
{
	String pizzabase;
	int price;
	Pizza(String base, int p)
	{
		pizzabase = base;
		price = p;
	}
	void display()
	{
		System.out.println("PizzaBase = " +pizzabase+ "\nPrice = "  +price );
	}
	
}
class ChickenPizza extends Pizza
{
	String topping = "chicken";
	ChickenPizza(String base, int p)
	{
		super(base, p);
		
	}
	void display()
	{
		System.out.println("PizzaBase = " +pizzabase+ "\nPrice = "  +price + "\nTopping =" +topping);
	}
	
}
class MuttonPizza extends ChickenPizza
{
	String flavouredtopping  = "Mutton";
	MuttonPizza(String base, int p)
	{
		super(base, p);
		
	}
	void display()
	{
		System.out.println("PizzaBase = " +pizzabase+ "\nPrice = " +price+  "\nFlavoured Topping = " +flavouredtopping );
	}
}

public class PizzaHut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Pizza P = new Pizza("Thin", 199);
		ChickenPizza C = new ChickenPizza("Thick", 299);
		MuttonPizza M = new MuttonPizza("flat", 399);
		
		System.out.print("Simple Pizza Price =  " + P.price);
		System.out.println("");
		System.out.print("Chicken Pizza Price =  "+ C.price);
		System.out.println("");
		System.out.print("Mutton Pizza Price =  "+ M.price);
		System.out.println("");
		System.out.print("Choose your Pizza\nPress\n 1 ---> Simple Pizza \n2 ---> Chicken Pizza\n3 ---> Mutton Pizza");
		int a = sc.nextInt();
		if(a== 1)
		{
			P.display();
		}else if(a== 2)
		{
			C.display();
			
		}
		else if(a== 3)
		{
			M.display();
		}
		else
		{
			System.out.println("Enter valid number");
		}
	}

}