public class Teste {

    public static void main(String[] args) {

        EnumPrioridade pMin = EnumPrioridade.MIN;
        EnumPrioridade pMed = EnumPrioridade.NORMAL;
        EnumPrioridade pMax = EnumPrioridade.MAX;

        System.out.println(pMin.name());
        System.out.println(pMed.name());
        System.out.println(pMax.name());

        System.out.println(pMin.ordinal());
        System.out.println(pMed.ordinal());
        System.out.println(pMax.ordinal());

        System.out.println(pMin.getValor());
        System.out.println(pMed.getValor());
        System.out.println(pMax.getValor());


        //EXEMPLOS DE ENUM NO PRÓPRIO JAVA
        //Thread.State.BLOCKED;
        //Thread.State.WAITING;

    }
}
