package filacollection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FilaCollection {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<>();
		
		// adicionando elementos na fila
		fila.add(3); 
		fila.add(10);
		fila.add(43);
		fila.add(5);
		fila.add(32);
		
		System.out.println(fila); // imprimindo toda a fila
		
		fila.remove(); // removendo o primeiro elemento da fila
		
		System.out.println(fila);
		
		System.out.println(fila.peek()); // mostrando o primeiro elemento da fila
		
		System.out.println("O tamamnho da fila é: "+fila.size()); // mostrando o tamanho da fila
		
		fila.add(8);
		
		System.out.println(fila);
		
		System.out.println("A fila está vazia? "+fila.isEmpty()); // verificando se a fila está vazia, o próprio isEmpty retorna um bool
		
		System.out.println("O núemro 5 está na fila? "+fila.contains(5)); //verificando se o parametro infomrado  está na fila, o próprio contains retorna um bool
		
	}

}
