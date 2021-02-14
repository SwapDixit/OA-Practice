
public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 6 };
		int sum = 0, out = 0;
//		for(int i =0 ; i<arr.length;i++) {
//			sum = sum+arr[i];
//			System.out.println(sum);
//		}

		for (int i : arr) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(sum);
		out = ((arr.length + 1) * (arr.length + 2) / 2) - sum;
		System.out.println(out);
	}

}


// Formula = return n*(n+1)/2-sum;