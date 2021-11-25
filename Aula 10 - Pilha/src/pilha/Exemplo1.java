package pilha;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pilha pilha = new Pilha();
		
		int posicao;
		for(int i = 0; i<5; i++) {
			System.out.println("Digite um número: ");
			pilha.empilhar(scan.nextInt());
		}
		
		System.out.println();	
		while(pilha.pilhaVazia()==false){
			posicao = pilha.desempilhar();
			System.out.println(posicao);
		}
	}

}
