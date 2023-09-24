package dio.padroes.criacional;

public class TranferenciaEntreContas {
    public void transfere(Conta contaOrigem, Conta contaDestino, int valor){
        if (valor <= 0) throw new IllegalArgumentException("valor deve ser maior que zero");

        contaDestino.lancaCredito(valor);
        contaOrigem.lancaDebito(valor);
    }
}
