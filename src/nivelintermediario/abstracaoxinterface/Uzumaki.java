package nivelintermediario.abstracaoxinterface;

public class Uzumaki extends Ninja implements NinjaInterface {

    @Override
    public void nomeNinja() {
        System.out.println("Nome do ninja: "+nome);
    }

    @Override
    public void tacarUmaShuriken(){
        System.out.println("Tacando uma shuriken");
    }
}
