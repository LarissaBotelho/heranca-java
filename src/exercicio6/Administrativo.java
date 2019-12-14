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

//classe Admin filha de Assistente
public class Administrativo extends Assistente {

	// declarando variaveis privadas
	private String turno;
	private double adicional;

	// metodo Admin para armazenar dados
	// nome. cpf, salario, endereço, numMatricula, turno e adicional
	public Administrativo(String nome, long cpf, double salario, String endereco, int numMatricula, String turno,
			double adicional) {
		super(nome, cpf, salario, endereco, numMatricula);
		this.turno = turno;
		this.adicional = adicional;
	}

	// metodos para retornar e armazenar dados
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	// metodo para implementar adicional
	public void Turno() {
		if (this.turno.equalsIgnoreCase("noturno")) {
			super.setSalario(super.getSalario() + this.adicional);
		}
	}
}