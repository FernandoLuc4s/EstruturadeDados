package exercicios;
import java.util.Scanner; 

public class Exerc1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int [] A = new int [5]; 
		int [] B = new int [5]; 
		int [] C = new int [5];
		
		System.out.println("Valores do vetor A ");
		for (int i = 0; i <  A.length; i++) {
			A[i] = entrada.nextInt();
		}
		System.out.println("Valores do vetor B ");
		for (int i = 0; i <  B.length; i++) {
			B[i] = entrada.nextInt();
			
		}
		for (int i = 0; i < C.length; i++) {
			C[0]+=A[i]+B[i];
		}
		System.out.println(C[0]);
	}
}
