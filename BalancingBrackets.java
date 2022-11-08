
	package com.greatlearning.brakets;

	import java.util.ArrayDeque;
	import java.util.Deque;

	public class BalancingBrackets {
		
		static boolean areBracketsBalanced(String expr) {
			
			Deque<Character> stack = new ArrayDeque<Character>();

			// Traversing the Expression
			for (int i = 0; i < expr.length(); i++) {
				char x = expr.charAt(i);

				if (x == '(' || x == '[' || x == '{') {
					// Push the element in the stack
					stack.push(x);
					continue;
				}

				
				if (stack.isEmpty())
					return false;
				char check;
				switch (x) {
				case ')':
					check = stack.pop();
					if (check == '{' || check == '[')
						return false;
					break;

				case '}':
					check = stack.pop();
					if (check == '(' || check == '[')
						return false;
					break;

				case ']':
					check = stack.pop();
					if (check == '(' || check == '{')
						return false;
					break;
				}
			}

			
			return (stack.isEmpty());
		}

		public static void main(String[] args) {

			// TODO Auto-generated method stub
			 String expr = "([{}]))";
			  
		       
		        if (areBracketsBalanced(expr))
		            System.out.println("The entered String has Balanced Brackets ");
		        else
		            System.out.println("The entered Strings do not contain Balanced Brackets ");
			

		}
	}


