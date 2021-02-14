
public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(16));
		
		System.out.println(nearestPrime(5));
	}

	static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int nearestPrime(int number) {
		int posnum=0;
		int negnum=0;
		for(int i=number+1 ; i>=number;i++) {
			if(isPrime(i)==true) {
				posnum=i;
				break;
				}
		}
		for(int i=number-1 ; i<=number;i--) {
			if(isPrime(i)==true) {
				negnum=i;
				break;
				}
		}
		
		if (posnum - number <= number - negnum)
			return posnum;
		else
			return negnum;	
	}

}
