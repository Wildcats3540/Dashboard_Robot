package org.usfirst.frc3540;

import java.util.Hashtable;

public class DataTypes {


	public static  Hashtable ranges =  new Hashtable();
	
	
	public static final Integer NULL =  new Integer( 0);
	
	//TYPES
	public static final Integer TYPE_MIXED   =  new Integer(0);
	public static final Integer TYPE_STRING  =  new Integer(1);
	public static final Integer TYPE_new  =  new Integer(2);
	public static final Integer TYPE_DOUBLE  =  new Integer(3);
	public static final Integer TYPE_UNKNOWN =  new Integer(100);
	
	
	//META
	public static final int[] META_ROBOT    =   new int[] {1,3, TYPE_MIXED.intValue()};
	public static final int[] META_PWM      =   new int[] {10,19, TYPE_DOUBLE.intValue()};
	public static final int[] META_DIGITAL  =   new int[] {20,33, TYPE_DOUBLE.intValue()};
	public static final int[] META_RELAY    =   new int[] {40,47, TYPE_DOUBLE.intValue()};
	public static final int[] META_JOYSTICK =   new int[] {100,200,TYPE_DOUBLE.intValue()};

	public static final int[][] META_RANGE =  
		{	
			META_ROBOT,
			META_PWM,
			META_DIGITAL,
			META_RELAY
		};
	
	
	

	//ROBOT VALUES
	//RESERVED: 0-10
	public static final Integer DATA_ROBOT_NAME =  new Integer( 1);
	public static final Integer DATA_ROBOT_MODE =  new Integer( 2);
	public static final Integer DATA_ROBOT_VOLTS =  new Integer( 3);
	
	
	//PWM
	//RESERVED: 10-19
	public static final Integer DATA_PWM_1 =  new Integer(  10);
	public static final Integer DATA_PWM_2 =  new Integer(  11);
	public static final Integer DATA_PWM_3 =  new Integer(  12);
	public static final Integer DATA_PWM_4 =  new Integer(  13);
	public static final Integer DATA_PWM_5 =  new Integer(  14);
	public static final Integer DATA_PWM_6 =  new Integer(  15);
	public static final Integer DATA_PWM_7 =  new Integer(  16);
	public static final Integer DATA_PWM_8 =  new Integer(  17);
	public static final Integer DATA_PWM_9 =  new Integer(  18);
	public static final Integer DATA_PWM_10 =  new Integer( 19);
	
	
	//DIGITAL INPUTS
	//RESERVED: 20-39
	public static final Integer DATA_DIGITAL_1  =  new Integer( 20);
	public static final Integer DATA_DIGITAL_2  =  new Integer( 21);
	public static final Integer DATA_DIGITAL_3  =  new Integer( 22);
	public static final Integer DATA_DIGITAL_4  =  new Integer( 23);
	public static final Integer DATA_DIGITAL_5  =  new Integer( 24);
	public static final Integer DATA_DIGITAL_6  =  new Integer( 25);
	public static final Integer DATA_DIGITAL_7  =  new Integer( 26);
	public static final Integer DATA_DIGITAL_8  =  new Integer( 27);
	public static final Integer DATA_DIGITAL_9  =  new Integer( 28);
	public static final Integer DATA_DIGITAL_10 =  new Integer( 29);
	public static final Integer DATA_DIGITAL_11 =  new Integer( 30);
	public static final Integer DATA_DIGITAL_12 =  new Integer( 31);
	public static final Integer DATA_DIGITAL_13 =  new Integer( 32);
	public static final Integer DATA_DIGITAL_14 =  new Integer( 33);

