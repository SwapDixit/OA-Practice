import java.util.LinkedHashSet;
import java.util.Set;

public class removedupchar  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(remdup("    geeksforGeeks      "));
		Solution s = new Solution();
		System.out.println(s.removeDups("    geeksforGeeks      "));
	}

	/*
	 * static String remdup(String input) { int i = 0, j = 0;
	 * 
	 * if (input.isBlank() || input.isEmpty()) { return "Invalid"; } String out =
	 * new String(); for (i = 0; i < input.length(); i++) {
	 * 
	 * for (j = i + 1; j < input.length(); j++) { if (input.charAt(i) ==
	 * input.charAt(j)) { break; } out = out + input.charAt(i); }
	 * 
	 * } return out; }
	 * 
	 * }
	 */

	static String remdup(String input) {
		if (input.isBlank() || input.isEmpty()) {
			return "Invalid String";
		}
		String str = new String();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (str.indexOf(ch) < 0) {
				str = str + ch;
			}
		}
		return str;
	}
	
	
	
	
	static String removeDuplicate(String input) {
		
		String op ="";
		for(int i =0;i<input.length();i++) {
			if(op.indexOf(input.charAt(i))<0)
				op+=input.charAt(i);
		}
		return op;
	}
	}
	
	
	class Solution {
	    String removeDups(String S) {
	        String op ="";
	        Set<Character> set = new LinkedHashSet<>();
	        for(char c : S.toCharArray()){
	            if(set.add(c)){
	                op +=c;
	            }
	        }
	       return op;
	    }
	}	
