package zdesafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean verificacao = true;
        int ninjaCadastrado = 0;

        String[] ninja = new String[3];


        while (verificacao) {
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); //limpar buffer

            switch (opcao) {
                case 1: //Criar
                    System.out.println("---------------------------");
                    if(ninjaCadastrado >= 3){
                        System.out.println("A lista de ninjas está cheia");
                    } else {
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.print("Cadastre o ninja " + (i + 1) + ": ");
                            ninja[i] = sc.nextLine();
                            ninjaCadastrado++;
                            System.out.println(ninja[i] + " foi cadastrado com sucesso!");
                        }
                    }
                    System.out.println("---------------------------");
                    break;
                case 2: //Listar
                    System.out.println("---------------------------");
                    System.out.println("Lista de ninjas");
                    if (ninjaCadastrado == 0){
                        System.out.println("Nenhum ninja foi cadastrado!");
                    } else {
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println((i + 1) + ". Ninja: " + ninja[i]);
                        }
                    }
                    System.out.println("---------------------------");
                    break;
                case 3: //Sair
                    verificacao = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
        System.out.println("Fim do programa!");

    }
}
