public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente(); //Objeto Criado, declarando variável e atribuindo referência.
        g1.setNome("Kleber");
        String nome = g1.getNome();

        System.out.println(nome);

    }
}
