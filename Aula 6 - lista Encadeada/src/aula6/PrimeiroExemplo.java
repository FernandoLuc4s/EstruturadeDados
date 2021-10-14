package aula6;

import java.util.Scanner;

public class PrimeiroExemplo 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Lista inicio=null;
		Lista fim = null;
		Lista aux;
		
		System.out.println("Digite 5 números: ");
		for (int i = 0; i < 5; i++) {
			Lista novo = new Lista();
			novo.num = scan.nextInt();
			if (inicio==null) {
				inicio = novo;
				fim=novo;
				novo.prox=null;
			} else {
				novo.prox = inicio;
				inicio=novo;
			}
		}
		
		aux = inicio;
		
		while(aux !=null) {
			System.out.println(aux.num+" ");
			aux = aux.prox;
		}
		

	}
	
}
