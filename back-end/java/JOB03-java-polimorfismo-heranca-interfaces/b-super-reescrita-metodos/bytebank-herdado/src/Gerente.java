
//Gerente, herda tudo do funcionário!
//Getente é um funcionário;
// Gerente herda da classe Funcionario

public class Gerente extends Funcionario {
    //private String nome; //REPETIÇÃO - JÁ FOI DEFENIDA NA SUPER CLASSE(FUNCIONARIO)
    //private String cpf; //REPETIÇÃO - JÁ FOI DEFENIDA NA SUPER CLASSE(FUNCIONARIO)
    //private double salario; //REPETIÇÃO - JÁ FOI DEFENIDA NA SUPER CLASSE(FUNCIONARIO)
    private int senha;

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

//    Super classe representa a classe mãe ou classe pai.
//    Diferente do this que indíca que o atributo é da própria classe.

//    Vimos que a sobrescrita é um conceito importante na herança, pois permite redefinir
//    um comportamento previsto na classe mãe através da classe filha.

    public double getBonififacao() { //**Reescrita** do método da classe mãe na classe filho.
        return super.salario*0.5; //indica que o atributo é da super classe - classe mãe/pai.
    }

    //
}
