package entity.ex5;

public abstract class User {
	String name;
	double salaryRatio;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaryRatio() {
		return salaryRatio;
	}
	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
		
	
	}
	public abstract double calculatePay() ;
	
	public void displayInfor() {
		System.out.println("Name: " + name);
		System.out.println("Salaryratio: " + salaryRatio);
		System.out.println("Lương: " + calculatePay());
		
		
	}
	
	
	
	
}
