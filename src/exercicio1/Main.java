/* EXERCÍCIO 1
* Crie uma classe para representar uma conta corrente, com métodos para depositar uma quantia, sacar uma quantia
* e obter o saldo. Para cada saque serádebitada também uma taxa de operação equivalente à0,5% do valor sacado. Crie, em seguida,
* uma subclasse desta classe anterior para representar uma conta corrente de um cliente especial. Clientes especiais pagam taxas
* de operação de apenas 0,1% do valor sacado. Faça testes com as duas classes e verifique seus resultados.
*
* Programadores: Larissa e Hudson.
*/

package exercicio1;

//importando biblioteca
import java.util.Scanner;

//criando classe principal
public class Main {

    // metodo principal para inserir os dados em outros metodos
    // dar informações de escolha para o usuario
    public static void main(String[] args) {

        // imprime no console
        System.out.println("1 – Cliente Especial");
        System.out.println("2 – Cliente Normal");

        // armazena na variavel
        int r = new Scanner(System.in).nextInt();
        Conta c;

        // abrindo condicionais para definir os valores para outros metodos
        if (r == 1) {
            c = new ContaEspecial(0);

        } else if (r == 2) {
            c = new Conta(0);

        } else {
            System.out.println("Opção inválida!");
            return;
        }

        while (true) {

            // imprime opções no console
            System.out.println("1 – Sacar");
            System.out.println("2 – Depositar");
            System.out.println("3 – Ver o Saldo");
            System.out.println("4 – Sair");

            // armazena na variavel
            int na = new Scanner(System.in).nextInt();
            double val = 0;

            // abrindo condicional
            switch (na) {

            case 1:
                val = 0;

                // imprime no console
                System.out.println("Digite o Valor: ");

                // armazena na variavel
                val = new Scanner(System.in).nextDouble();

                // chama outro metodo
                c.Sacar(val);
                break;

            case 2:
                val = 0;

                // imprime no console
                System.out.println("Digite o Valor: ");

                // armazena na variavel
                val = new Scanner(System.in).nextDouble();

                // chama outro metodo
                c.Depositar(val);
                break;

            case 3:

                // imprime no console
                System.out.println("Saldo:" + c.Saldo());
                break;

            case 4:
                return;

            default:

                // imprime no console
                System.out.println("Opção Inválida!!");

            }
        }
    }
}