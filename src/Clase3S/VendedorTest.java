package Clase3S;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VendedorTest {

    @Test
    void mostrarCategoria_deberiaCategorizarElEmpleadoComoAprendiz() {
        //DADO
        Empleado empleado = new Empleado("Pedro",2);//10puntos empleado

        //empleado.addAfiliado(afiliado); // 10 puntos empleado
        empleado.vender(2);//10 puntos empleado


        //total empleado: 30
        //total afiliado : 60

        String respuestaEsperada = "Pedro tiene un total de 20 puntos y categoriza como aprendiz";

        //CUANDO
        String resultado = empleado.mostrarCategoria();

        //ENTONCES
        Assertions.assertEquals(respuestaEsperada, resultado);
    }

    @Test
    void mostrarCategoria_deberiaCategorizarElEmpleadoComoNovato() {
        //DADO
        Empleado empleado = new Empleado("Maria",1);
        empleado.vender(1);
        String respuestaEsperada = "Maria tiene un total de 10 puntos y categoriza como novato";

        //CUANDO
        String resultado = empleado.mostrarCategoria();

        //ENTONCES
        Assertions.assertEquals(respuestaEsperada, resultado);
    }

    @Test
    void mostrarCategoria_deberiaCategorizarElAfiliadoComoMaestro(){
        Vendedor afiliado = new Afiliado("ARamon");
        afiliado.vender(4);//60 puntos afiliado
        String respuestaEsperada = "ARamon tiene un total de 60 puntos y categoriza como maestro";
        String resultado = afiliado.mostrarCategoria();

        Assertions.assertEquals(respuestaEsperada, resultado);
    }

    @Test
    void mostrarCategoria_deberiaCategorizarElPasanteComoNovato(){
        Vendedor pasante = new Pasante("GonzaM");
        pasante.vender(8);
        String respuestaEsperada = "GonzaM tiene un total de 40 puntos y categoriza como novato";
        String resultado = pasante.mostrarCategoria();
        Assertions.assertEquals(respuestaEsperada, resultado);
    }
}