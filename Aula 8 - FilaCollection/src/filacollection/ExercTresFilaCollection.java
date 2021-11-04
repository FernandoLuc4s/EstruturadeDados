package filacollection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import javax.swing.JOptionPane;

public class ExercTresFilaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> fila = new LinkedList<>();
		Random rnd = new Random();
		int aux=0;
		
		int opcao=0;
		do {
			opcao = Integer.parseInt( JOptionPane.showInputDialog("MENU DE OPÇÕES\n"+"1 - Emitir Senha\n"+"2 - Chamar Senha\n"+"3 - Consultar Senhas\n"+"4 - Sair\n"));
			if(opcao==1) {
				aux = rnd.nextInt(100)+900;
				fila.add(aux);
				JOptionPane.showMessageDialog(null, aux);
			}else if(opcao==2) {
				JOptionPane.showMessageDialog(null, "Senha atual: "+aux);
				JOptionPane.showMessageDialog(null, "Próximo da fila: "+(aux = rnd.nextInt(100)+900));
				fila.add(aux);
			}
			else if(opcao==3) {
				
				JOptionPane.showMessageDialog(null, "As senhas chamadas foram: \n"+fila);
			}
			else {JOptionPane.showMessageDialog(null, "Essa opção não existe !!!!");}
		}while(opcao!=4);
	}

}
