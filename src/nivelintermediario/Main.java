package nivelintermediario;

public class Main {
    public static void main(String[] args) {

        //Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.modoSabioAtivado();

        //Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 18;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.ativarByakugan();

        //interface implementada
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;

        Boruto.ativarOKarma();
        Boruto.modoSabioAtivado();
        Boruto.ativarJougan();

        /*-----------------------------------------------
        * -----------------------CONSTRUTORES-------------------------*/

        Hokage tobirama = new Hokage("Tobirama Senju", 18, "Folha");
        System.out.println(tobirama);



    }
}
