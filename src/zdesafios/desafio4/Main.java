package zdesafios.desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico("Naruto", 17, "Raposa");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        System.out.println();

        NinjaAvancado sasuke = new NinjaAvancado("Sasuke", 18, "Anjo da Morte", "Sharingan");
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();

    }
}
