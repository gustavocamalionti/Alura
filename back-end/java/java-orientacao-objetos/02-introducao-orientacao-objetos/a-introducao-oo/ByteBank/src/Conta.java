
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

        public void deposita(double valor) {  //void deposita(double valor) / por causa do void, não haverá nenhum retorno como resposta
                this.saldo = this.saldo + valor;
        }
}

//para chamar um método basta escrever: nomeDaReferencia.nomeDoMetodo();
//Apartir desse esquema acima, podemos contruir quantas contas quiser (quantos objetos/instância quiser).

