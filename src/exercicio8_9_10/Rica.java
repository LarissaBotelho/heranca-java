package exercicio8_9_10;

//classe pobre filha de rica
public class Rica extends Pessoa{

	//declarando variavel privada
	private double dinheiro;
	
	//metodo para armazenar dados
	public Rica(String nome, int idade,double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	
	//metodo para informar 
	public String fazCompras(){
		return "Faz compras";
	}
}