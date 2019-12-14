package exercicio8_9_10;

//classe novo filha de imovel
public class Novo extends Imovel {

	// declarando variavel privada
	private double adicional;

	// metodo para armazenar dados
	public Novo(String endereco, double preco, double adicional) {
		super(endereco, preco);
		this.adicional = adicional;

	}

	// metodos para retornar e armazenar dados
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}

	// metodo para retornar novo preço com adicional
	public double novoPreco() {
		super.setPreco(super.getPreco() + this.adicional);
		return super.getPreco();
	}

}