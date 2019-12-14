/* Exercicio 5
* Crie a seguinte hierarquia de classes: 
*
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

//classe retangulo filha de quadrilatero
public class Retangulo extends Quadrilatero implements FiguraGeometrica {
    // metodo para verificar dados do retangulo
    public Retangulo(double lado, double altura) {
        super(lado, altura, lado, altura);
    }

    // metodo para calcular perimetro
    public double calculaPerimetro() {
        return this.getLado1() + this.getLado2() + this.getLado3() + this.getLado4();
    }

    // metodo para calcular area
    public double calculaArea() {
        return getLado1() * getLado2();
    }

    // metodo para retornar valores
    public String retornaValores() {
        return "A altura do retangulo e " + this.getLado2() + " e o diametro e " + this.getLado1();
    }

}