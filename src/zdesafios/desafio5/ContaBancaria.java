package zdesafios.desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    @Override
    public double consultarSaldo(){
        return saldo;
    }

    @Override
    public abstract void depositar(double valor);
}
