package exercicio3;

//criando classe dvds filha de produto
public class DVDs extends Produto{

	//declarando variavel privada
	private String duracao;
	
	//metodo para verificar codido de barras
	public DVDs(int cod_Barras) {
		super(cod_Barras);
	}
	
	// metodo para verificar dados e inserir na variavel
	public void dados (String nome, double preco, String duracao){
		super.dados(nome, preco);
		this.duracao = duracao;
	}

	//transformar dados em string
	public String toString(){
		return super.toString() + "\nDuração: " + this.duracao;	
	}
	
}