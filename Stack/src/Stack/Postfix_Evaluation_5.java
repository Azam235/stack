package Stack;
import java.util.Stack;

public class Postfix_Evaluation_5 {
	
	public static int evaluation(String str) {
		Stack<Integer> stack= new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				stack.push(str.charAt(i) -'0');
			}
			else {
				int x=stack.pop();
				int y=stack.pop();
				
				if(str.charAt(i)=='+') {
					stack.push(y+x);
				}
				if(str.charAt(i)=='-') {
					stack.push(y-x);
				}
				if(str.charAt(i)=='*') {
					stack.push(y*x);
				}
				if(str.charAt(i)=='/') {
					stack.push(y/x);
				}
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] s) {
		String str="138*+";
		System.out.println(evaluation(str));
	}
}
