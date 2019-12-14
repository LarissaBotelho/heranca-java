package exercicio8_9_10;

//classe ingresso
public class Ingresso {

	// declarando variavel privada
	private double valor = 150;

	// metedos para retornar e armazenar valores
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	// metodo para informar valor do ingresso
	public String imprimeValor() {
		return "O valor do ingresso é : " + this.valor;
	}

}