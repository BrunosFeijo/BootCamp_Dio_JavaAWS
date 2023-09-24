package dio.padroes.criacional;

public class Conta {
    private String numeroConta;
    private int saldo;

    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }
    public void lancaCredito(int valor){
        this.saldo += valor;
    }
    public void lancaDebito(int valor){
        if (valor > saldo) return;

        this.saldo -= valor;
    }
}
