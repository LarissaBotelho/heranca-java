package exercicio8_9_10;

//classe pobre filha de pessoa
public class Pobre extends Pessoa {

	//metodo para armazenar dados
	public Pobre(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public String trabalha(){
		return "Trabalha";
	}
}