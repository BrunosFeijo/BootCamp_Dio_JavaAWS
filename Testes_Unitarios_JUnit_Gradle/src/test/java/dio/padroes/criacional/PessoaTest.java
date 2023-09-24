package dio.padroes.criacional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Thais", LocalDateTime.of(2000,1,1,15,0));
        Assertions.assertEquals(23,pessoa.getIdade());
    }
    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Thais", LocalDateTime.of(2000,1,1,15,0));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa1 = new Pessoa("João",LocalDateTime.now());
        Assertions.assertFalse(pessoa1.ehMaiorDeIdade());
    }
    @Test
    void validaIgualdade(){
        Pessoa pessoa =new Pessoa("Pessoa 1",LocalDateTime.now());
        Assertions.assertSame(pessoa,pessoa);
    }
}
