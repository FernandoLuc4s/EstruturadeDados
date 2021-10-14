package exercicios;

public class Exercicio5 {

	public static void main(String[] args) {
		int[] vetor = new int [10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
			
			if ((vetor[i]%2) == 0) {
				System.out.println(vetor[i]);
			}
		}

	}

}