	//RELAY
	//RESERVED 40-59
	public static final Integer DATA_RELAY_1 =  new Integer( 40);
	public static final Integer DATA_RELAY_2 =  new Integer( 41);
	public static final Integer DATA_RELAY_3 =  new Integer( 42);
	public static final Integer DATA_RELAY_4 =  new Integer( 43);
	public static final Integer DATA_RELAY_5 =  new Integer( 44);
	public static final Integer DATA_RELAY_6 =  new Integer( 45);
	public static final Integer DATA_RELAY_7 =  new Integer( 46);
	public static final Integer DATA_RELAY_8 =  new Integer( 47);
	
	
	//JOYSTICKS
	//RESERVED 100-300
	//NUMBERS 205-300 CAN BE USED FOR EXTRA JOYSTICK DATA
	public static final Integer DATA_JOYSTICK_1_AXIS1    =  new Integer( 100);
	public static final Integer DATA_JOYSTICK_1_AXIS2    =  new Integer( 101);
	public static final Integer DATA_JOYSTICK_1_AXIS3    =  new Integer( 102);
	public static final Integer DATA_JOYSTICK_1_AXIS4    =  new Integer( 103);
	public static final Integer DATA_JOYSTICK_1_AXIS5    =  new Integer( 104);
	public static final Integer DATA_JOYSTICK_1_AXIS6    =  new Integer( 105);
	public static final Integer DATA_JOYSTICK_1_BUTTON1  =  new Integer( 106);
	public static final Integer DATA_JOYSTICK_1_BUTTON2  =  new Integer( 107);
	public static final Integer DATA_JOYSTICK_1_BUTTON3  =  new Integer( 108);
	public static final Integer DATA_JOYSTICK_1_BUTTON4  =  new Integer( 109);
	public static final Integer DATA_JOYSTICK_1_BUTTON5  =  new Integer( 110);
	public static final Integer DATA_JOYSTICK_1_BUTTON6  =  new Integer( 111);
	public static final Integer DATA_JOYSTICK_1_BUTTON7  =  new Integer( 112);
	public static final Integer DATA_JOYSTICK_1_BUTTON8  =  new Integer( 113);
	public static final Integer DATA_JOYSTICK_1_BUTTON9  =  new Integer( 114);
	public static final Integer DATA_JOYSTICK_1_BUTTON10 =  new Integer( 115);
	public static final Integer DATA_JOYSTICK_1_BUTTON11 =  new Integer( 116);
	public static final Integer DATA_JOYSTICK_1_BUTTON12 =  new Integer( 117);
	public static final Integer DATA_JOYSTICK_1_BUTTON13 =  new Integer( 118);
	public static final Integer DATA_JOYSTICK_1_BUTTON14 =  new Integer( 119);
	public static final Integer DATA_JOYSTICK_1_BUTTON15 =  new Integer( 120);
	
	public static final Integer DATA_JOYSTICK_2_AXIS1    =  new Integer( 121);
	public static final Integer DATA_JOYSTICK_2_AXIS2    =  new Integer( 122);
	public static final Integer DATA_JOYSTICK_2_AXIS3    =  new Integer( 123);
	public static final Integer DATA_JOYSTICK_2_AXIS4    =  new Integer( 124);
	public static final Integer DATA_JOYSTICK_2_AXIS5    =  new Integer( 125);
	public static final Integer DATA_JOYSTICK_2_AXIS6    =  new Integer( 126);
	public static final Integer DATA_JOYSTICK_2_BUTTON1  =  new Integer( 127);
	public static final Integer DATA_JOYSTICK_2_BUTTON2  =  new Integer( 128);
	public static final Integer DATA_JOYSTICK_2_BUTTON3  =  new Integer( 129);
	public static final Integer DATA_JOYSTICK_2_BUTTON4  =  new Integer( 130);
	public static final Integer DATA_JOYSTICK_2_BUTTON5  =  new Integer( 131);
	public static final Integer DATA_JOYSTICK_2_BUTTON6  =  new Integer( 132);
	public static final Integer DATA_JOYSTICK_2_BUTTON7  =  new Integer( 133);
	public static final Integer DATA_JOYSTICK_2_BUTTON8  =  new Integer( 134);
	public static final Integer DATA_JOYSTICK_2_BUTTON9  =  new Integer( 135);
	public static final Integer DATA_JOYSTICK_2_BUTTON10 =  new Integer( 136);
	public static final Integer DATA_JOYSTICK_2_BUTTON11 =  new Integer( 137);
	public static final Integer DATA_JOYSTICK_2_BUTTON12 =  new Integer( 138);
	public static final Integer DATA_JOYSTICK_2_BUTTON13 =  new Integer( 139);
	public static final Integer DATA_JOYSTICK_2_BUTTON14 =  new Integer( 140);
	public static final Integer DATA_JOYSTICK_2_BUTTON15 =  new Integer( 141);

