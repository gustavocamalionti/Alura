//Em uma interface, não pode existir nada concreto pois o compilador retornará erro.
//Contrato Autenticavel
    //Quem assina esse contrato, precisa implementar
        //Metodo setSenha
        //Metodo Autentica

public abstract interface Autenticavel {

    public void setSenha(int senha);
    public boolean autentica(int senha);

}
