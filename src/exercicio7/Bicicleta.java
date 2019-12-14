package exercicio7;

//criando classe Bicicleta filha de veiculo
public class Bicicleta extends Veiculo {

	// declarando variaveis
	int numMarchas;
	String tipo;

	// metodos para retornar e armazenar dados
	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// metodo para listar as verificações do veiculo
	public void listarVerificações() {
		System.out.println("Bicicleta [numMarchas=" + numMarchas + ", tipo=" + tipo + ", qtdRodas=" + qtdRodas + ", cor="
				+ cor + ", ano=" + ano + ", aro=" + aro + "]");
	}

	// metodos para executar funções e imprimir na tela
	public void limpar() {
		System.out.println("Limpando a bicicleta...... \n.......\n......\nA bicicleta esta Limpa");
	}

	public void ajustar() {
		System.out
				.println("Ajustando freios...... \nAjustando guidom.......\nAjustando acento......\nA bicicleta esta ajustada");
	}

	public void mudarOleo() {
		System.out.println("trocando oleo de freio da bicicleta...... \n.......\n......\nOleo trocado com sucesso");
	}

}
