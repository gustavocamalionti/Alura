
//Gerente, herda tudo do funcionário!
//Getente é um funcionário;
// Gerente herda da classe Funcionario

public class Gerente extends Funcionario {
    //private String nome; //REPETIÇÃO - JÁ FOI DEFENIDA NA SUPER CLASSE(FUNCIONARIO)
    //private String cpf; //REPETIÇÃO - JÁ FOI DEFENIDA NA SUPER CLASSE(FUNCIONARIO)
    //private double salario; //REPETIÇÃO - JÁ FOI DEFENIDA NA SUPER CLASSE(FUNCIONARIO)
    private int senha;
    private String login;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
//    Existe um outro conceito nas linguagens OO que se chama de sobrecarga que é
//    muito mais simples do que a sobrescrita e nem dependente da herança.

//    Repare que criamos uma nova versão do método autentica. Agora temos dois métodos
//    autentica na mesma classe que variam na quantidade ou tipos de parâmetros.
//    Isso se chama sobrecarga de métodos.

    public boolean autentica(String login, int senha) { //Conceito de sobrecarga
        if (this.senha == senha && this.login == login) {
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
//    Uma classe mãe pode ter diversas classes filhas e netas.
    public double getBonificacao() { //**Reescrita** do método da classe mãe na classe filho.
        System.out.println("Chamando o método de bonificacao do GERENTE!");
        return (super.getBonificacao() + super.getSalario()); //indica que o atributo é da super classe - classe mãe/pai.
    }

    //
}
