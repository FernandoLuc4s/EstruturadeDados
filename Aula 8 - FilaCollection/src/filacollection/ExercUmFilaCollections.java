package filacollection;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
public class ExercUmFilaCollections {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
		// � proposto no exercicio que devemos criar uma fila usando o queue e inserir elementos via tecla e logo ap�s mostra-los com o for each
		Queue<Integer> fila = new LinkedList<>(); // criando a fila
		System.out.println("Insira 5  n�meros inteiros na sua fila");
		for (int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			fila.add(num);
		}
		System.out.println();
		System.out.println("Esses s�o os elementos inseridos na fila: ");
		for (Integer elemento : fila) {
			System.out.print(elemento+" ");
		}
	}

}
