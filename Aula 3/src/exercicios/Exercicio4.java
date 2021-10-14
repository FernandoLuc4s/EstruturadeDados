package exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] nome = new String[5];
		String[] nomeResult = new String[5];
		
		float[] salario = new float[5];
		float result = 0;

		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome da pessoa "+i);
			nome[i] = scan.next();
			System.out.println("Digite o salário da pessoa "+i);
			salario[i] = scan.nextFloat();
		}
		for (int i = 0; i < salario.length; i++) {
			if (salario[0]>salario[i]) {
				result = salario[0];
				nomeResult[0] = nome[0];
				
			}
			if (salario[1]>salario[i]) {
				result = salario[1];
				nomeResult[0] = nome[1];
			}
			if (salario[2]>salario[i]) {
				result = salario[2];
				nomeResult[0] = nome[2];
			}
			if (salario[3]>salario[i]) {
				result = salario[3];
				nomeResult[0] = nome[3];
			}
			if (salario[4]>salario[i]) {
				result = salario[4];
				nomeResult[0] = nome[4];
			}
		}
		
		System.out.println(result+" "+nomeResult[0]);
	}

}
