package zdesafios.desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        contaCorrente.depositar(10);
        MostrarSaldo.mostrarSaldo(contaCorrente);
        System.out.println();

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);
        contaPoupanca.depositar(10);
        MostrarSaldo.mostrarSaldo(contaPoupanca);
    }
}
