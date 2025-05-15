package nivelintermediario.abstracao;

public class Main {
    public static void main(String[] args) {

        Senju hashirama = new Senju("Hashirama Senju", 45, true, "folha", 10, 2000, 1.75);
        hashirama.informacoes();
        System.out.println();
        hashirama.sabedoriaHokage();

    }
}
