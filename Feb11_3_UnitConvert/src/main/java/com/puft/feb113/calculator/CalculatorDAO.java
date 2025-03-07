package com.puft.feb113.calculator;



public class CalculatorDAO {

	   
	public static double Calculate(double input, String option) {
		if(option.equals("cm")) {
			
			 return input * 0.393701;
			
		}else if(option.equals("m")) {
			 return input * 0.3025;
				
		}else if(option.equals("cel")) {
			 return (input * 9.0 / 5.0) + 32;
				
		}else if(option.equals("speed")) {
			 return input * 1.60934;
		}
		return 0;
	}
	
	    public static double cmToInch(double cm) {
	        return cm * 0.393701;
	    }

	    public static double MeterToPyeong(double squareMeter) {
	        return squareMeter * 0.3025;
	    }

	
	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9.0 / 5.0) + 32;
	    }

	
	    public static double milesToKilometers(double milesPerHour) {
	        return milesPerHour * 1.60934;
	    }

	    
	

}
