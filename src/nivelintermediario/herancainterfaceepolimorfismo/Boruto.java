package nivelintermediario.herancainterfaceepolimorfismo;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    @Override
    public void ativarOKarma() {
        System.out.println("Ativando o Karma! Eu sou um HyugaUzumaki");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Ativando o Jougan! Eu sou um HyugaUzumaki");
    }
}

