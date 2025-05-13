package zdesafios.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome =  "Sasuke";
        Sasuke.idade = 19;
        Sasuke.missao = "Matar um monstro";
        Sasuke.nivelDeDificuldade = "C";
        Sasuke.statusDaMissao = "Concluido";
        Sasuke.habilidadeEspecial = "Sharingan";
        Sasuke.mostrarInformacoes();


    }
}
