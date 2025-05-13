package nivelintermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    //Criar um método publico personalizado
    //Um método String deve retornar String
    public String euSouUmNinja(){
        return "Bom dia eu sou um ninja!";
    }

    //Método int vai ter que retornar int (este método tem parametross
    public int anosParaSetornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
