package exercicio8_9_10;

//classe pessoa
public class Pessoa {

	// declarando variaveis privadas
	private String nome;
	private int idade;

	// metodo para armazenar dados
	public Pessoa(String nome, int idade) {

		this.nome = nome;
		this.idade = idade;
	}

	// metodos para retornar e armazenar dados
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void pessoa() {

	}
}