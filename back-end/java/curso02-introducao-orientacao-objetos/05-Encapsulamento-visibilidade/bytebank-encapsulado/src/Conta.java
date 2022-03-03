public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; //TODA CONTA TEM UMA REFERÊNCIA PARA UM CLIENTE


    public Conta(int agencia, int numero) {//Construtor padrão // Não é um método // é uma rotina de iniciação.
       this.agencia = agencia;
       this.numero = numero;
        System.out.println("print do número da conta no construtor: " + this.numero);
    }

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

    public void setTitular(Cliente titular) {this.titular = titular;}
    public Cliente getTitular() {return titular;}


}