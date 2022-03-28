
//Correto! Sempre será chamado o método mais específico, primeiro o método de Moto, depois de Carro.
public class Teste {
    public static void main(String[] args) {
        Veiculo m = new Moto();
        m.liga();

        Veiculo c = new Carro();
        c.liga();

        Veiculo v = new Veiculo();
        v.liga();




        Carro z = new Carro();
        z.liga();

        Veiculo h = new Carro();
        h.liga();

        //Código não compila, pois o carro não é uma moto.
//      Moto k = new Carro();
//      k.liga();

    }
}
