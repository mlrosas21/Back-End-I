package Clase2M;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    @Test
    void creandoMenuClasico() {
        MenuClasico menuClasico = new MenuClasico(10);

        assertEquals(10, menuClasico.prepararMenu());
    }

    @Test
    void creandoMenuVegetarianoSinEspeciasYSinSalsas() {
        MenuVegetariano menuVeg = new MenuVegetariano(10,false, 0);
        assertEquals(10, menuVeg.prepararMenu());
    }

    @Test
    void creandoMenuVegetarianoSinEspeciasYCon2Salsas() {
        MenuVegetariano menuVeg = new MenuVegetariano(10,false, 2);
        assertEquals(14, menuVeg.prepararMenu());
    }

    @Test
    void creandoMenuVegetarianoConEspeciasYSinSalsas() {
        MenuVegetariano menuVeg = new MenuVegetariano(10,true, 0);
        assertEquals(10.1, menuVeg.prepararMenu());
    }

    @Test
    void creandoMenuVegetarianoConEspeciasYCon2Salsas() {
        MenuVegetariano menuVeg = new MenuVegetariano(10,true, 2);
        assertEquals(14.1, menuVeg.prepararMenu());
    }

    @Test
    void creandoMenuInfantilSinJuguetes() {
        MenuInfantil menuInfantil = new MenuInfantil(10,0);
        assertEquals(10, menuInfantil.prepararMenu());
    }

    @Test
    void creandoMenuInfantilCon1Juguete() {
        MenuInfantil menuInfantil = new MenuInfantil(10,1);
        assertEquals(13, menuInfantil.prepararMenu());
    }

    @Test
    void creandoMenuInfantilCon3Juguete() {
        MenuInfantil menuInfantil = new MenuInfantil(10,3);
        assertEquals(19, menuInfantil.prepararMenu());
    }
}