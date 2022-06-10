package Entity;

public class FourWheeler 
{

//	 Define a class called  FourWheeler consisting of  name, cc, safety, price. 
//
//	 
//
//	 If cc is less than 1000 then it will or greater than 4000, then it will generate VehicleException with information like ‘It is a Two Wheeler, not Four Wheeler’ or ‘It is a Vehicle not a Train ’ respectively. 
//
//	  
//
//	 Similarly if the safety if not 5 then it’ll generate UnsafetyException with a message ‘Sorry, Invalid Safty features’. 
//
//	  
//
//	 The VehicleException and UnsafetyExceptions are user defined exception classes. 
//
//	  
//
//	 Create at least 4 object’s of FourWheer class in main() method of Factory class to validate the FourWheeres cc and safety. 

	  public String name;
	  public double cc;
	  public double safety;
	  public double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public double getSafety() {
		return safety;
	}
	public void setSafety(double safety) {
		this.safety = safety;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FourWheeler [name=" + name + ", cc=" + cc + ", safety=" + safety + ", price=" + price + "]";
	}
	public FourWheeler(String name, double cc, double safety, double price) {
		super();
		this.name = name;
		this.cc = cc;
		this.safety = safety;
		this.price = price;
	}
	public FourWheeler() {
		super();
	}
	  
	  
	  
	  
}
