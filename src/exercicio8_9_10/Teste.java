/* 
* Exercicio 8-9-10:
* Crie uma classe de Teste com o método main. Neste método:
* crie um assistente administrativo e um técnico. Imprima o número 
* de matrícula e o nome de cada um deles.
*
* crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar. 
* Faça os dois animais caminharem.
*
* teste (como quiser) as classes Rica, Pobre e Miseravel.
*
* crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP. 
* Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. 
* Se for VIP, peça para ele digitar 1 para camarote superior e 2 para camarote 
* inferior. Conforme a escolha do usuário, diga se que o VIP é camarote 
* superior ou inferior. Imprima o valor do ingresso.
*
* crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. 
* Conforme a definição do usuário, imprima o valor final do imóvel.
*
* Programadores: Larissa e Hudson.
*/

package exercicio8_9_10;

//importando biblioteca
import java.util.Scanner;

//classe principal
public class Teste {

    // a. crie um assistente administrativo e um técnico. Imprima o número de
    // matrícula e o nome de cada um deles.
    public static void main(String[] args) {

        // declarando variaveis e seus valores
        String nome = "", endereco = "", turno = "";
        long cpf = 0;
        int numMatricula = 0;
        double adicional = 0, salario = 0;
        char opcao = ' ';
        int pede = 0;
        double preco = 2800;

        // imprime no console e armazena na variavel
        System.out.println("Digite uma opçõo para testar: \na - funcionario"
                + "\nb - cachorro e gato \nc - rico - pobre - miseravel\nd - ingresso \ne - imovel");
        opcao = new Scanner(System.in).next().charAt(0);

        switch (opcao) {

        // a. crie um assistente administrativo e um técnico. Imprima o número de
        // matrícula e o nome de cada um deles.
        case 'a':

            // declarando variaveis que chamam metodos com seus dados
            Administrativo assistAdm = new Administrativo(nome, cpf, salario, endereco, numMatricula, turno, adicional);
            Tecnico assistTec = new Tecnico(nome, cpf, salario, endereco, numMatricula);

            // inserindo valores
            assistAdm.setNome("Mauricio");
            assistAdm.setNumMatricula(123456);

            assistTec.setNome("Joao");
            assistTec.setNumMatricula(1234567);

            // imprime no console
            System.out.println("Nome do assistente Administrativo " + assistAdm.getNome() + "\n"
                    + "Número da matrícula : " + assistAdm.getNumMatricula());

            System.out.println("Nome do assistente técnico : " + assistTec.getNome() + "\n" + "Número da matrícula : "
                    + assistTec.getNumMatricula());

            break;

        // b. crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o
        // miar. Faça os dois animais caminharem.
        case 'b':
            String raca = "";
            Cachorro donguinho = new Cachorro(nome, raca);

            //inserindo valores e ações
            donguinho.setNome("Nymeria");
            donguinho.setRaca("Dire wolf");
            donguinho.caminha();
            donguinho.late();

            //imprime no console
            System.out.println("Nome do cachorro: " + donguinho.getNome() + "\n Raça do cachorro: " + donguinho.getRaca() + "\n " + donguinho.caminha() + "\n " + donguinho.late());

            //inserindo valores e ações
            Gato foba = new Gato(nome, raca);
            foba.setNome("Foba");
            foba.setRaca("Sphynx");
            foba.caminha();
            foba.mia();

            //imprime no console
            System.out.println("Nome do gato: " + foba.getNome() + "\n Raça do gato: " + foba.getRaca() + "\n " + foba.caminha() + "\n " + foba.mia());

            break;

        // c. teste (como quiser) as classes Rica, Pobre e Miseravel.
        case 'c':

            int idade = 33;
        Pessoa rico = new Pessoa(nome, idade);

        rico.setNome("Lucio");
        rico.setIdade(33);

        Pessoa pobre = new Pessoa(nome, idade);

        pobre.setIdade(38);
        pobre.setNome("José");

        Pessoa miseravel = new Pessoa(nome, idade);

        miseravel.setNome("Cleison");
        miseravel.setIdade(25);
        

        System.out.println("Nome do rico: " + rico.getNome() + "\n Idade do rico: " + rico.getIdade());
        System.out.println("Nome do pobre: " + pobre.getNome() + "\n Idade do pobre: " + pobre.getIdade());
        System.out.println("Nome do miseravel: " + miseravel.getNome() + "\n Idade do miseravel: " + miseravel.getIdade());
        
            break;

        // d. crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP.
        // Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se
        // for
        // VIP, peça para ele digitar 1 para camarote superior e 2 para camarote
        // inferior.
        // Conforme a escolha do usuário, diga se que o VIP é camarote superior ou
        // inferior.
        // Imprima o valor do ingresso.
        case 'd':

            // imprime no console e armazena
            System.out.println("Digite 1 para ingresso normal e 2 para vip ");
            pede = new Scanner(System.in).nextInt();

            switch (pede) {
            case 1:
                Ingresso aux = new Ingresso();
                aux.imprimeValor();
                System.out.println("Ingresso normal");
                break;

            case 2:
                pede = 0;

                // imprime no console e armazena
                System.out.println("Digite 1 para camarote superior e 2 para inferior: ");
                pede = new Scanner(System.in).nextInt();
                if (pede == 1) {
                    double valor = 150;

                    CamaroteSuperior cs = new CamaroteSuperior();
                    System.out.println(cs.novoValor());
                    cs.mostrainf();
                    cs.imprimeValor();
                    cs.retornaValor();

                } else if (pede == 2) {
                    String local = "Arena hall";

                    double valor = 115;
                    CamaroteInferior ci = new CamaroteInferior(local);

                    // informa ao usuario no console
                    System.out.println("O local é: " + ci.getLocal() + "\n " + ci.novoValor());
                    ci.mostrainf();
                    ci.imprimeValor();
                

                }
            }

            break;

        // e. crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho.
        // Conforme a
        // definição do usuário, imprima o valor final do imóvel.
        case 'e':

            // imprime no console e armazena
            System.out.println("Digite 1 para imóvel novo e 2 para imóvel velho: ");
            pede = new Scanner(System.in).nextInt();

            switch (pede) {
            case 1:

                adicional = 1500;
                Novo imovel = new Novo(endereco, preco, adicional);
                System.out.println(imovel.novoPreco());

                break;

            case 2:
                double desconto = 700;
                Velho imove = new Velho(endereco, preco, desconto);
                System.out.println(imove.precoDesconto());
                break;
            }

            break;

        default:

            // imprime se nenhuma das condições anteriores forem satisfeitas
            System.out.println("Inválido!");
        }

    }

}