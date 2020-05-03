package Stack;
import java.util.Stack;

public class DuplicateParenthesis {
	
	public static boolean isDuplicate(String s) {
		Stack<Character> stack=new Stack<>();
		
		char[] arr=s.toCharArray();
		for(char c :arr) {
			if(c!=')') {
				stack.push(c);	
			}
			
			else{
				if(stack.peek()=='(') {
					return true;
				}
				while(stack.peek()!='(') {
					stack.pop();
				}
			}
		}
		return false;
	}
	
	public static void main(String[] s) {
		String exp = "(((a+(b))+(c+d)))";

		if (isDuplicate(exp)) {
			System.out.println("The expression have duplicate parenthesis.");
		} else {
			System.out.println("The expression does not have duplicate parenthesis");
		}

	}
}
