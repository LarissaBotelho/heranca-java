/* Exercicio 5
* Crie a seguinte hierarquia de classes: 

* Uma interface para representar qualquer forma geométrica, definindo métodos para cálculo do perímetro e cálculo da área da forma;
*
* Uma classe abstrata para representar quadriláteros. Seu construtor deve receber os tamanhos dos 4 lados e o método de cálculo do
* perímetro já pode ser implementado;
* 
* Classes para representar retângulos e quadrados. A primeira deve receber o tamanho da base e da altura no construtor,
* enquanto a segunda deve receber apenas o tamanho do lado;
* 
* Uma classe para representar um círculo. Seu construtor deve receber o tamanho do raio.
* 
* No programa principal, pergunte ao usuário quantas formas ele deseja criar. Em seguida, para cada forma, pergunte se deseja criar
* um quadrado, um retângulos ou um círculo, solicitando os dados necessários para criar a forma. Todas as formas criadas devem ser
* armazenadas em um vetor. Finalmente,imprima: (a) os dados (lados ou raio); (b) os perímetros; (c) as áreas de todas as formas.
* Para (b) e (c), tire vantagem do polimorfismo, enquanto que para (a) utilize instanceof e downcast.
*
* Programadores: Larissa e Hudson.
*/

package exercicio5;

//importando biblioteca
import java.util.Scanner;

//criando classe principal
public class Main {

    // metodo principal para receber falores e chamar metodos para calculos
    // geometricos
    public static void main(String[] args) {

        // declarando variaveis
        int qntdFormas = 0, formaDigitada;

        // imprime no console
        System.out.println("Quantas formas voce deseja implementar?");

        // armazena na variavel
        qntdFormas = new Scanner(System.in).nextInt();

        // declarando array
        FiguraGeometrica figura[] = new FiguraGeometrica[qntdFormas];

        // abre looping
        for (int contador = 0; contador < qntdFormas; contador++) {
            // imprime no console
            System.out.print("Para selecionar um quadrado digite 1: ");
            System.out.print("Para selecionar um retangulo digite 2: ");
            System.out.print("Para selecionar um circulo digite 3: ");

            // armazena o valor inserido na variavel
            formaDigitada = new Scanner(System.in).nextInt();

            // abrindo condicional
            if (formaDigitada == 1) {
                // imprime no console e armazena na variavel
                System.out.println("Digite um lado para o quadrado");
                double ladoDoQuadrado = new Scanner(System.in).nextDouble();

                Quadrado q1 = new Quadrado(ladoDoQuadrado);
                figura[contador] = q1;

            } else if (formaDigitada == 2) {
                // imprime no console e armazena na variavel
                System.out.println("Digite a altura para o retangulo");
                double alturaDoRetangulo = new Scanner(System.in).nextDouble();

                // imprime no console e armazena na variavel
                System.out.println("Digite um lado para o retangulo");
                double ladoDoRetangulo = new Scanner(System.in).nextDouble();

                Retangulo r1 = new Retangulo(ladoDoRetangulo, alturaDoRetangulo);
                figura[contador] = r1;

            } else {
                // imprime no console e armazena na variavel
                System.out.println("Digite a base do circulo");
                double baseDoCirculo = new Scanner(System.in).nextDouble();

                Circulo c1 = new Circulo(baseDoCirculo);

                figura[contador] = c1;
            }
        }

        // abrindo looping
        for (int contador = 0; contador < qntdFormas; contador++) {
            // imprime no console o resultado dos valores, area e perimetro
            System.out.println(figura[contador].retornaValores());
            System.out.println(figura[contador].calculaArea());
            System.out.println(figura[contador].calculaPerimetro());
            System.out.println("---------------------------------------");
        }

    }

}