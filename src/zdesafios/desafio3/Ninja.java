package zdesafios.desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Missao: "+this.missao);
        System.out.println("Nivel de dificuldade: "+this.nivelDeDificuldade);
        System.out.println("Status: "+this.statusDaMissao);
    }

}
