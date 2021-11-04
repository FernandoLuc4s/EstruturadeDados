package filacollection;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CorrecaoExercTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner entrada = new Scanner(System.in);
			Random gerador = new Random();
			int op, novasenha;
			Queue<Integer> fila = new LinkedList<>();
			
			do{
				System.out.println("\nMenu de Opções\n");
				System.out.println("1 - Emitir senha");
				System.out.println("2 - Chamar Próxima senha");
				System.out.println("3 - Consultar a fila de Senhas");
				System.out.println("4 - sair");
				System.out.println("\nEscolha uma opção");
				op = entrada.nextInt();
				
				if(op<1 || op>4) {
					System.out.println("\nOpção inválida");
				}
				if(op==1) {
					System.out.println("\nSenha: ");
					novasenha = gerador.nextInt(1000);
					System.out.println(novasenha);
					fila.add(novasenha);
				}
				if(op==2) {
					System.out.println("Próxima senha: "+fila.peek());
				}
				if(op==3) {
					System.out.println("\nPróximas Senhas: ");
					System.out.println(fila);
				}
			}while(op!=4);
			entrada.close();
	}

}
