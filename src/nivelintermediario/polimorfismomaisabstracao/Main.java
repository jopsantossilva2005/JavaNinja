package nivelintermediario.polimorfismomaisabstracao;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Naruto Uzumaki-----------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 18, "Aldeia da Folha", 20, NivelNinja.GENIN);

        //Referência na memória é o objeto naruto
        System.out.println(naruto); //imprime a referência

        //Valor na memória é oque buscamos atráves da referência. Ex: naruto.nome
        System.out.println(naruto.nome);

        System.out.println();

        System.out.println("-----------Sasuke Uchiha-----------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 19, "Aldeia da Folha", 40, NivelNinja.GENIN);
        System.out.println(sasuke);
    }
}
