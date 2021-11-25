package listcollection;

import java.util.ArrayList;
import java.util.Scanner;
public class ExercArrayList {

	public static void main(String[] args) {
		ArrayList<String> titulos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int op;
		String titulo;
		do {
			System.out.println("\n<1> para cadastrar um livro <2> para remover <3> para listar <0> para sair");
			op= scan.nextInt();
		if(op==1) {
			System.out.println("\nDigite o titulo do livro que quer incluir");
			titulo = scan.next();
			titulos.add(titulo);
		}else if(op==2){
			System.out.println("\nDigite o titulo do livro que quer remover");
			titulo = scan.next();
			titulos.remove(titulo);
		}else if(op==3){
			System.out.println("\nEstá é a sua lista de livros");
			for(String nomeLivro : titulos) {
				System.out.println(nomeLivro);
			}
		}else {
			System.out.println("\nDigito inválido, digite novamente");
		}
		}while(op!=0);
	}
}
