package zdesafios.desafio4;

public class NinjaAvancado extends NinjaBasico implements  Ninja{
    protected String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade){
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Ativando a habilidade: "+habilidade);
    }

}
