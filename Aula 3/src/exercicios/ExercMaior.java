package exercicios;

import java.util.Scanner;

public class ExercMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] vet = new int[5];
		
		int maior = 0;
		System.out.println("Digite 5 n�meros para verifica��o ");
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = scan.nextInt();
			if (vet[i]>maior) {
				maior = vet[i];
			}
			
			System.out.println("O maior n�mero �: "+maior);
		}
	}

}
