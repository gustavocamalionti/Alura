public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,214154880); //Esses parenteses "()" Invoca o construtor.
        // Essencial para criar exceções.

        System.out.println("N° de Agencia - construtores: " +conta.getAgencia());
        System.out.println("Número da conta - construtores; " + conta.getNumero());
        conta.setAgencia(50);
        conta.setNumero(330);

        System.out.println("N° de Agencia - usando setters: " + conta.getAgencia()); //Apesar da restrição no atributo, ainda tenho como retorno 0.
        System.out.println("Número da conta - Usando Setters: " + conta.getNumero()); //Mesma situação acima, são valores default (CONSTRUTOR).
    }
}
