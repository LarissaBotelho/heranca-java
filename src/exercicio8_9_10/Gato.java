package exercicio8_9_10;

//classe Gato filha de animal
public class Gato extends Animal {

	// metodo para armazenar dados
	public Gato(String nome, String raca) {
		super(nome, raca);

	}

	// metodo para executar ação
	public String mia() {
		return "Miau";

	}
}