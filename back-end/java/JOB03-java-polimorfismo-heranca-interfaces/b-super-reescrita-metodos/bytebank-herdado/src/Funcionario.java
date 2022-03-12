public class Funcionario {
    private String nome;
    private String cpf;
    protected double salario; // publico para os meus filhos - outras classes não.

    public Funcionario() {

    }

    //Funcionario recebe uma bonificação de 10% do salario como padrão;
    //Problema maior - Gerente e funcionario ganham bonificações diferentes. O que fazer? usar herança!
    public double getBonificacao() {
        return this.salario*0.05;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
