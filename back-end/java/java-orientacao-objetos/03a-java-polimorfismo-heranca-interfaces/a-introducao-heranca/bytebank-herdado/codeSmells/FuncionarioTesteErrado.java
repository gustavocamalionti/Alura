//Esses problemas no código ou design também são
// chamados de Code Smells (mau cheiro no código).
// Existe um livro famoso Clean Code, do autor Robert
// C Martin, que ficou famoso pois mostra os Code Smells
// e como resolvê-los. O livro já é um pouco antigo, mas
// vale a leitura.

public class FuncionarioTesteErrado {
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; //Funcionario Comum = 0 || Gerente = 1 || Diretor = 2
    private int senha;

    public boolean autentica(int senha){
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    public FuncionarioTesteErrado() {

    }

    //Funcionario recebe uma bonificação de 10% do salario como padrão;
    //Problema maior - Gerente e funcionario ganham bonificações diferentes. O que fazer? usar herança!
    public double getBonificacao() {
        if(this.tipo == 0) { //Funcionario Comum
            return this.salario*0.10;
        } else if(this.tipo == 1) { //Gerente
            return this.salario*1;
        } else { //Diretor
            return this.salario + 1000.0;
        }
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
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
