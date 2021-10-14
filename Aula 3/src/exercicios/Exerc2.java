package exercicios;
import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =  new Scanner(System.in);
		int[] A = new int[8];
		int[] B = new int[8];
		
		System.out.println("Digite os valores do vetor A ");
		for (int i = 0; i < A.length; i++) {
			A[i] = teclado.nextInt();
			B[0] = 2 * A[i];
		}
		System.out.println(B[0]);
	}
}
