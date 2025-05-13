package nivelfacil.bcondicoes;

public class IfEElse {
    public static void main(String[] args) {
        /*
        * IF e Else - Condições
        * else if
        * Objetivo: Passar o ninja de nivel de acordo com o numero de missões
        * */

        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 9;

        //se (condicao) {faça isso}

        if(numeroDeMissoes >= 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        }
        else if(numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        }
        else{
            System.out.println("Rank: Gennim");
        }



    }

}
