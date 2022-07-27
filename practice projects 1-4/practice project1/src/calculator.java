import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
	      double a;
	      double b;
	      double ans;
	      char op;
	      Scanner reader = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      a = reader.nextDouble();
	      b = reader.nextDouble();
	      System.out.print("\nEnter an operator (-, +, /, *): ");
	      op = reader.next().charAt(0);
	      switch(op) {
	         case '-': ans = a - b;
	            break;
	         case '+': ans = a + b;
	            break;
	         case '/': ans = a / b;
	            break;
	         case '*': ans = a * b;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.printf(a + " " + op + " " + b + " = " + ans);
	   }
}
