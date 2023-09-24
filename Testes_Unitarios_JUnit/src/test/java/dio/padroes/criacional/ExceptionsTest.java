package dio.padroes.criacional;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TranferenciaEntreContas transferenciaEntreContas = new TranferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
