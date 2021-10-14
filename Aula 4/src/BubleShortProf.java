import java.util.Scanner;

public class BubleShortProf {
	public static void main(String[] args) {



		Scanner entrada = new Scanner(System.in);

		

		int vetor[] = new int [5];

		

		int n, i, aux;

		

		for(i = 0; i <=4; i++) {

			System.out.println("Digite o " + (i + 1) + "º número: ");

			vetor[i] = entrada.nextInt();

		}

		

		for (n = 1; n < 5; n++) {

			

			for(i = 0; i <= 3; i++) {

				

				if(vetor[i] > vetor[i+1]) {

					aux = vetor[i];

					vetor[i] = vetor[i+1];

					vetor[i+1] = aux;

				}

			}

		}

		

		System.out.println("\nO vetor ordenado é: ");

		

		for(i = 0; i <= 4; i++) {

			System.out.print(vetor[i] + " ");

		}

	}
}
