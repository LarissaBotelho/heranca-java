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

//classe Tecnico filha de Assistente
public class Tecnico extends Assistente {

	// declarando variavel privada
	private double bonus = 500;

	// metodo para armazenar dados
	// nome, cpf, salario, endereço e numMatricula
	public Tecnico(String nome, long cpf, double salario, String endereco, int numMatricula) {
		super(nome, cpf, salario, endereco, numMatricula);

	}

	// metodo para calcular bonus no salario e retornar
	public double salarioBonus() {
		super.setSalario(super.getSalario() + this.bonus);
		return super.getSalario();
	}
}