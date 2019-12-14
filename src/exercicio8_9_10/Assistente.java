
package exercicio8_9_10;

//classe assistente filha de funcionario
public class Assistente extends Funcionario {

	// declarando variavel privada
	private int numMatricula;

	// metodo para armazenar dados
	// nome, cpf, salario, endereço, numMatricula
	public Assistente(String nome, long cpf, double salario, String endereco, int numMatricula) {
		super(nome, cpf, salario, endereco);
		this.numMatricula = numMatricula;

	}

	// metodos para retornar e armazenar valores
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	// metodo para exibir os dados em string
	public String exibeDados() {
		String tudo = "";
		return tudo = "Nome :  " + super.getNome() + "\nCPF :  " + super.getCpf() + "\nSalário : " + super.getSalario()
				+ "\nEndereço : " + super.getEndereco() + "\nNúmero da matrícula : " + this.numMatricula;
	}
}