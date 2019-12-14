package exercicio8_9_10;

//classe vip filha de ingresso
public class VIP extends Ingresso {
	
	//declarando variavel privada
	private double adicional = 85;
	
	public VIP() {
		
		super();
	}
	
	//metodo para retornar novo valor com adicional
	public String novoValor(){
		return "O valor do ingresso VIP é de : " + (super.getValor() + adicional);
	}
}