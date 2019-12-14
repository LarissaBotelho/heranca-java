package exercicio8_9_10;

//classe imovel
public class Imovel {

	// declarando variaveis privadas
	private String endereco;
	private double preco;

	// metodo para armazenar dados
	public Imovel(String endereco, double preco) {

		this.endereco = endereco;
		this.preco = preco;
	}

	// metodos para retornar e armazenar dados
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}