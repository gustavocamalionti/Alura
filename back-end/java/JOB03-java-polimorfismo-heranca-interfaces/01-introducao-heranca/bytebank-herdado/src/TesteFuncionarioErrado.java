public class TesteFuncionarioErrado {
    public static void main(String[] args) {
        FuncionarioTesteErrado f1 = new FuncionarioTesteErrado();
        f1.setSalario(3000.0);
        System.out.println(f1.getTipo());
        System.out.println(f1.getBonificacao());
    }
}
