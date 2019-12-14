package exercicio3;

//criando classe produto
public class Produto {

	//declarando variaveis privadas
	private String nome;
	private double preco;
	private int cod_Barras;
	
	//metodo construtor
	public Produto (int cod_Barras){
		this.cod_Barras = cod_Barras;
	}
	
	// metodo para receber os dados do produto
	public void dados (String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	//transforma dados em string
	public String toString(){
		return "\nCodigo de Barra: " + this.cod_Barras
				+  "\nNome: " + this.nome +
				"\nPreco: " + this.preco;	
	}
	
	//metodo para pegar o codigo de barras, pois o atributo é privado
	public int GetCod_Barras(){
		return this.cod_Barras;
	}
}
