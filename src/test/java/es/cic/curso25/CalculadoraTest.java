package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);


        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.sumar(10.0);
        cut.restar(3.0);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(7.0, valorActual, 0.000001);

        cut.restar(2.0);
        valorActual = cut.getTotal();

        assertEquals(5.0, valorActual, 0.000001);
    }

    @Test
    public void testMultiplicar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.sumar(10.0);
        cut.multiplicar(3.0);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(30.0, valorActual, 0.000001);

        cut.multiplicar(2.0);
        valorActual = cut.getTotal();

        assertEquals(60.0, valorActual, 0.000001);
    }

    @Test
    public void testDividir() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.sumar(10.0);
        cut.dividir(2.0);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.0, valorActual, 0.000001);

        cut.dividir(2.0);
        valorActual = cut.getTotal();

        assertEquals(2.5, valorActual, 0.000001);
    }

    @Test
     public void dividirPorCero() {
        Calculadora cut = new Calculadora();
        cut.sumar(10);

        assertThrows(ArithmeticException.class,
        () -> cut.dividir(0));
    }

    @Test
    void testLimpiar() {
        Calculadora cut = new Calculadora();
        cut.sumar(10);
        cut.limpiar();

        double valorActual = cut.getTotal();
        assertEquals(0, valorActual);
    }
}
