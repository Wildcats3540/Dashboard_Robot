package com.wildcatrobotics.Dashboard_Robot;

import java.util.Hashtable;
import edu.wpi.first.wpilibj.*;

import com.wildcatrobotics.Dashboard_Robot.DataTypes;


/*
 * Dashboard data server skeleton
 * 
 * You can add your code to this skeleton like you normaly would. To start the server
 * create a new dataserver can call start()
 * 
 * 
 */
public class Main extends IterativeRobot
{

	

	public void robotInit()
	{
		//Starts the data server
		new DataServer(this).start();
	}

	public void autonomousPeriodic(){
		
	}

	public void teleopInt(){
		
	}


	public void teleopContinuous()
	{
		

	}

	
	/**
	 * Outputs a line of text to the Driverstation display
	 * 
	 * 
	 * @param line the line (1-6) you want to display it on
	 * @param msg  the message you want to output
	 */
	
	public static void disp(int line, String msg)
	{
		DriverStationLCD.Line l;
		switch (line)
		{
		case 1:
			l = DriverStationLCD.Line.kUser2;
			break;
		case 2:
			l = DriverStationLCD.Line.kUser3;
			break;
		case 3:
			l = DriverStationLCD.Line.kUser4;
			break;
		case 4:
			l = DriverStationLCD.Line.kUser5;
			break;
		case 5:
			l = DriverStationLCD.Line.kUser6;
			break;
		case 6:
			l = DriverStationLCD.Line.kMain6;
			break;
		default:
			l = DriverStationLCD.Line.kUser2;
			break;
		}

		DriverStationLCD.getInstance().println(l, 1, msg);
		DriverStationLCD.getInstance().updateLCD();
	}


	/**
	 * This method is called by the DataServer everytime that data is requested. This is 
	 * where you set all the key,data combos to send to the dashboard
	 * 
	 * All the data is inserted into a Hashtable and then returned to the DataServer.
	 * 
	 * Insert a key defined by DataTypes along with a Double object.
	 * 
	 * Example:
	 * data.put(DataTypes.DATA_JOYSTICK_1_AXIS1, new Double(joystick.getRawAxis(1));
	 * 
	 * 
	 * @return 
	 */
	public synchronized Hashtable update()
	{
		Hashtable data = new Hashtable();
		
		
		
		
		//data.put(DataTypes.DATA_JOYSTICK_1_AXIS1, new Double(joystick.getRawAxis(1));
		
		
		return data;
	}

	
	
	/**
	 * 
	 * @return Double, the current game mode
	 */
	public Double getMode()
	{
		if (isDisabled())
		{
			return new Double(1);
		}
		if (isAutonomous())
		{
			return new Double(3);
		}
		if (isOperatorControl())
		{
			return new Double(4);
		}

		if (isEnabled())
		{
			return new Double(2);
		}
		
		return new Double(0);

	}

}
