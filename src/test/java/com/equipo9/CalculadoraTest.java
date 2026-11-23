package com.equipo9;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculadoraTest {
    @Test void sumaCorrectamente() { assertEquals(5, new Calculadora().sumar(2, 3)); }
    @Test void multiplicaCorrectamente() { assertEquals(12, new Calculadora().multiplicar(3, 4)); }
    @Test void admiteNegativos() { assertEquals(-2, new Calculadora().sumar(-5, 3)); }
}
