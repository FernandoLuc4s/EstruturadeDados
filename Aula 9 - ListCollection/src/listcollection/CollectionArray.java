package listcollection;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionArray {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<>();
		
		frutas.add("Maçã");
		frutas.add("Uva");
		frutas.add("Banana");
		frutas.add("Goiaba");
		frutas.add("Morango");
		
		for (String item: frutas) {
			System.out.println(item); // imprimindo o vetor na tela
		}
		System.out.println("------------------");
		System.out.println("Tamanho do veitor: "+frutas.size());
		System.out.println("------------------");
		frutas.add("Tangerina");
	
		for (String item: frutas) {
			System.out.println(item); // imprimindo o vetor na tela
		}
		System.out.println("------------------");
		Collections.sort(frutas); // coloca o vetor em ordem alfabética
		
		for (String item: frutas) {
			System.out.println(item); // imprimindo o vetor na tela
		}
		System.out.println("------------------");
		frutas.remove("Goiaba");

		for (String item: frutas) {
			System.out.println(item); // imprimindo o vetor na tela
		}
	}

}
