
package exercicio8_9_10;

//classe admin filha de assistente
public class Administrativo extends Assistente {

	//declarando variaveis privadas
	private String turno;
	private double adicional;

	//metodo para armazenar dados
	//nome. cpf, salario, endereço e numMatricula
	public Administrativo(String nome, long cpf, double salario, String endereco, int numMatricula, String turno,
			double adicional) {
		super(nome, cpf, salario, endereco, numMatricula);
		this.turno = turno;
		this.adicional = adicional;
	}

	//metodos para retornar e armazenar dados
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

	//metodo para retornar novo salario com adicional
	public void Turno() {
		if (this.turno.equalsIgnoreCase("noturno")) {
			super.setSalario(super.getSalario() + this.adicional);
		}
	}
}