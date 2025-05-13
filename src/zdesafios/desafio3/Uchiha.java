package zdesafios.desafio3;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Especial: "+this.habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }

}
