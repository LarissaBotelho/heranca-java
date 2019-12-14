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

//classe Gerente filha de Funcionario
public class Gerente extends Funcionario {

	// metodo para armazenar dados
	// nome, cpf, salario e endereço
	public Gerente(String nome, long cpf, double salario, String endereco) {
		super(nome, cpf, salario, endereco);
	}

	public void Mudar() {

	}
}