	public static final Integer DATA_JOYSTICK_3_AXIS1    =  new Integer( 142);
	public static final Integer DATA_JOYSTICK_3_AXIS2    =  new Integer( 143);
	public static final Integer DATA_JOYSTICK_3_AXIS3    =  new Integer( 144);
	public static final Integer DATA_JOYSTICK_3_AXIS4    =  new Integer( 145);
	public static final Integer DATA_JOYSTICK_3_AXIS5    =  new Integer( 146);
	public static final Integer DATA_JOYSTICK_3_AXIS6    =  new Integer( 147);
	public static final Integer DATA_JOYSTICK_3_BUTTON1  =  new Integer( 148);
	public static final Integer DATA_JOYSTICK_3_BUTTON2  =  new Integer( 149);
	public static final Integer DATA_JOYSTICK_3_BUTTON3  =  new Integer( 150);
	public static final Integer DATA_JOYSTICK_3_BUTTON4  =  new Integer( 151);
	public static final Integer DATA_JOYSTICK_3_BUTTON5  =  new Integer( 152);
	public static final Integer DATA_JOYSTICK_3_BUTTON6  =  new Integer( 153);
	public static final Integer DATA_JOYSTICK_3_BUTTON7  =  new Integer( 154);
	public static final Integer DATA_JOYSTICK_3_BUTTON8  =  new Integer( 155);
	public static final Integer DATA_JOYSTICK_3_BUTTON9  =  new Integer( 156);
	public static final Integer DATA_JOYSTICK_3_BUTTON10 =  new Integer( 157);
	public static final Integer DATA_JOYSTICK_3_BUTTON11 =  new Integer( 158);
	public static final Integer DATA_JOYSTICK_3_BUTTON12 =  new Integer( 159);
	public static final Integer DATA_JOYSTICK_3_BUTTON13 =  new Integer( 160);
	public static final Integer DATA_JOYSTICK_3_BUTTON14 =  new Integer( 161);
	public static final Integer DATA_JOYSTICK_3_BUTTON15 =  new Integer( 162);
	
	
	public static final Integer DATA_JOYSTICK_4_AXIS1    =  new Integer( 163);
	public static final Integer DATA_JOYSTICK_4_AXIS2    =  new Integer( 164);
	public static final Integer DATA_JOYSTICK_4_AXIS3    =  new Integer( 165);
	public static final Integer DATA_JOYSTICK_4_AXIS4    =  new Integer( 166);
	public static final Integer DATA_JOYSTICK_4_AXIS5    =  new Integer( 167);
	public static final Integer DATA_JOYSTICK_4_AXIS6    =  new Integer( 168);
	public static final Integer DATA_JOYSTICK_4_BUTTON1  =  new Integer( 169);
	public static final Integer DATA_JOYSTICK_4_BUTTON2  =  new Integer( 170);
	public static final Integer DATA_JOYSTICK_4_BUTTON3  =  new Integer( 171);
	public static final Integer DATA_JOYSTICK_4_BUTTON4  =  new Integer( 172);
	public static final Integer DATA_JOYSTICK_4_BUTTON5  =  new Integer( 173);
	public static final Integer DATA_JOYSTICK_4_BUTTON6  =  new Integer( 174);
	public static final Integer DATA_JOYSTICK_4_BUTTON7  =  new Integer( 175);
	public static final Integer DATA_JOYSTICK_4_BUTTON8  =  new Integer( 176);
	public static final Integer DATA_JOYSTICK_4_BUTTON9  =  new Integer( 177);
	public static final Integer DATA_JOYSTICK_4_BUTTON10 =  new Integer( 178);
	public static final Integer DATA_JOYSTICK_4_BUTTON11 =  new Integer( 179);
	public static final Integer DATA_JOYSTICK_4_BUTTON12 =  new Integer( 180);
	public static final Integer DATA_JOYSTICK_4_BUTTON13 =  new Integer( 181);
	public static final Integer DATA_JOYSTICK_4_BUTTON14 =  new Integer( 182);
	public static final Integer DATA_JOYSTICK_4_BUTTON15 =  new Integer( 183);

	public static final Integer DATA_JOYSTICK_5_AXIS1    =  new Integer( 184);
	public static final Integer DATA_JOYSTICK_5_AXIS2    =  new Integer( 185);
	public static final Integer DATA_JOYSTICK_5_AXIS3    =  new Integer( 186);
	public static final Integer DATA_JOYSTICK_5_AXIS4    =  new Integer( 187);
	public static final Integer DATA_JOYSTICK_5_AXIS5    =  new Integer( 188);
	public static final Integer DATA_JOYSTICK_5_AXIS6    =  new Integer( 189);
	public static final Integer DATA_JOYSTICK_5_BUTTON1  =  new Integer( 190);
	public static final Integer DATA_JOYSTICK_5_BUTTON2  =  new Integer( 191);
	public static final Integer DATA_JOYSTICK_5_BUTTON3  =  new Integer( 192);
	public static final Integer DATA_JOYSTICK_5_BUTTON4  =  new Integer( 193);
	public static final Integer DATA_JOYSTICK_5_BUTTON5  =  new Integer( 194);
	public static final Integer DATA_JOYSTICK_5_BUTTON6  =  new Integer( 195);
	public static final Integer DATA_JOYSTICK_5_BUTTON7  =  new Integer( 196);
	public static final Integer DATA_JOYSTICK_5_BUTTON8  =  new Integer( 197);
	public static final Integer DATA_JOYSTICK_5_BUTTON9  =  new Integer( 198);
	public static final Integer DATA_JOYSTICK_5_BUTTON10 =  new Integer( 199);
	public static final Integer DATA_JOYSTICK_5_BUTTON11 =  new Integer( 200);
	public static final Integer DATA_JOYSTICK_5_BUTTON12 =  new Integer( 201);
	public static final Integer DATA_JOYSTICK_5_BUTTON13 =  new Integer( 202);
	public static final Integer DATA_JOYSTICK_5_BUTTON14 =  new Integer( 203);
	public static final Integer DATA_JOYSTICK_5_BUTTON15 =  new Integer( 204);

}
