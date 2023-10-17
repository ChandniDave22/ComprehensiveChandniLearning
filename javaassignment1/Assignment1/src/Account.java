abstract class Account {
	double balance;
	double interest_amount;
	Account(double amount){
		this.balance = amount;
		this.interest_amount = 0;
	}
	
	abstract void interset_calculate(int interest_month);

}
