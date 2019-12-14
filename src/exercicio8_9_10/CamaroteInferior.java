package exercicio8_9_10;

//classe camaroteINferior filha de VIP
public class CamaroteInferior extends VIP {

	// declarando variavel privada
	private String local;

	// metodo para armazenar dados
	public CamaroteInferior(String local) {
		super();
		this.local = local;
	}

	// metodos para retornar e armazenar dados
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public void mostrainf() {
		System.out.println("Camarote inferior");
	}

}