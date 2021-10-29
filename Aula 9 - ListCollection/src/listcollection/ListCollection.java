package listcollection;
import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>(); // criando a lista
		
		lista.add("Maria");
		lista.add("Beto");
		lista.add("Carlos");
		lista.add("Vicente");
		lista.add("Mariana");
		
		for (String nome : lista){
			System.out.println(nome);
		}
		System.out.println("-------------------");
		
		lista.add(2,"antonio"); // adicionando um nome na posição 2
		
		for (String nome : lista){
			System.out.print(nome+" ");
		}
		System.out.println("\n------------------");
		
		System.out.println("Tamanho da Lista: "+ lista.size());
		
		System.out.println("\n------------------");
		
		lista.removeIf(letra -> letra.charAt(0)=='M'); // remover nomes com o primeiro caractere M
		for (String nome : lista){
			System.out.print(nome+" ");
		}
		System.out.println("\n------------------");
		
		System.out.println("Índice do Beto: "+ lista.indexOf("Beto"));
		System.out.println("Índice da maria: "+ lista.indexOf("Maria"));
	}
}
