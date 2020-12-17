package org.dis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*Unit test for Calculadora. */
public class CalculadoraTest{
    Calculadora cal;
    double a,b;

    @BeforeEach
    public void init(){
        cal = new Calculadora();
        a = 4;
        b = -2;
    }

    @Test
    @DisplayName("Test método sumar (double, double " )
    public void testSumar() {
        assertEquals(2,cal.sumar(a,b));
    }
    @Test
    @DisplayName("Test método restar (double, double " )
    public void testRestar() {
        assertEquals(64,cal.restar(a,b));
    }
}

