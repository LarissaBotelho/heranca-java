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

//classe quadrilatero
public abstract class Quadrilatero {
    // declarando variaveis privadas
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    // metodo para verificar dados do quatrilatero
    public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    // metodos para retornar e armazenar valores
    public double calculaPerimetro() {
        return this.lado1 + this.lado2 + this.lado3 + this.lado4;
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double getLado3() {
        return this.lado3;
    }

    public double getLado4() {
        return this.lado4;
    }

    public void setlado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setlado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setlado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setlado4(double lado4) {
        this.lado4 = lado4;
    }

}