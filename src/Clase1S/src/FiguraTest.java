package Clase1S.src;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {
    Figura cir = new Circulo(3.2);
    Figura cua= new Cuadrado(2.8);
    Figura cir2 = new Circulo(0);

    @Test
    void area() {
        assertEquals(32,Math.round(cir.area()));
        assertEquals(8, Math.round(cua.area()));
    }

    @Test
    void area_2() {
        assertNotEquals(23, Math.round(cua.area()));
    }
    @Test
    void area_3() {
        assertEquals(0, Math.round(cir2.area()));
    }
}