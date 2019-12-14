package exercicio8_9_10;

//classe miseravel filha de pessoa
public class Miseravel extends Pessoa {

	// metodo para armazenar dados
	public Miseravel(String nome, int idade) {
		super(nome, idade);

	}

	public String mendiga() {
		return "mendiga";
	}
}