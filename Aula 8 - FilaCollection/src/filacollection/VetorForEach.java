package filacollection;
import java.util.Scanner;
public class VetorForEach {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] agenda = new String[5];
		// TODO Auto-generated method stub
		for (int i = 0; i < agenda .length; i++) {
			System.out.print("Digite um nome: ");
			
			agenda[i] = scan.next();
		}
		System.out.println();
		
		for (String contato : agenda) { // for each que imprime o vetor
			System.out.println(contato);
		}
	}

}
