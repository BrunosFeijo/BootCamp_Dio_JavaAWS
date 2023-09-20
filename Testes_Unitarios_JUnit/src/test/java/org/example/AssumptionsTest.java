package org.example;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    void validarAlgoSomenteNoUsuarioBruno(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assumptions.assumeTrue((5 + 5) == 10);
    }
}
