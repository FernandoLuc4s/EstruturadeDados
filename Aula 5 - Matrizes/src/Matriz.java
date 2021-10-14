public class Matriz 
{
	public static void main(String[] args) 
	{
		int [][]matriz= new int[4][4];
		int count=1;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
					matriz[i][j]= count++;
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
