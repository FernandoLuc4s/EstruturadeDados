package filas;

public class Exemplo01 {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		fila.inserir(5);
		fila.inserir(6);
		
		while (!fila.vazia()) {
			int elemento = fila.remover();
			System.out.println(elemento+" ");
			
		}

	}

}
