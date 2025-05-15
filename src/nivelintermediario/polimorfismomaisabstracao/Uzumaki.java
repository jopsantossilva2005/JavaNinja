package nivelintermediario.polimorfismomaisabstracao;

public class Uzumaki extends Ninja{


    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja ninja) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, ninja);
    }

    //Sobreescrevendo método abstrato
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome +" e esse é meu ataque Uzumaki. Eu ja completei "+numeroDeMissoesConcluidas+" missões");
    }

}

