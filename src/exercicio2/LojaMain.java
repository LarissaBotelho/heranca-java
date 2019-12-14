/*
* Exercicio 2:
* Crie uma hierarquia de classes de domínio para uma loja que venda livros, 
* CDs e DVDs. Sobrescreva o método toString() para que imprima:
* Para livros: nome, preço e autor;
* Para CDs: nome, preço e número de faixas;
* Para DVDs: nome, preço e duração.
* Evite ao máximo repetição de código utilizando a palavra super no 
* construtor e no método sobrescrito. Em seguida, crie uma classe Loja 
* com o método main() que adicione 5 produtos diferentes (a sua escolha)
* a um vetor e, por fim, imprima o conteúdo do vetor. 
*
* Programadores: Larissa e Hudson
*/

package exercicio2;

//importando bibliotecas
import java.util.ArrayList;
import java.util.Scanner;

//criando classe principal
public class LojaMain {

	// metodo principal para inserir os dados dos cds em um array
	public static void main(String[] args) {

		// criação do array de produtos
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		// aadastro de produtos
		CDs cd0 = new CDs(789789789);
		cd0.dados("Vamo q vamo", 20.00, 10);

		CDs cd1 = new CDs(456456456);
		cd1.dados("Sai codando", 25.00, 18);

		DVDs dvd0 = new DVDs(123123123);
		dvd0.dados("A espera de um milagre", 30.00, "2:00");

		Livros livro0 = new Livros(741741741);
		livro0.dados("As aventuras de Json", 25.00, "Yann Martelo");

		Livros livro1 = new Livros(258258258);
		livro1.dados("As aventuras de Java", 35.00, "Manchado de Anis");

		// inclusão dos produtos na Array
		produtos.add(cd0);
		produtos.add(cd1);
		produtos.add(dvd0);
		produtos.add(livro0);
		produtos.add(livro1);

		// impressão dos produtos ja cadastrados
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}

	}

	// metodo para efetuar localização de produto
	public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras) {

		// abrindo looping
		for (Produto produto : produtos) {

			// abrindo condicional
			if (produto.GetCod_Barras() == cod_Barras) {

				// imprime no console
				System.out.println(produto.toString());
				return;
			}
		}

		// imprime no console
		System.out.println("Produto não encontrado.");

	}

}
