public enum EnumPrioridade {

    MIN(1),NORMAL(5),MAX(10),SUPERMAX(11);

    private int valor;

    EnumPrioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
