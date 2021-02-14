import java.util.*;

public class calenderDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reformatDate("Feb"));
	}

	public static int reformatDate(String date) {
		Map<String, Integer> m = new HashMap();
		m.put("Jan", 01);
		m.put("Feb", 02);

		return m.get(date);

	}
}
