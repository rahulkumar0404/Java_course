package worker;

class SalariedEmployee extends Employee {
	public double annualSalary;
	public boolean isRetired;
	public SalariedEmployee() {
		super();
	}
	
	public void retire() {}           
}

class HourlyEmployee extends Employee{
	private double hourlyPayRate;
	public double getDoublePay() {
		return this.hourlyPayRate;
	}
}
