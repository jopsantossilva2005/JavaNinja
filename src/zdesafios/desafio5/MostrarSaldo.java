package zdesafios.desafio5;

public class MostrarSaldo {

    public static void mostrarSaldo(ContaBancaria contaBancaria){
        System.out.println("---Relatório saldo---");
        double saldo = contaBancaria.consultarSaldo();
        System.out.printf("Seu saldo atual: %.2f\n",saldo);
    }
}
