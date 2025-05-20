package nivelintermediario.polimorfismomaisabstracao;

public class Uchiha extends Ninja{

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, int idade, String aldeia){
        super(nome,idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank){
        super(nome,idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    //Sobreescrevendo método abstrato
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome +" e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei "+numeroDeMissoesConcluidas+" missões");
    }
}
