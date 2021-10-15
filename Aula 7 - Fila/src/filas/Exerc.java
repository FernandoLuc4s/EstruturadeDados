package filas;
import java.util.Scanner;

public class Exerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		
		FilaExerc fila = new FilaExerc();
		
		String nome;
		
		System.out.println("Digite os nomes da fila: ");
		for (int i = 0; i < 5; i++) {
			nome = scan.nextLine();
			fila.inserir(nome);
		}
		System.out.println();
		while (!fila.vazia()) {
			nome = fila.retirar();
			System.out.println(nome +" ");
		}	
	}
}
