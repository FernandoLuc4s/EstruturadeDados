package pilha;

import java.util.Stack;

public class Exerc2PilhaStack {
	public static void main(String[]args) {
		Stack<Integer> pilha = new Stack<>();
		int num =5;
		int aux =1;
		int result=0;
		System.out.println();
		
		for (int i = num; i <= num && i>0 ; i--) {
		 pilha.push(i);
		}
		System.out.println(pilha);
		for (int i = num; i <= num && i>0 ; i--) {
			
			 aux *= pilha.peek();
			 pilha.pop(); 
		}
		
		System.out.println(aux);
	}
}
