public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(002, 410392141);
        //conta.numero = 11; não compila porque o atributo é privado
        conta.setNumero(11);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo; não compila
        //paulo.nome = "Paulo Silveira"; Não compila

        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        //agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
    }
}
