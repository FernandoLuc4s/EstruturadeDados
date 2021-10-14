import java.util.Random;

public class MatrizAleatorio {

	public static void main(String[] args) {
	
		Random rnd = new Random();
		int[][] alea = new int[3][3];
		
		for (int i = 0; i < alea.length; i++) {
			for (int j = 0; j < alea.length; j++) {
				
				alea[i][j]=rnd.nextInt(10);
			}
		}
		
		for (int i = 0; i < alea.length; i++) {
			for (int j = 0; j < alea.length; j++) {
				System.out.print(alea[i][j]+" ");
			}
			System.out.println();
		}

	}

}
