
//Na herança, a gente herda os atributos e os métodos. No entanto, não herda os construtores.
//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double getValorImposto() {
        return super.saldo*0.01;
    }

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    };

    @Override //Anotação-configuração para o compilador
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;
    }
}
