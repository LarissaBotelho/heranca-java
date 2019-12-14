/*
* Exercicio 7
* Criar uma estrutura hierárquica que contenha as seguintes classes:
* Veiculo (classe abstracta), Bicicleta e Automóvel.
* Os métodos da classe Veiculo são todos abstractos e possuem a seguinte assinatura:
* • listarVerificacoes() • ajustar()
* • limpar()
* Estes métodos são implementados nas subclasses Automóvel e Bicicleta.
* Acrescentar na classe Automóvel o método mudarOleo()
*
* Programadores: Larissa e Hudson
*/

package exercicio7;

//criando classe principal
public class Main {

	// metodo principal para executar outros metodos e inserir valores para o
	// automovel
	public static void main(String[] args) {

		// declarando variavel
		Automovel a = new Automovel();

		// inserindo valores
		a.setAno(2000);
		a.setAro(23);
		a.setCavalos(500);
		a.setCor("preto");
		a.setNumPortas(4);
		a.setQtdRodas(4);
		a.setTipo("Carro");

		// chamando metodos
		a.listarVerificações();
		System.out.println();

		a.limpar();
		System.out.println();

		a.ajustar();
		System.out.println();

		a.mudarOleo();
		System.out.println();

		// declarando variavel
		Bicicleta b = new Bicicleta();

		// inserindo valores
		b.setAno(2019);
		b.setAro(30);
		b.setCor("verde");
		b.setNumMarchas(30);
		b.setQtdRodas(2);
		b.setTipo("speed");

		// chamando metodos
		b.listarVerificações();
		System.out.println();

		b.limpar();
		System.out.println();

		b.ajustar();
		System.out.println();

		b.mudarOleo();

	}

}
