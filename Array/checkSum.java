import java.util.Arrays;

public class checkSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {0, -1, 2, -3, 1};

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if(num[i]+num[j]==-2) {
					System.out.println(num[i]+"+"+num[j]);
				}
			}

		}
	}
}
