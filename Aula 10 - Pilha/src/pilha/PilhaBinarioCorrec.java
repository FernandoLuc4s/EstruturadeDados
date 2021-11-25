package pilha;

public class PilhaBinarioCorrec {
	private int valores[];
	private int topo;
	
	public PilhaBinarioCorrec(){
		valores  = new int[10];
		topo = -1;
	}
	
	public void push(int elemento) {
		topo = topo +1;
		valores[topo]=elemento;
	}
	
	public int pop() {
		int elemen = valores[topo];
		topo--;
		return elemen;
	}
	
	public boolean isEmpty() {
		if(topo==1)
			return true;
		else 
			return false;
	}
	public boolean isFull() {
		if(topo==9)
			return true;
		else 
			return false;
	}
	
}
