package gerador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerador {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao gerador de código de barras ");
        Scanner scan = new Scanner(System.in);
        List<ListadeProdutos> lista = new ArrayList<>();
        int[] vect = new int[12];
        int[] result = new int[13];
        int opcao;
        int soma = 0;
        int aux = 1;
        int aux2 = 0;

        do {
            System.out.println("Digite 1 para cadastrar os produtos ou 0 para sair");
            opcao = scan.nextInt();
            if (opcao != 0) {
                System.out.println("Digite os 3 digitos do código do seu país: ");
                String pais = scan.next();
                System.out.println("Digite os 5 digitos do código da sua empresa: ");
                String empresa = scan.next();
                System.out.println("Digite os 4 digitos do código do seu produto: ");
                String produto = scan.next();
                System.out.println("");
                System.out.println("Este é o seu código de barras");

                for (int i = 0; i < 3; i++) {

                    result[i] = vect[i] = Integer.parseInt(pais.substring(i, aux));
                    aux += 1;
                    System.out.print(vect[i]);
                }
                aux = 1;

                for (int i = 3; i < 8; i++) {
                    result[i] = vect[i] = Integer.parseInt(empresa.substring(aux2, aux));
                    System.out.print(vect[i]);

                    aux2++;
                    aux++;
                }
                aux = 1;
                aux2 = 0;

                for (int i = 8; i < 12; i++) {
                    result[i] = vect[i] = Integer.parseInt(produto.substring(aux2, aux));
                    System.out.print(vect[i]);

                    aux2++;
                    aux++;
                }

                for (int i = 0; i < vect.length; i++) {

                    if (i % 2 == 0) {

//            System.out.println(vect[i]*1);
                        soma += vect[i] * 1;
                    }

                }
                System.out.println();
                for (int i = 0; i < vect.length; i++) {
                    if (i % 2 == 1) {

//            System.out.println(vect[i]*3);
                        soma += vect[i] * 3;
                    }
                }
                int auxSoma = soma;
                soma = ((soma / 10) + 1) * 10 - (auxSoma);
                result[12] = soma;
                System.out.println("");
                System.out.println("Este é o digito dos seus códigos de barras " + soma);
                System.out.println("");
                System.out.print("Este é o seu código de barras completo: ");
                for (int i = 0; i < result.length; i++) {
   
                    System.out.print(result[i]);
                }
            }
        } while (opcao != 0);

    }
}
