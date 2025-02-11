package stack;

public class Stack {
	static int top=-1;
	static char[] stack;
	 
	public static void push(char ele) {
		top++;
		stack[top]=ele;
	}
	
	public static void pop() {
		top--;
	}
	
	public static void main(String[] args) {
		String str="(()";
		stack=new char[str.length()];
		
		boolean flag=true;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				push('(');
			}
			else if(str.charAt(i)==')' && stack[top]!=-1 && stack[top]=='(') {
				pop();
			}
			else {
				flag=false;
				break;
			}
		}
		
		if(top==-1 && flag) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("UnBalanced");
		}
	}
}
