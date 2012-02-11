package org.usfirst.frc3540;

public class Mode
{
	
	    	public  Double getMode(Main m){

	    		if(m.isOperatorControl()){
	    			return new Double(4);
	    		}
	    		if(m.isAutonomous()){
	    			return new Double(3);
	    		}
	    		if(m.isEnabled()){
	    			return new Double(2);
	    		}
	    		if(m.isDisabled()){
	    			return new Double(1);
	    		}
	    		return new Double(0);
	    	
	    }
}
