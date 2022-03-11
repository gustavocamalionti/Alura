
//Gerente, herda tudo do funcionário!
//Getente é um funcionário;
// Gerente herda da classe Funcionario

public class Gerente extends Funcionario {
    //private String nome; //REPETIÇÃO - JÁ FOI DEFENIDA
    //private String cpf; //REPETIÇÃO - JÁ FOI DEFENIDA
    //private double salario; //REPETIÇÃO - JÁ FOI DEFENIDA
    private int senha; //REPETIÇÃO - JÁ FOI DEFENIDA

    public boolean autentica(int senha) {
        if (this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public double getBonitifacao() {
        return salario*0.5;
    }
}
