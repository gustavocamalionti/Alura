public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; //TODA CONTA TEM UMA REFERÊNCIA PARA UM CLIENTE
    private static int total; // ATRIBUTO COMPARTILHADO DA *******CLASSE*******, E NÃO DA INSTÂNCIA

    //Se na hora de criar a ContaCorrente não chamar o construtor específico (super(int agencia, int numero)), então
    //Deve-se declarar o Construtor padrão aqui na classe mãe.
    //public Conta() {
    //}

    public Conta(int agencia, int numero) {//Construtor padrão // Não é um método // é uma rotina de iniciação.
       //this.total++; >>>>>>>> ERRADO, POIS total NÃO É MAIS DO OBJETO, MAS SIM DA CLASSE EM GERAL.
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
       this.numero = numero;
        //System.out.println("print do número da conta no construtor: " + this.numero);
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

    public void setTitular(Cliente titular) {this.titular = titular;}
    public Cliente getTitular() {return titular;}

    public static int getTotal() { //DA CLASSE
        return Conta.total;
    }


}