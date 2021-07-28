package week3.day2;

public class IndianBank implements RBI {

	public static void main(String[] args) {
		
		IndianBank ib = new IndianBank();
		ib.minimumBalance();
		ib.maximumLoanAmount();
		ib.loanForEngineers();
	}
public void loanForEngineers() {
	
	System.out.println("Engineers Loan");
}
	
	public void minimumBalance() {
		System.out.println(500);
		
	}

	
	public void maximumLoanAmount() {
		System.out.println(2000000);
		
	}

}
