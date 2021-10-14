import java.util.Scanner;

public class MatrizTc {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int[][] matriz = new int[3][3];
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.println("Digite os valores da linha "+i+" e da coluna "+j);
					matriz[i][j]=scan.nextInt();
				}
			}
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println();
			}
	}

}
