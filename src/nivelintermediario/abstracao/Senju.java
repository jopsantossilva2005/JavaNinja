package nivelintermediario.abstracao;

public class Senju extends Hokages {

    //construtor para subclass
    public Senju(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        super(nome, idade, vivoOuNao, aldeia, missoes, saldoBancario, altura);
    }

    @Override
    public void informacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Vivo ou Não: " + this.vivoOuNao);
        System.out.println("Aldeia: " + this.aldeia);
        System.out.println("Missoes: " + this.missoes);
        System.out.println("Saldo bancario: " + this.saldoBancario);
        System.out.println("Altura: " + this.altura);
    }

    //sobreescrevendo método abstrato
    @Override
    public void sabedoriaHokage(){
        System.out.println("Você ganhou sabedoria");
    }


}
