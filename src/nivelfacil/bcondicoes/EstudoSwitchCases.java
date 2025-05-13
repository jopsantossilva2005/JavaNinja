package nivelfacil.bcondicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
         * Switch cases: para gerar casos especificos
         * Objetivo: Pedir para o usuário escolher entre os ninjas
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sakura");
        System.out.println("2 - Sasuke");

        int escolhaDoUsuario = sc.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu o Naruto");
                break;
            case 2:
                System.out.println("Você escolheu a Sakura");
                break;
            case 3:
                System.out.println("Você escolheu o Sasuke");
                break;
            default:
                System.out.println("Está opção não existe!");
        }


        sc.close();
    }

}
