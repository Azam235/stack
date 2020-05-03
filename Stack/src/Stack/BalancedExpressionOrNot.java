package Stack;
import java.util.Stack;

public class BalancedExpressionOrNot {
	
	public static boolean isBalanced(String str) {
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[' ) {
				stack.push(str.charAt(i));
			}
			
			if(str.charAt(i)=='}' || str.charAt(i)==')' || str.charAt(i)==']' ) {
				
				if(stack.empty()) {
					return false;
				}
				
				char top=stack.pop();
				if ((top == '(' && str.charAt(i) != ')') ||
						(top == '{' && str.charAt(i) != '}') ||
						(top == '[' && str.charAt(i) != ']')) {

						return false;
					}

			}
		}
		return stack.empty();
	}
	
	public static void main(String[] s) {
		String str="{()}[{}]";
		if(isBalanced(str)) {
			System.out.println("the expression is balanced");
		}
		else {
			System.out.println("the expression is not balanced");
		}
	}
}
