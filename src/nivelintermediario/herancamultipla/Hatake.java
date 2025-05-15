package nivelintermediario.herancamultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {
    public void boasVindas(){
        System.out.println(nome+": Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado(){
        System.out.println(nome+" Ativou o Sharingan");
    }

    @Override
    public void ninjaDeElite(){
        System.out.println(nome+": Eu sou um ninja de elite da Anbu");
    }

    @Override
    public void hokageAtivo(){
        System.out.println(nome+": Eu sou um Hokage");
    }
}
