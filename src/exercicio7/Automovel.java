
package exercicio7;

//classe Automovel filha de veiculo
public class Automovel extends Veiculo {

	// declarando variaveis
	int cavalos;
	int numPortas;
	String tipo;

	// metodos para retornar e armazenar dados
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	// metodo para listar as verificações do veiculo
	public void listarVerificações() {
		System.out.println("Automovel [cavalos=" + cavalos + ", numPortas=" + numPortas + ", tipo=" + tipo + ", qtdRodas="
				+ qtdRodas + ", cor=" + cor + ", ano=" + ano + ", aro=" + aro + "]");
	}

	// metodos para executar funções e imprimir no console
	public void limpar() {
		System.out
				.println("Lavando o veiculo...... \nLavando o veiculo.......\nLavando o veiculo......\nO veiculo esta Limpo");
	}

	public void ajustar() {
		System.out.println("Ajustando espelhos.......\nAjustando acento......\nA veiculo ajustado com sucesso");
	}

	public void mudarOleo() {
		System.out.println(
				"Trocando oleo do veiculo...... \nTrocando oleo do veiculo.......\nTrocando oleo do veiculo......\nOleo trocado com sucesso");
	}

}
