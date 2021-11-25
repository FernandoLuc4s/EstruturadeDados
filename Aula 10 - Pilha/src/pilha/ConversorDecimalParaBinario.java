package pilha;
import java.util.Scanner;

public class ConversorDecimalParaBinario {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pilha pilha = new Pilha();
		
		System.out.println("Digite o numero que quer converter ");
		int decimal = scan.nextInt();
		int aux;
		int resto;
		
		
		
		for(int i =0; i<12; i++) {
			resto = decimal % 2;
			decimal/=2;
			pilha.empilhar(resto);
		}
		
		while(pilha.pilhaVazia()==false){
			resto = pilha.desempilhar();
			System.out.println(resto);
		}
	}

}
