package nivelfacil.crepeticao;

public class LacosDeRepeticao {

    public static void main(String[] args) {
        /*
        * Laços de repetiçao: vão repetir infinitamente ou até você mandar parar
        *
        * WHILE:
        * while (condicao) {Bloco de cógido}
        * enquanto (for verdadeira) {tudp aqui vai acontecer repetidamente}
        *
        * FOR:
        * for (int i = 0; i < n; i++) {Bloco de código}
        * i = contador;
        * enquanto i for menor q n(algum valor)
        * i++ (i+1)
        * */

        //WHILE

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 10;

        while (numeroDeClones < numeroMaximoDeClones){
            System.out.println("Naruto criou um clone das sombras");
            numeroDeClones++;
        }

        //FOR
        System.out.println();

        for(int i = 0; i < numeroMaximoDeClones; i++){
            System.out.println("Naruto criou um clone das sombras");
        }

    }
}
