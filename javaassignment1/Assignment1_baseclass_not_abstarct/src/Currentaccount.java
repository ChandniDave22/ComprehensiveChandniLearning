
public class Currentaccount extends Account {
	
	Currentaccount(double amount) {
		super(amount);
	}

	@Override
	void interset_calculate(int interest_month) {
		//No interest for current account
		this.balance += this.interest_amount;
		System.out.println("Current account balance in "+interest_month+" month is: "+this.balance);
	}

}
