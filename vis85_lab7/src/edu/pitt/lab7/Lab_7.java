
package edu.pitt.lab7;
import java.util.*;

public class Lab_7 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values in array?");
		double array1[] = obtainData(sc);
		System.out.println(Arrays.toString(array1));
		System.out.println("The max is " + max(array1));
		System.out.println("The min is " + min(array1));
		System.out.println("The sum is " + sum(array1));
		System.out.println("The average is " + ave(array1));

	}
	
	public static double [] obtainData(Scanner userInput)
	{
		Scanner sc  = new Scanner(System.in);
		int x = sc.nextInt();
		double st[] = new double[x];
		
		for(int i=0; i<x; i++)
		{
			st[i] = (double)(Math.random() * 10) + 1;
		}
		for(double number: st)
		{
			System.out.println("The following value in the array is " + number);
		}
		return st;
		
	}
	
	public static double max(double [] data) 
	{
		double[] array1 = data;
		double x = array1[0];
		for(int i=1; i<array1.length;i++)
		{
			if(array1[i]>x)
			{
				x = array1[i];
			}
		}
		return x;
		
	}
	public static double min(double [] data)
	{
		double[] array1 = data;
		double x = array1[0];
		for(int i=1; i<array1.length;i++)
		{
			if(array1[i]<x)
			{
				x = array1[i];
			}
		}
		return x;
	}
	public static double sum(double [] data)
	{
		double x = 0;
		double array1[] = data;
		for(int i = 0;i<array1.length;i++)
		{
			x+=array1[i];
		}
		return x;

	}
	public static double ave(double [] data)
	{
		double x = 0;
		double array1[] = data;
		for(int i=0;i<array1.length;i++)
		{
			x+=array1[i];
		}
		double ave1 = x/(array1.length);
		return ave1;
	}
	
}
