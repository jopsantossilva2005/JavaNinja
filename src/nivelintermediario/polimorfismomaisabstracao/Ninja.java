package nivelintermediario.polimorfismomaisabstracao;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank; //ASSOCIEI COM O ENUM

    //TODO: Incluir 2 novos atributos: numeroDeMissoes, Rank
    // TODO: RANK: Genin, Chuunin, Jounnin, Hokage

    public Ninja(){}

    public Ninja(String nome, int idade, String aldeia){
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //Sobrecarga de construtores
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank){
        this(nome, idade, aldeia); //referencia o construtor de cima
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //Métodos geral: todos os ninjas terão
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome +" e esse é meu ataque especial");
    }

    //Sobreescrevendo um método da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é: "+nome+" Essa é a minha estratégia de combate");
    }


}
