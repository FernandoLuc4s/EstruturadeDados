package listcollection;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
public class MenuContatos {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		int op;
		do {
			String msg = "Agenda de contatos"+
						"\n1 - Inserir Contato"+
						"\n2 - Mostrar Contatos"+
						"\n3 - remover Cotatos"+
						"\n4 - Sair";
			op = Integer.parseInt(JOptionPane.showInputDialog(msg));
			if(op ==1) {
				String contato = JOptionPane.showInputDialog("Nome do contato: ");
				contatos.add(contato);
			}
			if(op==2) {
				Collections.sort(contatos);
				JOptionPane.showMessageDialog(null, contatos);
			}
			if(op==3) {
				String contato = JOptionPane.showInputDialog("Contato a remover: ");
				contatos.remove(contato);
				
				JOptionPane.showMessageDialog(null, "\n\n Contato Removido com sucesso!"+"\n\nNova Lista\n"+contatos);
			}
		}while(op !=4);
	}

}
