public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente(); //Objeto Criado, declarando variável e atribuindo referência.
        g1.setNome("Kleber Marcos");
        String nome1 = g1.getNome();

        System.out.println(nome1);

        Funcionario g2 = new Gerente(); //Como Funcionário é a classe mais genérica, podemos fazer isso.
        g2.setNome("Gustavo Camalionti");
        String nome2 = g2.getNome();

        System.out.println(nome2);



    }
}
