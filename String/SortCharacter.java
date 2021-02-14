import java.util.Arrays;

public class SortCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Swapnil";
		
		char[] out = s.toLowerCase().toCharArray();
		Arrays.sort(out);
		out[0] =Character.toUpperCase(out[0]); 
		String output = Arrays.toString(out);
		System.out.println(output);
	}
}
