package nivelintermediario.abstracaoxinterface;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 18;
        naruto.nomeNinja();
        naruto.tacarKunai();
        naruto.tacarUmaShuriken();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.nomeNinja();
        sasuke.tacarKunai();




    }
}
