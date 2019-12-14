package exercicio3;

//criando classe Livros filha de Produto
public class Livros extends Produto {

	// declarando variavel privada
	private String autor;
	
	// metodo para verificar codigo de barras
	public Livros(int cod_Barras) {
		super(cod_Barras);
	}

	// metodo para verificar dados e inserir na variavel
	public void dados (String nome, double preco, String autor){
		super.dados(nome, preco);
		this.autor = autor;
	}
	
	// transformar dados em string
	public String toString(){
		return super.toString() + "\nAutor: " + this.autor;	
	}
	
	
}