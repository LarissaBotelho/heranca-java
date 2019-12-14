package exercicio8_9_10;

//classe animal
public class Animal {

	// declarando variaveis
	private String nome;
	private String raca;

	// metodo para armazenar dados
	public Animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	// metodo para retornar e armazenar dados
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void animal() {

	}

	public String animal(String nome) {
		return nome;

	}

	public String caminha() {
		return "Andei!";
	}
}