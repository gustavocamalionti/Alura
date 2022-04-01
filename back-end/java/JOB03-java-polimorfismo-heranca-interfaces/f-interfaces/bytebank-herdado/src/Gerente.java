
//Gerente é um funcionário autenticável, que por sua vez também é um funcionário.
//Gerente herda Funcionario Autenticavel
public class Gerente extends FuncionarioAutenticavel {
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE!");
        return super.getSalario();
    }

}
