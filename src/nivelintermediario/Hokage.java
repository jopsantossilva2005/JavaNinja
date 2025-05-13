package nivelintermediario;

public class Hokage {
    String nome;
    int idade;
    String aldeia;
    boolean vivoOuNao;

    public Hokage(){
        //Construtor vazio
    }

    public Hokage(String nome){
        this.nome = nome;
    }

    public Hokage(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
}
