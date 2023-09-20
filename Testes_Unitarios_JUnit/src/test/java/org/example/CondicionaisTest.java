package org.example;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

public class CondicionaisTest {
    @Test
    @EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_19)
    void validarAlgoSomenteSe(){
        Assertions.assertEquals(10, 5+5);
    }
}
