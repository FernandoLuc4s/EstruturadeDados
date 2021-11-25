package pilha;

import java.util.Stack;

public class PilhaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<>();
		
		pilha.push("maria");
		pilha.push("Marcelo");
		pilha.push("Pedro");
		pilha.push("Beatriz");
		
		System.out.println(pilha);
		
		System.out.println("Topo da pilha: "+pilha.peek()); // return o elemento do topo
		pilha.pop(); //remove o elemento do topo
		
		pilha.push("Eduardo");
		
		System.out.println(pilha);
	}
}