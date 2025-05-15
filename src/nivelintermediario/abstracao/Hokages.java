package nivelintermediario.abstracao;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    //construtor
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        int misssoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    //método abstrato sobre informações
    public abstract void informacoes();

    //método abstrato
    public abstract void sabedoriaHokage();
}
