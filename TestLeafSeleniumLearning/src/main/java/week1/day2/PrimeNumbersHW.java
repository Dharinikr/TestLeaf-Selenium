package week1.day2;

public class PrimeNumbersHW {

	public static void main(String[] args) {
		
		int given=13;
		boolean flag=false;
		
		
		for (int i=2; i< given ; i++) {
			
			if(given % i == 0) {
				flag = true;
			}
		}
				if (flag) {
				System.out.println("It is a not prime number");
				
			}
			else {
				System.out.println("It is a prime number");
		}
			
		}
}



/*int i=input%input;
 * F8,F6,F5=next brake point

    int given=13;
		boolean flag=false;
		
		
		for (int i=2; i< given ; i++) {
			
			if(given % i == 0) {
				flag = true;
			}
		}
				if (flag) {
				System.out.println("It is a not prime number");
				
			}
			else {
				System.out.println("It is a prime number");
		}*/