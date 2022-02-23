public class TestaSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);

        System.out.println(conta.saca(200)); //conta.saca(200);
        System.out.println(conta.mostrarSaldo());

        //Proibido mexer diretamente na variável/atributo:
        // conta.saldo = conta.saldo - 101;
        // System.out.println(conta.saldo);


    }
}
