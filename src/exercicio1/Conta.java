/* EXERCÍCIO 1
* Crie uma classe para representar uma conta corrente, com métodos para depositar uma quantia, sacar uma quantia
* e obter o saldo. Para cada saque serádebitada também uma taxa de operação equivalente à0,5% do valor sacado. Crie, em seguida,
* uma subclasse desta classe anterior para representar uma conta corrente de um cliente especial. Clientes especiais pagam taxas
* de operação de apenas 0,1% do valor sacado. Faça testes com as duas classes e verifique seus resultados.
*
* Programadores: Larissa e Hudson.
*/


package exercicio1;

//criando classe Conta
public class Conta {

    //declarando variavel
    protected double saldo;

    //metodo para armazenar saldo
    public Conta(double pSaldo){
        saldo=pSaldo;
    }

    //metodo para armazenar saldo apos saque
    public void Sacar(double pValor){
        saldo=saldo-(pValor + pValor*0.05);
    }

    //metodo para armazenar saldo apos deposito
    public void Depositar(double pValor){
        saldo=saldo+pValor;
    }

    //metodo para retornar saldo
    public double Saldo(){
        return saldo;
    }

}
