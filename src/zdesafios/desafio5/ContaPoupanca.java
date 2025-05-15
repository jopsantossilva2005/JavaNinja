package zdesafios.desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo){
        super(saldo);
    }

    @Override
    public double consultarSaldo(){
        return saldo;
    }

    @Override
    public void depositar(double valor){
        saldo += valor * 0.99;
    }
}
