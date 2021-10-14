package aula6;

import java.util.Scanner;

public class ListaRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Lista inicio = null;
		Lista fim = null;
		Lista aux = null;
		Lista anterior = null;
		int num, achou;

		System.out.println("Digite 5 números: ");
		for (int i = 0; i < 5; i++) {

			Lista novo = new Lista();
			novo.num = scan.nextInt();
			if (inicio == null) {
				inicio = novo;
				fim = novo;
				novo.prox = null;
			} else {
				novo.prox = inicio;
				inicio = novo;
			}
		}
		aux = inicio;
		while (aux != null) {
			System.out.println(aux.num + " ");
			aux = aux.prox;
		}

		System.out.println("\n Digite o elemento a ser removido: ");
		num = scan.nextInt();
		aux = inicio;
		achou = 0;

		while (aux != null) {
			if (aux.num == num) {
				achou += 1;
				if (aux == inicio) {
					inicio = aux.prox;
					aux = inicio;
				} else if (aux == fim) {
					anterior.prox = null;
					fim = anterior;
					aux = null;
				} else {
					anterior = aux.prox;
					aux = aux.prox;
				}
			} else {
				anterior = aux;
				aux = aux.prox;
			}
		}
		if (achou == 0) {
			System.out.println("Número não encontrado!");
		} else {
			System.out.println("Nova lista");
			aux = inicio;
			while (aux != null) {
				System.out.println(aux.num);
				aux = aux.prox;
			}
		}
	}

}
