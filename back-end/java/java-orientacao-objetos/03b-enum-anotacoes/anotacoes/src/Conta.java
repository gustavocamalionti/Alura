
/**
 *
 *
 *
 * @author Gustavo Camalionti
 * @version 1.0
 */

public abstract class Conta {
    @DoublePositivo
    protected double saldo;
    private int agencia;
    private int numero;

    private static int total;
    public Conta(int agencia, int numero) {

        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor){
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() { return this.numero; }
    public void setNumero(int numero) {
        if (numero<=0) {
            System.out.println("Não pode valor menor ou igual a 0 para Numero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {return this.agencia;}
    public void setAgencia(int agencia) {
        if (agencia<=0) {
            System.out.println("Não pode valor menor ou igual a 0 para Agencia");
            return;
        }
        this.agencia = agencia;
    }

    public static int getTotal() { //DA CLASSE
        return Conta.total;
    }


}