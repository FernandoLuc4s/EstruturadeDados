package listcollection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayFruta {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<>();
		
		System.out.println("Digite 5 frutas");
		
		for (int i = 0; i < 5; i++) {
			String fruta = scan.next();
			frutas.add(fruta);
		}
		Collections.sort(frutas); // organizar a lista em ordem alfabética
		for(String fruta : frutas) 
		{
			System.out.print(fruta+" ");
		}
	}

}
