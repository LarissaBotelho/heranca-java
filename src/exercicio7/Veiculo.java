package exercicio7;

//criando classe abstrata
public abstract class Veiculo {

	// declarando variaveis
	int qtdRodas;
	String cor;
	int ano;
	int aro;

	// metodos para retornar e armazenar dados
	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	// criando metodos abstratos para executar funções
	abstract void listarVerificações();

	abstract void limpar();

	abstract void ajustar();

	abstract void mudarOleo();

}
