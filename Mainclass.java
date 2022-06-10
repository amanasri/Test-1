package Entity;
import java.util.ArrayList;
public class Mainclass {

	public static void main(String[] args) 
	{
		
		
		
		VehicleValidation V = new VehicleValidation();
		FourWheeler nexon = new FourWheeler("Name",900,3000,5);
		 FourWheeler I10  =  new FourWheeler("I10",5000,60000,4);
	   
	   
	  
	   try {
		   try {
		         V.validatecc((int) nexon.cc);
		        }catch(Exception e) {
				e.printStackTrace();}
		   V.validateSafety(nexon.safety);
		}catch(Exception e) {
			e.printStackTrace();
		}
	   
	   
	  
		
	}

	

}
