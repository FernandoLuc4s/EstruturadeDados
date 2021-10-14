package exercicios;
import java.util.Scanner;

public class CorrecaoEx3 {

	public static void main(String[] args) {
		
				Scanner entrada = new Scanner(System.in);

				

				String nomes[] = new String[5];

				int idades[] = new int[5];

				int soma = 0;

				

				for(int i = 0; i < nomes.length; i++) {

					

					System.out.println("Nome: ");

					nomes[i] = entrada.next();

					

					System.out.println("Idade: ");

					idades[i] = entrada.nextInt();

					

					soma += idades[i];

					

				}

				int menor = idades[0];

				int mais_novo = 0;

				

				for(int i = 0; i < idades.length; i++) {

					

					if (idades[i] < menor) {

						menor = idades[i];

						mais_novo = i;

					}                 			

				}

				int media = 0;

				media = soma/idades.length;
				
				System.out.println("\nA média das idades é: " + media + " anos");

				System.out.println("\nA menor idade é do(a): " + nomes[mais_novo] + ", " + menor + " anos");

	}

}
