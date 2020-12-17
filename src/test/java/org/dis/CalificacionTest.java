package org.dis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*Unit test for Calificacion. */
public class CalificacionTest {
    Calificacion c1 , c2;
    double a,b;

    @BeforeEach
    public void init(){
        c1 = new Calificacion(8,"Biología");
        c2 = new Calificacion(8,"Biología");
    }

    @Test
    @DisplayName("Test método iguales (Calificacion, Calificacion) " )
    public void testIguales() {
        assertTrue(c1.iguales(c2));
    }

    @Test
    @DisplayName("Test método descripcionNota ()")
    public void testDescripcionNota() {
        assertEquals("Notable",c1.descripcionNota());
    }

    @Test
    @DisplayName("Test método MismaAsig (Calificacion)")
    public void testMismaAsig() {
        assertTrue(c1.mismaAsig(c2));
    }

    @Test
    @DisplayName("Test método esMayor (Calificacion)")
    public void testEsMayor() {
        assertTrue(c1.esMayor(c2));
    }

}

