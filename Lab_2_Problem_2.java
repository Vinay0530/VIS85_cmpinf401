package edu.pitt.lab_2;

import javax.swing.JOptionPane;

public class Lab_2_Problem_2 {

	public static void main(String[] args) 
	{
		String number1 = JOptionPane.showInputDialog("Enter the radius");
		
		double n1 = Integer.parseInt(number1);
		
		double area1 = Math.PI * n1 * n1;
		
		double perim1 = 2 * Math.PI * n1;
		
		System.out.println("The circle with a radius of " + n1 + " has an area of "  + area1 + " and has a perimeter of " + perim1 + "." );
		

	}

}
