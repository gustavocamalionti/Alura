public class TesteGerente {

    public static void main(String[] args){
        Gerente g1 = new Gerente();
        g1.setNome("Ricardo");
        g1.setCpf("4381093285");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        boolean autenticou = g1.autentica(2222); //Senha padrão é zero
        System.out.println(autenticou);

        g1.setSenha(2222);
        autenticou = g1.autentica(2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());

    }
}
