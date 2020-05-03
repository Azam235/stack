package Stack;

class Stack{
	int top=-1;
	int max=4;
	int arr[]=new int[max];
	
	void push(int n) {
		if(top>=max-1) {
			System.out.println("stack overflow");
		}
		else {
			arr[++top]=n;
			System.out.println(n+" is pushed");
		}
	}
	
	void pop() {
		if(top<0) {
			System.out.println("stack underflow");
		}
		else {
			int x=arr[top--];
			System.out.println(x+" has been popped");
		}
	}
	
	void peek() {
		if(top<0) {
			System.out.println("stack underflow");
		}
		else {
			System.out.println("top element is "+arr[top]);
		}
	}
	
	void stackElements() {
		if(top<0) {
			System.out.println("stack underflow");
		}
		else {
			System.out.println("stack elements are: ");
			for(int i=0;i<=top;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println("");
		}
	}
}

public class BasicStackImplementation {
	public static void main(String[] S) {
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.stackElements();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.push(3);
		s.push(4);
		s.peek();
		s.stackElements();
	}
}
