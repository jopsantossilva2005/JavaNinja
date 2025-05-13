package zdesafios;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto";
        int idade = 14;
        String missao = "pegar bandido";
        String statusDaMissao = "Em andamento";
        char nivelDeDificuldade = 'A';

        if(idade < 15) {
            if(nivelDeDificuldade == 'C' || nivelDeDificuldade == 'D') {
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Falha";
            }
        } else {
            statusDaMissao = "Concluida";
        }

        System.out.println("Nome: "+nomeNinja1);
        System.out.println("Idade: "+idade);
        System.out.println("Missão: "+missao);
        System.out.println("status da missão: "+statusDaMissao);
        System.out.println("Nivel de dificuldade: "+nivelDeDificuldade);

        System.out.println();

        String nomeNinja2 = "Sasuke";
        idade = 15;
        missao = "pegar dois bandidos";
        statusDaMissao = "Em andamento";
        nivelDeDificuldade = 'B';

        if(idade < 15) {
            if(nivelDeDificuldade == 'C' || nivelDeDificuldade == 'D') {
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Falha";
            }
        } else {
            statusDaMissao = "Concluida";
        }

        System.out.println("Nome: "+nomeNinja2);
        System.out.println("Idade: "+idade);
        System.out.println("Missão: "+missao);
        System.out.println("status da missão: "+statusDaMissao);
        System.out.println("Nivel de dificuldade: "+nivelDeDificuldade);

        System.out.println();

        String nomeNinja3 = "Sasuke";
        idade = 15;
        missao = "pegar dois bandidos";
        statusDaMissao = "Em andamento";
        nivelDeDificuldade = 'B';

        if(idade < 15) {
            if(nivelDeDificuldade == 'C' || nivelDeDificuldade == 'D') {
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Falha";
            }
        } else {
            statusDaMissao = "Concluida";
        }

        System.out.println("Nome: "+nomeNinja3);
        System.out.println("Idade: "+idade);
        System.out.println("Missão: "+missao);
        System.out.println("status da missão: "+statusDaMissao);
        System.out.println("Nivel de dificuldade: "+nivelDeDificuldade);






    }

}
