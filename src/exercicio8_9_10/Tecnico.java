
package exercicio8_9_10;

//classe tecnico filha de assistente
public class Tecnico extends Assistente{

	//declarando variavel privada
	private double bonus = 500;
	
	//metodo para armazenar dados
	public Tecnico(String nome,long cpf,double salario,String endereco,int numMatricula){
		super(nome,cpf,salario,endereco,numMatricula);
	
		
	}
	
	//metodo para retornar salario com bonus
	public double salarioBonus(){
		super.setSalario(super.getSalario() + this.bonus);
		return super.getSalario();
	}
}