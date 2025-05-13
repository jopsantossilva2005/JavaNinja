package nivelfacil.atiposdedados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, array, class, enum
        * Objetivo: Criar um ninja e atribuir métodos a ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase =nome.toUpperCase(); // toUpperCase coloca tudo em CapsLock
        String nomeLowerCase = nome.toLowerCase(); // toLowerCase coloca tudo em minusculo
        System.out.println("Este texto está em CAPSLOCK: "+nomeUpperCase);
        System.out.println("Este nome está normal: "+nome);
        System.out.println("Este nome está em minusculo: "+nomeLowerCase);

        String aldeia = "Aldeia da Folha";

        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("Aldeia em minusculo: "+aldeiaLowerCase);


    }
}
