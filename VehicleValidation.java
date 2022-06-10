package Entity;

public class VehicleValidation
{

	

		public  void validatecc(int cc) throws CustomExceptions 
		{
			if (cc  < 1000) 
			{
				
				throw new CustomExceptions("It is a two wheller ,Not For Wheeler");
				
			}
			if (cc  > 4000) 
			{
				throw new CustomExceptions("It is a vehicle ,Not For Train");
			}
		}
		
		public void validateSafety(double safety) throws UnsafetyException
		{
			if (safety  != 5) 
			{
				throw new UnsafetyException("Sorry,Invalid Safety features");
			}
			
		}
		
}




















