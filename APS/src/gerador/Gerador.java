package gerador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gerador {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao gerador de código de barras ");
        Scanner scan = new Scanner(System.in);
        List<ListadeProdutos> lista = new ArrayList<>();
        int[] vect = new int[12];
        String[] resultAux = new String[13];

        int opcao;
        int soma = 0;
        int aux = 1;
        int aux2 = 0;
        String product = "";

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para cadastrar os produtos, 2 para mostrar a lista  ou 0 para sair"));

            if (opcao != 0 && opcao == 1) {
                String pais = JOptionPane.showInputDialog("Digite os 3 digitos do código do seu país: ");

                String empresa = JOptionPane.showInputDialog("Digite os 5 digitos do código da sua empresa: ");

                String produto = JOptionPane.showInputDialog("Digite os 4 digitos do código do seu produto: ");

                String nomeProduto = JOptionPane.showInputDialog("Digite o nome do seu produto: ");

                for (int i = 0; i < 3; i++) {

                    vect[i] = Integer.parseInt(pais.substring(i, aux));
                    resultAux[i] = Integer.toString(vect[i]);
                    aux += 1;
                    //System.out.print(vect[i]);
                }
                aux = 1;

                for (int i = 3; i < 8; i++) {
                    vect[i] = Integer.parseInt(empresa.substring(aux2, aux));
                    resultAux[i] = Integer.toString(vect[i]);
                    // System.out.print(vect[i]);

                    aux2++;
                    aux++;
                }
                aux = 1;
                aux2 = 0;

                for (int i = 8; i < 12; i++) {
                    vect[i] = Integer.parseInt(produto.substring(aux2, aux));
                    resultAux[i] = Integer.toString(vect[i]);
                    //System.out.print(vect[i]);

                    aux2++;
                    aux++;
                }

                for (int i = 0; i < vect.length; i++) {

                    if (i % 2 == 0) {
                        soma += vect[i] * 1;
                    }

                }

                for (int i = 0; i < vect.length; i++) {
                    if (i % 2 == 1) {
                        soma += vect[i] * 3;
                    }
                }

                int auxSoma = soma;
                soma = ((soma / 10) + 1) * 10 - (auxSoma);
                resultAux[12] = Integer.toString(soma);

                JOptionPane.showMessageDialog(null, "Este é o digito dos seus códigos de barras: " + soma);

                for (int i = 0; i < resultAux.length; i++) {
                    product += resultAux[i];
                }

                JOptionPane.showMessageDialog(null, "Este é o seu código de barras completo: " + product);

                lista.add(new ListadeProdutos(product, nomeProduto));
                aux = 1;
                aux2 = 0;
                product = "";
                soma = 0;

            } else if (opcao == 2) {
                JOptionPane.showMessageDialog(null, "Aperte em ok para mostrar a sua lista de Produtos");
                for (ListadeProdutos l : lista) {
                    JOptionPane.showMessageDialog(null, "Código de barras: " + l.codBarras + " Nome do produto: " + l.nomeProduto);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você digitou uma opção inválida, por favor digite novamente");
            }

        } while (opcao != 0);

    }
}
