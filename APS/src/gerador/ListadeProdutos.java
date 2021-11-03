package gerador;

public class ListadeProdutos {
    
    public String codBarras;
    public String nomeProduto;
    
    public ListadeProdutos(String codBarras, String nomeProduto){
        this.codBarras = codBarras;
        this.nomeProduto = nomeProduto;
    }
    public String getCodBarras(){
        return codBarras;
    }
   
}
