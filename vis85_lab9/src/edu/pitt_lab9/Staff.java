package edu.pitt_lab9;

public class Staff extends Person
{
	String school;
	double pay;
	
	Staff(String name, String address, double pay)
	{
		super.name = name;
		super.address = address;
		this.pay = pay;
		
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString() {
		return name+"\n"+address+"\n$"+pay;
	}
	
	

}
