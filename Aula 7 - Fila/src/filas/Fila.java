package filas;

public class Fila {
	public int[] valores;
	public int primeiro;
	public int ultimo;
	public int total;
	
	public Fila() {
			valores = new int[10];
			primeiro = ultimo = total= 0;
		}
	
	public void inserir(int numero) {
		valores[ultimo]=numero;
		ultimo++;
		if (ultimo == valores.length) {
			ultimo=0;
		}
		total++;	
	}
	
	public int remover() {
		int elemento= valores[primeiro];
		primeiro= primeiro+1;
		total--;
		if (primeiro == valores.length) {
			total =0;
		}
		return elemento;
	}
	public boolean vazia() { // verifica se a fila está vazia
		return total==0;
	}
	public boolean cheia() {// verifica se a fila está cheia
		return total==valores.length;
	}
}
