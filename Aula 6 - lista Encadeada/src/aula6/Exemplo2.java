package aula6;
import java.util.Scanner;


public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Lista inicio=null;
		Lista fim = null;
		Lista aux;
		
		System.out.println("Digite 5 número: ");
		for (int i = 0; i < 5; i++) {
			Lista novo = new Lista();
			novo.num = scan.nextInt();
			if (inicio == null) {
				inicio = novo;
				fim = novo;
				novo.prox = null;
			} else {
				fim.prox = novo;
				fim = novo;
				fim.prox = null;
			}
		}
		
		aux = inicio;
		while (aux!=null) {
			System.out.println(aux.num+" ");
			aux=aux.prox;
		}
	}

}
