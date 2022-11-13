package edu.pitt_lab9;

public class Circle 
{
	double radius = 5.0;
	
	String color = "green";
	
	public Circle ()
	{
		
	}

	public Circle (double radius)
	{
		this.radius=radius;
		
	}
	
	public Circle (double radius, String color) 
	{
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return (Math.pow(radius, 2))*Math.PI;
	}
	
	

			

}
