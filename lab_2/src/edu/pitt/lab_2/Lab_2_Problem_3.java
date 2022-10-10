package edu.pitt.lab_2;

import javax.swing.JOptionPane;

public class Lab_2_Problem_3 {

	public static void main(String[] args) 
	{
		
		String number1 = JOptionPane.showInputDialog("Enter a dollar amount between 1 to 9999");
		
		int n1 = Integer.parseInt(number1);
		
		
		int n2 = n1%1000;
		
		int n4 = n1/1000;
		
				
		
		System.out.println("The amount of grands is " + n4 + ".");
		
		
		int n3 = n2/100;
		
		System.out.println("The amount of benjamins " + n3);
		
		int n5 = n2%100;
		
		int n6 = n5/10;
		
		System.out.println("The amount of sawbucks is "+ n6);
		
		
		int n7 = n5%10;
		
		int n8 = n7/1;
		
		System.out.println("The amount of bucks is " + n8);
		
		
		
		
		
		
		
		
		
	}
	

}
