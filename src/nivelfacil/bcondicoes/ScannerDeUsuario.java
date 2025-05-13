package nivelfacil.bcondicoes;

import java.util.Scanner;

public class ScannerDeUsuario {
    public static void main(String[] args) {

        /*
        * Scanner = é um jeito de trazer o usuario para dentro da aplicação
        * Objetivo: O usuário criar um ninja e vamos validar os dados
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva aqui o nome do ninja: ");
        String nome = sc.nextLine();
        System.out.println("O nome do ninja é: "+nome);

        System.out.print("Escreva a idade do ninja: ");
        int idadeDoNinja = sc.nextInt();
        System.out.println("A idade do ninja é: "+idadeDoNinja+" anos");

        sc.close();

        if(idadeDoNinja >=18){
            System.out.println("Ninja é maior de idade e pode ir para missões fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo, precisa treinar mais antes de sair da vila");
        }




    }

}
