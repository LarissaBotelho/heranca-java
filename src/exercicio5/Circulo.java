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

//classe circulo que implementa figuraGeometrica
public class Circulo implements FiguraGeometrica {
    // declarando variavel privada
    private double tamanhoDoRaio;

    // metodo para verificar dados do circulo
    public Circulo(double tamanhoDoRaio) {
        this.tamanhoDoRaio = tamanhoDoRaio;
    };

    // metodo para calcular perimetro
    public double calculaPerimetro() {
        return 2 * 3.14 * this.tamanhoDoRaio;
    }

    // metodo para calcular area
    public double calculaArea() {
        return 3.14 * (this.tamanhoDoRaio * this.tamanhoDoRaio);
    }

    // metodo para retornar raio
    public double getRaio() {
        return this.tamanhoDoRaio;
    }

    // metodo para retornar valores
    public String retornaValores() {
        return "O raio do circulo e " + this.getRaio();
    }

}