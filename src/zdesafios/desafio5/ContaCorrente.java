package zdesafios.desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo){
        super(saldo);
    }

    @Override
    public double consultarSaldo(){
        return saldo;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }
}
