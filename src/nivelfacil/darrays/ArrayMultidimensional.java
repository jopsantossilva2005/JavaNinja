package nivelfacil.darrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];
        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        System.out.println(ninjasEAldeias); // referência na memória

        for(int i = 0; i < ninjasEAldeias.length; i++){
            System.out.println();
            for (int j = 0; j < ninjasEAldeias[i].length; j++){
                System.out.print(ninjasEAldeias[i][j]+" | ");
            }
        }





    }
}
