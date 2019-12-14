/*
* Exercicio 4
* Ainda modificando o código do programa anterior, faça com que Produto 
* implemente a interface Comparable, e implemente a comparação por nome. 
* Ao final do método Loja.main(), ordene o vetor utilizando o método java.util.Arrays.sort() 
* e imprima-o novamente. Depois altere a implementação da comparação para ordenar por
* preço e verifique o resultado.
*
* Programadores: Larissa e Hudson
*/

package exercicio4;

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
		livro1.dados("As aventuras de P�ton", 35.00, "Manchado de Anis");

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

		// busca do produto
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

				//imprime no console
				System.out.println(produto.toString());
				return;
			}
		}

		//imprime no console
		System.out.println("Produto n�o encontrado.");

	}

}
