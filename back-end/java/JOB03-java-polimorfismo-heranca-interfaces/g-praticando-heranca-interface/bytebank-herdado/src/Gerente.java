
//Gerente é um funcionário.
//Gerente herda Funcionario.
//Gerente Assina Contrato Autenticavel

//(Podemos assinar vários contratos, basta colocar na frente Autenticavel,Bonificavel, etc
public class Gerente extends Funcionario implements Autenticavel{
    AutenticacaoUtil autenticador;

    public Gerente() {
       this.autenticador = new AutenticacaoUtil();
    }
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE!");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
