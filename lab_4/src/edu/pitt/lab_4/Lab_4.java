package edu.pitt.lab_4;

import javax.swing.JOptionPane;

public class Lab_4 {

	public static void main(String[] args) 
	{
		int userNum4 = 0;
		int userNum6 = 0;
		
		String userNum = JOptionPane.showInputDialog("Type your b or base value must be greater than 1.");
		int userNum1 = Integer.parseInt(userNum);
		
		String userNum0 = JOptionPane.showInputDialog("Type your x value must be greater than 0.");
		int userNum2 = Integer.parseInt(userNum0);
		
		if(userNum1 < 1 || userNum2 < 0)
		{
			while(userNum1 < 1 || userNum2 < 0)
			{
				String userNum3 = JOptionPane.showInputDialog("Retype your b or base value must be greater than 1.");
				userNum4 = Integer.parseInt(userNum3);
				
				String userNum5 = JOptionPane.showInputDialog("Retype your x value must be greater than 0.");
				userNum6 = Integer.parseInt(userNum5);
				
				if(userNum4 > 1 && userNum6 > 0)
				{
					double w = logBase(userNum4,userNum6);
			        System.out.println(w);
			        break;
				}
			}
			
		
	      
	        
		}
		
		else
		{
			double p = logBase(userNum1,userNum2);
	        System.out.println(p);
		}
		
		
	}
	public static double logBase(int baseNumber, int number) 
	{
        return Math.log(number) / Math.log(baseNumber);
    }

}
