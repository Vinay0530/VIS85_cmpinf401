package edu.pitt_lab10;



public class Lab_10 {

	public static void main(String[] args) 
	{
		



	}

	//Task 1

	int sumOfDigits(int x)
	{
		x=Math.abs(x);
		return x == 0 ? 0 : x % 10 + sumOfDigits(x/10);

	}

	//Task 2

	void printArrayElements(int[] a, int index) 
	{
		if (index == a.length) 
		{
			return;
		}
		
		System.out.println(a[index]);
		
		printArrayElements(a, index+1);
	}

	

	

	






}
