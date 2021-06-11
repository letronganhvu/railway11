package entity.ex5;

public class Waiter extends User{

	@Override
	public double calculatePay() {	
		return salaryRatio * 220;
	}
	
}
