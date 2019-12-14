/* EXERCÍCIO 6
* Implemente a classe Funcionario e a classe Gerente.
* 
* Crie a classe Assistente, que também éum funcionário, e que possui um número de matrícula
* (faça o método GET). Sobrescreva o método exibeDados().
* 
* Sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes Administrativos
* possuem um turno (dia ou noite) e um adicional noturno, crie as classes Tecnico e Administrativo. 
*
* Programadores: Larissa e Hudson.
*/

package exercicio6;

//classe Funcionario
public class Funcionario {

    // declarando variaveis privadas
    private String nome;
    private long cpf;
    private double salario;
    private String endereco;

    // metodo para armazenar dados
    // nome, cpf, salario, endereço
    public Funcionario(final String nome, final long cpf, final double salario, final String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.endereco = endereco;
    }

    // metodos para retornar e armazenar dados
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(final String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(final long cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(final double salario) {
        this.salario = salario;
    }

    // metodo para exibir dados em string
    public String exibeDados() {
        String tudo = "";
        return tudo = "Nome :  " + this.nome + "\nCPF :  " + this.cpf + "\nSalário : " + this.salario + "\nEndereço : "
                + this.endereco;
    }
}