package nivelfacil.darrays;

public class Array {
    public static void main(String[] args) {
        String[] ninja = new String[4];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";

        System.out.println(ninja); // vai dar o erro que representa o espaço na memória do array
        System.out.println(ninja[3]);// esse indice é null pois está vazio

        for(String i : ninja){ // vai imprimir tudo
            System.out.println(i);
        }

        //Sobreescrevendo array
        System.out.println();
        ninja = new String[3];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";

        //imprimindo com for normal
        for(int i = 0; i < ninja.length; i++){
            System.out.println(ninja[i]);
        }
        System.out.println();

        int[] idade = new int[2]; //esse new representa um novo espaço na memória para um objeto
        System.out.println(idade[0]); //vai dar zero

        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);// vai dar 0.0

        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);//vai dar false



    }

}
