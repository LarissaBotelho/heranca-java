package exercicio3;

//criando classe cds filha de produto
public class CDs extends Produto{

	//declarando variavel privada
	private int num_Faixas = 0;

	//metodo construtor
	public CDs(int cod_Barras) {
		super(cod_Barras);
	}

	// metodo para verificar dados e inserir na variavel
	public void dados (String nome, double preco, int num_Faixas){
		super.dados(nome, preco);
		this.num_Faixas = num_Faixas;
	}

	//transformar dados em string
	public String toString(){
		return super.toString() + "\nNúmero de faixas: " + this.num_Faixas;	
	}
}
