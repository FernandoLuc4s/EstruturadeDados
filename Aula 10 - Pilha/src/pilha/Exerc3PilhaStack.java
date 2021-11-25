package pilha;

import java.util.Random;
import java.util.Stack;
import java.util.Scanner;

public class Exerc3PilhaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> pilha = new Stack<>();
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números aleatórios de 0 há 1000 que você quer gerar en sua pilha");
		int num = scan.nextInt();
		for (int i = 0; i <num; i++) {
			pilha.push(rnd.nextInt(1000));
		}
		System.out.println(pilha);
	}

}
