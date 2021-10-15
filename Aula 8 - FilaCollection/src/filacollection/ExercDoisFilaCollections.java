package filacollection;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExercDoisFilaCollections {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// neste exercicio foi criado uma fila e doi inserido 5 nomes e algumas operações foram feitas
		Queue<String> fila = new LinkedList<>();
		System.out.println("Insira 5  nomes na sua fila");
		for (int i = 0; i < 5; i++) {
			String nome = scan.nextLine();
			fila.add(nome);
		}
		
		System.out.print("Este é o primeiro elemento da sua fila: "+fila.peek()+"\n");
		
		System.out.print("digite o nome a ser removido: ");
		fila.remove(scan.nextLine());
		
		System.out.println(fila);
		
		System.out.print("digite o nome a ser inserido: ");
		fila.add(scan.nextLine());
		
		System.out.println("o tamanho da sua fila é: "+fila.size());
		
		System.out.print("digite o nome a ser verificado: ");
		fila.contains(scan.nextLine());
		
		System.out.print("A fila está vazia? "+fila.isEmpty());
		

	}

}
