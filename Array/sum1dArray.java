import java.util.Arrays;

public class sum1dArray {

	public static void main(String[] args) {
		int[] num = {1,3,6};
		
		for(int i=1 ; i<num.length;i++ ) {
			num[i] +=num[i-1];
		}
		System.out.println(Arrays.toString(num));
		
	}

}
