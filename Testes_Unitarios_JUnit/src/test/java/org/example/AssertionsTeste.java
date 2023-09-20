package org.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AssertionsTeste {
    @Test
    void validarValorDeOperacoes(){
        //Validando soma
        int resultado = 10;
        assertEquals(resultado,(5+5));

        //Validando igualdade de valor
        double valor = 5.0;
        double outroValor = 5.0;
        assertEquals(valor,outroValor);
    }
    @Test
    void validarSeArraysSaoIguais(){
        //valida se arrays são iguais, comparando um a um
        int[] primeiroArray = {10,20,30,40,50};
        int[] segundoArray = {10,20,30,40,50};
        assertArrayEquals(primeiroArray,segundoArray);

        //Usando arrays de diferentes tipos
        boolean[] flags = {true,false,false};
        assertArrayEquals(new boolean[]{true,false,false},flags);

        double[] valores = {5.0, 10.5,50D,46d};
        assertArrayEquals(new double[]{5.0, 10.5,50D,46d},valores);
    }
    
}
