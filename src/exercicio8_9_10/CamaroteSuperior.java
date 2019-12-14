package exercicio8_9_10;

//classe camaroteSuperior filha de VIP
public class CamaroteSuperior extends VIP {

	// declarando variavel privada
	private double adicional = 35;

	public CamaroteSuperior() {
		super();
	}

	// metodo para retornar o valor com adicional
	public double retornaValor() {
		super.setValor(super.getValor() + adicional);
		return super.getValor();

	}

	public void mostrainf(){
		System.out.println("Camarote superior");
	}
}