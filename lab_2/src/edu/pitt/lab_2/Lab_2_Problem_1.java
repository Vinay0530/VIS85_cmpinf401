package edu.pitt.lab_2;

import javax.swing.JOptionPane;

public class Lab_2_Problem_1 {

	public static void main(String[] args) 
	{
		String number1 = JOptionPane.showInputDialog("Enter a number");
		
		int n1 = Integer.parseInt(number1);
		
		String number2 = JOptionPane.showInputDialog("Enter a number");
		
		int n2 = Integer.parseInt(number2);
		
		double n3 = Math.pow(n1,2);
		
		double n4 = Math.pow(n2,2);
		
		double n5 = n3 + n4;
		
		double n6 = Math.sqrt(n5);
		
		n6 = n6*100;
		
		double n7 = (int) Math.round(n6);
		
		double n8 = n7/100.0;
		
		
		System.out.println("The hypotenuse " + n8 + ".");
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
