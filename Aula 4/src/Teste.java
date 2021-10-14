import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);


		int vetorA[] = new int[8];

		int vetorB[] = new int[8];


		for(int i = 0; i < vetorA.length; i++) {

		System.out.print("Digite os dados do vetor A: ");

		vetorA[i] = entrada.nextInt();

		vetorB[i] = vetorB[i] * 2;

		}


		System.out.println("\nOs valores do vetor B são:  \n");


		for(int i = 0; i < vetorB.length; i++) {

		System.out.println(vetorB[i] + " ");

		}

	}

}
