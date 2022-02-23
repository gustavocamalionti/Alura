

public class Conta {
    private double saldo;
    int agencia = 1;
    int numero;
    Cliente titular; //TODA CONTA TEM UMA REFERÊNCIA PARA UM CLIENTE

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double mostrarSaldo() {
        return this.saldo;
    }

}