/* EXERCÍCIO 6
* Implemente a classe Funcionario e a classe Gerente.
* 
* Crie a classe Assistente, que também éum funcionário, e que possui um número de matrícula
* (faça o método GET). Sobrescreva o método exibeDados().
* 
* Sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes Administrativos
* possuem um turno (dia ou noite) e um adicional noturno, crie as classes Tecnico e Administrativo. 
*
* Programadores: Larissa e Hudson.
*/

package exercicio6;

//classe Assistente filha de Funcionario
public class Assistente extends Funcionario {

	// declarando variavel privada
	private int numMatricula;

	// metodo para armazenar dados
	// nome, cpf, salario, endereço, numMatricula
	public Assistente(String nome, long cpf, double salario, String endereco, int numMatricula) {
		super(nome, cpf, salario, endereco);
		this.numMatricula = numMatricula;

	}

	// metodos para retornar e armazenar dados
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	// metodo para exibir os dados como string
	public String exibeDados() {
		String tudo = "";
		return tudo = "Nome :  " + super.getNome() + "\nCPF :  " + super.getCpf() + "\nSalário : " + super.getSalario()
				+ "\nEndereço : " + super.getEndereco() + "\nNúmero da matrícula : " + this.numMatricula;
	}
}