package nivelfacil.crepeticao;

import java.util.Scanner;

public class WhileTreino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean condicao = true;
        while (condicao) {
            System.out.print("Digite uma n para sair ou qualquer letra para ficar: ");
            String verificacao = sc.nextLine();
            if (verificacao.equals("n")) {
                condicao = false;
            } else {
                System.out.println("vasco");
            }
        }
        System.out.println("Fim do programa");

    }

}
