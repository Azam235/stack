package Stack;

class Node{
	int data;
	Node next;
}

class LinkedList{
	private Node top;
	
	public LinkedList() {
		this.top=null;
	}
	
	void push(int x) {
		Node node=new Node();
		if(node==null) {
			System.out.println("heap overflow");
			return;
		}
		node.data=x;
		node.next=top;
		top=node;
		System.out.println(x+" is pushed");
	}
	
	boolean isempty(){
		return top==null;
	}
	
	int peek() {
		if(!isempty()) {
			return top.data;
		}
		else {
			System.out.println("stack underflow");
			return -1;
		}
	}
	
	void pop() {
		if(isempty()) {
			System.out.println("stack underflow");
			return;
		}
		System.out.println(peek()+" is popped");
		top=top.next;
	}
}

public class StackImplementationLimkedList {
	public static void main(String[] S) {
		LinkedList s=new LinkedList();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		System.out.println(s.peek()+" is peek");
		s.pop();
		System.out.println(s.peek()+" is peek");
		s.pop();
		s.pop();
		s.pop();
		s.pop();

	}
}
