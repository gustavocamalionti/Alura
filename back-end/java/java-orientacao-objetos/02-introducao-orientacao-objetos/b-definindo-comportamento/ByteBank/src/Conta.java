
//Classe conta que contém 4 atributos.
//Saca, deposita, transfere
//Não é uma conta, mas sim uma especificação de conta

//tipo conta:
//    saldo
//    agencia
//    numero
//    titular

public class Conta {
        double saldo;
        int agencia = 1; //Por ter definido o valor da agencia, o default dela passa a ser 1 (antes era zero).
        int numero;
        String titular;

        public void deposita(double valor) {
                this.saldo = this.saldo + valor;
        }

        public boolean saca(double valor){
                if(this.saldo >= valor) {
                        this.saldo = this.saldo - valor;
                        return true; //Para a execução e retorna no método
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

}

//Apartir desse esquema acima, podemos contruir quantas contas quiser (quantos objetos/instância quiser).

