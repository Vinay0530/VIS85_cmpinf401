package edu.pitt.lab_3;

import javax.swing.JOptionPane;

public class Unit_Converter {

	public static void main(String[] args) 
	{
		String inputstring = JOptionPane.showInputDialog("Type a distance or weight");
		
		double userNumber = Double.parseDouble(inputstring.split(" ")[0]);
		
		String unit = inputstring.split(" ")[1];
		
		if (unit.equalsIgnoreCase("cm"))
		{
			double userNumber1 = userNumber / 2.54;
			System.out.println(userNumber + " " + unit + " = " + userNumber1 + " in");
		}
		else if(unit.equalsIgnoreCase("in"))
		{
			double userNumber2 = userNumber*2.54;
			System.out.println(userNumber + " " + unit + " = " + userNumber2 + " cm");
		}
		else if(unit.equalsIgnoreCase("yd"))
		{
			double userNumber3 = userNumber/1.094;
			System.out.println(userNumber + " " + unit + " = " + userNumber3 + " m");
			
		}
		else if(unit.equalsIgnoreCase("m"))
		{
			double userNumber4 = userNumber*1.094;
			System.out.println(userNumber + " " + unit + " = " + userNumber4 + " yd");
		}
		else if(unit.equalsIgnoreCase("oz"))
		{
			double userNumber5 = userNumber*28.35;
			System.out.println(userNumber + " " + unit + " = " + userNumber5 + " gm");
		}
		else if(unit.equalsIgnoreCase("gm"))
		{
			double userNumber6 = userNumber/28.35;
			System.out.println(userNumber + " " + unit + " = " + userNumber6 + " oz");
			
		}
		else if(unit.equalsIgnoreCase("lb"))
		{
			double userNumber7 = userNumber/2.205;
			System.out.println(userNumber + " " + unit + " = " + userNumber7 + " kg");
			
		}
		else
		{
			double userNumber8 = userNumber*2.205;
			System.out.println(userNumber + " " + unit + " = " + userNumber8 + " lb");
		}
			
				
				
		
	}

}
