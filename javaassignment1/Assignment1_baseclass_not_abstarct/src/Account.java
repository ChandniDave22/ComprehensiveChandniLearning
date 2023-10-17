public class Account {
	double balance;
	double interest_amount;
	Account(double amount){
		this.balance = amount;
		this.interest_amount = 0;
	}
	
	void interset_calculate(int interest_month) {
		this.interest_amount = (double) ((4.0*interest_month)/100.0);
		this.balance += this.interest_amount;
		System.out.println("account balance: "+this.balance);
	}

}
