package exercicios;
import java.util.Scanner;

public class Exerc3 {
	public static void main( String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] nome = new String[5];
		int[] idade = new int[5];
		int result=0;
		String menor = null;
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("digite o nome da pessoa "+ i);
			nome[i] = scan.next();
			System.out.println("digite a idade da pessoa "+ i);
			idade[i] = scan.nextInt();
			result+= idade[i];
		}
		   
		
		for (int i = 0; i < nome.length; i++) {
			if (idade[0]<idade[i]) {
				menor = nome[0];
			}
			if (idade[1]<idade[i]) {
				menor = nome[1];
			}
			if (idade[2]<idade[i]) {
				menor = nome[2];
			}
			if (idade[3]<idade[i]) {
				menor = nome[3];
			}
			if (idade[4]<idade[i]) {
				menor = nome[4];
			}
			
		}
		
		System.out.println("Pessoa mais nova " +menor);
		System.out.println("Média de idade = "+ (result / 5));	
	}
}
