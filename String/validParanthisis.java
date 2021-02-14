import java.util.Stack;

public class validParanthisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//'(', ')', '{', '}', '[' , ']'
		
		System.out.println(isValid("(())[]{}"));
	}
	
	static boolean isValid(String input) {
		Stack<Character> stack = new Stack<>();
		for (Character character : input.toCharArray()) {
			if(character == '(')
				stack.push(')');
			else if(character == '{')
				stack.push('}');
			else if(character == '[')
				stack.push(']');
			else if(stack.isEmpty() || stack.pop() != character)
				return false;	
		}
				
		return stack.isEmpty();
	}

}
