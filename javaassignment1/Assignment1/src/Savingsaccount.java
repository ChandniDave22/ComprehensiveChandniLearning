
public class Savingsaccount extends Account {

	Savingsaccount(double amount) {
		super(amount);
	}
	
	@Override
	void interset_calculate(int interest_month) {
		this.interest_amount = (double) ((6.0*interest_month)/100.0);
		this.balance += this.interest_amount;
		System.out.println("Savings account balance in " +interest_month+" month is: "+this.balance);
	}

}
