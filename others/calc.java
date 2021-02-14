import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Select Operation +-*/ = ");
		char operation = sc.next().charAt(0);
		System.out.println("Enter number = ");
		int a = sc.nextInt();
		System.out.println("Enter number = ");
		int b = sc.nextInt();
		int out = performOperation(a, b, operation);
		System.out.println("O/p = " + out);

	}

	static int performOperation(int a, int b, char Ch) {
		switch (Ch) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			return -1;
		}
	}

}
