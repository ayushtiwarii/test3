package abstactionPrograms;

import abstactionPrograms.BluePrints.TataExteriorDesign;
import abstactionPrograms.BluePrints.TataInteriorDesign;

public abstract class Safari implements TataExteriorDesign,TataInteriorDesign{
	
	int teeth=2;
	
	void print() {
		teeth=7;
	}

	@Override
	public void ventilatedSeats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tatLogo() {
		// TODO Auto-generated method stub
		
		System.out.println("I want the tata log to be in front");
		
	}

	@Override
	public void tailsLamps() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void p() {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
