package exercicio8_9_10;

//classe cachorro filha de animal
public class Cachorro extends Animal {

	// metodo para armazenar dados
	public Cachorro(String nome, String raca) {
		super(nome, raca);

	}

	// metodo para executar ação
	public String late() {
		return "Au au";
	}
}