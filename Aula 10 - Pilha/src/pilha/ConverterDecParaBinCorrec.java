package pilha;
import java.util.Scanner;
public class ConverterDecParaBinCorrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilhaBinarioCorrec pilha = new PilhaBinarioCorrec();
		Scanner scan = new Scanner(System.in);
		
		int numero,  num, resto;
		System.out.println("Digite um numero");
		 numero = scan.nextInt();
		 num = numero;
		while(numero !=0) {
			resto = numero % 2;
			pilha.push(resto);
			numero = numero/2;
		}
		System.out.println("O número "+num+"nabase decimal é equivalente há :");
		
		while(pilha.isEmpty() == false) {
			resto = pilha.pop();
			System.out.println(resto);
		}
		System.out.println(" na base binária");
	}

}
