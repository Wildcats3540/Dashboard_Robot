/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc3540;

import java.util.Hashtable;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc3540.DataTypes;

public class Main extends IterativeRobot
{

	Encoder PWR = new Encoder(1, 2);
	public  Joystick ps3 = new Joystick(1);
	public  Victor m1 = new Victor(1);
	public  Victor m2 = new Victor(2);
	public  ADXL345_I2C acll = new ADXL345_I2C(1,
			ADXL345_I2C.DataFormat_Range.k8G);
	public  Gyro gg = new Gyro(1,1);
	private double speed, rotation;
	int PWRLast, PWRDiff;
	public double a[] = new double[2000];
	public int son = 0;
	static Hashtable data = new Hashtable();
	//AnalogChannel sonic = new AnalogChannel(1);
	RobotDrive drive = new RobotDrive(m1, m2);

	public void robotInit()
	{
		PWR.start();
		new DataServer(this).start();
		// new DataServer().start();
	}

	public void autonomousPeriodic()
	{
		disp(2, "hi");
	}

	public void teleopInt()
	{
		disp(1, "Calibrating...");
		PWR.reset();
		disp(2, "Done... Ready");
	}

	boolean running = false;

	public void teleopContinuous()
	{
		if(ps3.getRawButton(3)){

			gg.reset();
		}
		drive.arcadeDrive(-ps3.getRawAxis(3), ps3.getRawAxis(1) / 1.4);
		disp(4, gg.getAngle() + "");
		disp(5, gg.pidGet()+"");
	}

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

	static Mode m = new Mode();

	public synchronized Hashtable update()
	{
		data.put(DataTypes.DATA_JOYSTICK_1_AXIS1, new Double(ps3.getRawAxis(1)));
		data.put(DataTypes.DATA_ROBOT_MODE, getMode());
		data.put(DataTypes.DATA_JOYSTICK_1_AXIS2, new Double(ps3.getRawAxis(2)));
		data.put(DataTypes.DATA_JOYSTICK_1_AXIS3, new Double(ps3.getRawAxis(3)));
		data.put(DataTypes.DATA_JOYSTICK_1_AXIS4, new Double(ps3.getRawAxis(4)));
		data.put(DataTypes.DATA_JOYSTICK_1_AXIS5,
				new Double(((ps3.getRawAxis(5) + 1) * 50)));
		data.put(DataTypes.DATA_JOYSTICK_1_AXIS6, new Double(ps3.getRawAxis(6)));
		data.put(DataTypes.DATA_DIGITAL_1,
				new Double(acll.getAcceleration(ADXL345_I2C.Axes.kY)));
		data.put(DataTypes.DATA_DIGITAL_2,
				new Double(acll.getAcceleration(ADXL345_I2C.Axes.kX)));
		data.put(DataTypes.DATA_DIGITAL_3,
				new Double(acll.getAcceleration(ADXL345_I2C.Axes.kZ)));
		data.put(DataTypes.DATA_ROBOT_VOLTS, new Double(DriverStation
				.getInstance().getBatteryVoltage()));
		 data.put(DataTypes.DATA_DIGITAL_13, new Double(gg.getAngle()));

		
		return data;
	}

	public String arrayToString(double b[])
	{
		String c = "";

		for (int i = 0; i < a.length; i++)
		{
			c = c + " " + b[i] + " ";
		}

		return c;
	}

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
