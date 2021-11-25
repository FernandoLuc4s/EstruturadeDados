package pilha;

public class Pilha {
	private int numeros[];
	private int topo;
	
	public Pilha() {
		numeros = new int[12];
		topo = -1;
	}
	
	// m�todo para inserir um elemento na pilha
	public void empilhar(int elemento) {
		topo = topo +1;
		numeros[topo] = elemento;
	}
	
	//m�todo para retirar um elemento da pilha
	public int desempilhar() {
		int num = numeros[topo];
		topo--;
		return num;
	}
	//metodo que testa se a pilha est� vazia
	public boolean pilhaVazia() {
		if (topo==-1) 
			return true;
			else
				return false;
	}
}
