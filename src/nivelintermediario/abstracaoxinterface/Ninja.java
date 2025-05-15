package nivelintermediario.abstracaoxinterface;

public abstract class Ninja{
    String nome;
    int idade;
    String aldeia;

    public abstract void nomeNinja();

    public void tacarKunai(){
        System.out.println("Meu nome é "+nome+" eu taquei uma kunai");
    }

}
