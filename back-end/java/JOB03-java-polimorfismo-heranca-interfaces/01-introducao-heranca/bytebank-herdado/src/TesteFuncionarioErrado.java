public class TesteFuncionarioErrado {
    public static void main(String[] args) {
        FuncionarioTesteErrado f1 = new FuncionarioTesteErrado();
        f1.setSalario(3000.0);
        System.out.println(f1.getTipo());
        System.out.println(f1.getBonificacao());

        FuncionarioTesteErrado f2 = new FuncionarioTesteErrado();
        f2.setTipo(1);
        f2.setSalario(5000.0);
        System.out.println(f2.getTipo());
        System.out.println(f2.getBonificacao());

        FuncionarioTesteErrado f3 = new FuncionarioTesteErrado();
        f2.setTipo(2);
        f2.setSalario(10000.0);
        System.out.println(f2.getTipo());
        System.out.println(f2.getBonificacao());
    }
}
