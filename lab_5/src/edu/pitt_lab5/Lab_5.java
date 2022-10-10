
package edu.pitt_lab5;
import java.util.*;

import javax.swing.JOptionPane;
public class Lab_5 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int userInput2 = 1;
		
		while(userInput2 != 0)
		{
			System.out.println("How many times you want to roll the dice?");
			int userNum1 = sc.nextInt();
			
			Random dice = new Random();
			Rolldice(userNum1,dice);
			
			System.out.println("Do you wish to contine press 0 for no and 1 for yes");
			userInput2 = sc.nextInt();
		}

		
		
		
		

		
		

	}
	
	public static void Rolldice(int numberOfTimes, Random b)
	{
		Random dice = b;
		
		int totalCount = numberOfTimes;
		int k =0;
		double countfor2 = 0;
		double countfor3 = 0;
		double countfor4 = 0;
		double countfor5 = 0;
		double countfor6 = 0;
		double countfor7 = 0;
		double countfor8 = 0;
		double countfor9 = 0;
		double countfor10 = 0;
		double countfor11 = 0;
		double countfor12 = 0;
		
				
		while(k<totalCount)
		{
			int roll = (dice.nextInt(6)+1) + (dice.nextInt(6)+1);
			
			
			if(roll == 2)
			{
				countfor2 = countfor2 + 1;
			}
			if(roll == 3) 
			{
				countfor3  = countfor3 + 1;
			}
			if (roll == 4) 
			{
				countfor4 = countfor4 + 1;
			}
			if (roll == 5) 
			{
				countfor5 = countfor5 + 1;
			}
			if(roll == 6)
			{
				countfor6  = countfor6 + 1;
			}
			if (roll == 7)
			{
				countfor7  = countfor7 +1;
			}
			if (roll == 8)
			{
				countfor8  = countfor8 + 1;
			}
			if (roll == 9) 
			{
				countfor9 = countfor9 + 1;
			}
			if (roll == 10)
			{
				countfor10 = countfor10 + 1;
			}
			if (roll  == 11)
			{
				countfor11 = countfor11 + 1;
			}
			if (roll==12)
			{
				countfor12 = countfor12 + 1;
			}
			k++;
		}
		System.out.println("The probabily of 2 was " + countfor2/totalCount);
		System.out.println("The probabily of 3 was " + countfor3/totalCount);
		System.out.println("The probabily of 4 was " + countfor4/totalCount);
		System.out.println("The probabily of 5 was " + countfor5/totalCount);
		System.out.println("The probabily of 6 was " + countfor6/totalCount);
		System.out.println("The probabily of 7 was " + countfor7/totalCount);
		System.out.println("The probabily of 8 was " + countfor8/totalCount);
		System.out.println("The probabily of 9 was " + countfor9/totalCount);
		System.out.println("The probabily of 10 was " + countfor10/totalCount);
		System.out.println("The probabily of 11 was " + countfor11/totalCount);
		System.out.println("The probabily of 12 was " + countfor12/totalCount);
		
	
	}

}
