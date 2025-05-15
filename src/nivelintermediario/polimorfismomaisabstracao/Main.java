package nivelintermediario.polimorfismomaisabstracao;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 17, "Aldeia da Folha", 18, NivelNinja.GENIN);
        naruto.habilidadeEspecial();

        System.out.println();

        Uchiha sasuke = new Uchiha("Sasuke", 18, "Aldeia da Folha", 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();


        //Obj uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", 27, "Aldeia da Folha");

        System.out.println();
        //obj 3
        Uchiha madara = new Uchiha("Madara", 40, "Aldeia da Folha", 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();

    }
}
