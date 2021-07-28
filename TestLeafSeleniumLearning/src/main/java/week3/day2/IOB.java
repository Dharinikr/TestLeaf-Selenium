package week3.day2;

public class IOB implements CIBIL
{

	public static void main(String[] args) {
		
		IOB iob = new IOB();
		iob.minimumBalance();
		iob.maximumLoanAmount();
		iob.loanForFarmers();
		iob.CreditScore();
		
		
	}
	public void loanForFarmers() {
		
		System.out.println("Farmers Loan");
	}
	
	public void minimumBalance() {
		System.out.println(1000);
		
	}

	
	public void maximumLoanAmount() {
		System.out.println(1000000);
	}
	
	public void CreditScore() {
		System.out.println(95);
		
	}

}
