package exercicio8_9_10;

//classe velho filha de imovel
public class Velho extends Imovel{

	//declarando variavel privada
	private double desconto;
	
	//metodo para armazenar dados
	public Velho(String endereco, double preco,double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}

	//metodos para retornar e armazenar dados
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	//metodo para retornar preço com desconto
	public double precoDesconto(){
		super.setPreco(super.getPreco() - this.desconto);
		return super.getPreco();
	}

}