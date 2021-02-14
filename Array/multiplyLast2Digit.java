
public class multiplyLast2Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] out  = new int[100];
		double result=1; 
		for(int i=1;i<100;i++) {
			result = result *i;
			System.out.println(result);
		}
		
		System.out.println(result%100);
		
	}
	
}
