/* 
* Exercicio 3
* Modifique o código do programa anterior, da seguinte forma:
* a) Adicione um atributo que represente o código de barras do produto 
* (é um valor obrigatório e, portanto, deve ser pedido no construtor);
* b) Sobrescreva o método equals() retornando true se dois produtos 
* possuem o mesmo código de barras;
* c) Na classe Loja, implemente um simples procedimento de busca que, 
* dado um produto e um vetor de produtos, indique em que posição do vetor 
* se encontra o produto especificado ou imprima que o mesmo não foi encontrado;
* d) No método Loja.main(), após a impressão do vetor (feita na questão 2a),
* escolha um dos 5 produtos e crie duas novas instâncias idênticas a ele: uma com o 
* mesmo código de barras e outra com o código diferente. Efetue a busca deste 
* produto no vetor utilizando as duas instâncias e verifique o resultado.
*
* Programadores: Larissa e Hudson
*/

package exercicio3;

//importando bibliotecas
import java.util.ArrayList;
import java.util.Scanner;

//criando classe principal
public class LojaMain {

	// declarando variavel estatica
	static int cod_Barras;

	// metodo principal para inserir os dados dos cds em um array
	public static void main(String[] args) {

		// criação do array de produtos
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		// cadastro de produtos
		CDs cd0 = new CDs(789789789);
		cd0.dados("Agora vai", 20.00, 10);

		CDs cd1 = new CDs(456456456);
		cd1.dados("Sai codando", 25.00, 18);

		DVDs dvd0 = new DVDs(123123123);
		dvd0.dados("A espera de um milagre", 30.00, "2:00");

		Livros livro0 = new Livros(741741741);
		livro0.dados("As aventuras de Json", 25.00, "Yann Martelo");

		Livros livro1 = new Livros(258258258);
		livro1.dados("As aventuras de Python", 35.00, "Manchado de Anis");

		// inclusão dos produtos na array
		produtos.add(cd0);
		produtos.add(cd1);
		produtos.add(dvd0);
		produtos.add(livro0);
		produtos.add(livro1);

		// impressão dos produtos ja cadastrados
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}

		// Busca do produto
		//imprime no console
		System.out.println("\nInforme o código de barras do produto: ");

		//armazena na variavel
		cod_Barras = new Scanner(System.in).nextInt();
		LojaMain.LocalizaProd(produtos, cod_Barras);

	}

	// localiza produto no array
	public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras) {

		// iniciando looping
		for (Produto produto : produtos) {

			// abrindo condicional
			if (produto.GetCod_Barras() == cod_Barras) {

				// imprime no console
				System.out.println(produto.toString());
				return;
			}
		}
		System.out.println("Produto não encontrado.");

	}

}
