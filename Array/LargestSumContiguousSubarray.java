
public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -1,1,2,-1,2 };
		System.out.println(getLargestSum(a));
	}

	static int getLargestSum(int[] array) {
		int maxsum = Integer.MIN_VALUE, currsum = 0;

		for (int i = 0; i < array.length; i++) {
			currsum = currsum + array[i];
			if (maxsum < currsum) {
				maxsum = currsum;
			}
			if (currsum < 0) {
				currsum = 0;
			}
		}
		return maxsum;
	}
}
