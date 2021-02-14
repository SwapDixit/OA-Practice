import java.util.Arrays;

public class ArraySubtractEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subtract = 1;
		int[] arr = { 1, 4, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] = arr[i] - subtract;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
