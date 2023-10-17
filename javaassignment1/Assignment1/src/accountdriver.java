
public class accountdriver {

	public static void main(String[] args) {
		//current account interest calculate and add in balance
		Currentaccount ca = new Currentaccount(200);
		ca.interset_calculate(5);
		
		//savings account interest calculate and add in balance
		Savingsaccount sa = new Savingsaccount(200);
		sa.interset_calculate(5);
	}

}
