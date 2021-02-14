
public class rotatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "Hbcde";
		String B = "deHbc";
		System.out.println(isRotate(A, B));
	}

	static boolean isRotate(String A, String B) {
		return A.length() == B.length() && (A + A).contains(B);
	}
}
