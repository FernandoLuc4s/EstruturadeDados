package filas;

public class FilaExerc {
	public String[] nomes;
	public int inicio;
	public int fim;
	public int total;
	
	public FilaExerc() { // metotodo construto
		nomes = new String[5]; // tamanho do vetor
		 inicio = fim = total =0; // inicializando as tr~es variaveis
	}
	
	public void inserir(String nome) 
	{
		nomes[fim] = nome;
		fim++;
		
		if(fim ==nomes.length) 
		{
			fim=0;
		}
		total++;
	}
	public String retirar() {
		String nome = nomes[inicio];
		inicio++;
		total--;
		return nome;
	}
	public void mostrar() {
		for (int i = inicio; i < 5; i++) {
			System.out.println(nomes[i]+" ");
		}
		System.out.println();
	}
	public boolean vazia() {
		return total==0;
	}
	public boolean cheia() {
		return total==nomes.length;
	}
	
}
