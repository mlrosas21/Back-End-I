package Clase5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioDescargaProxyTest {
    @Test
    public void descargaExitosa(){
        Usuario usuario = new Usuario(12, "premium");
        IServicioDescarga servicioDescarga = new ServicioDescargaProxy(new ServicioDecarga(), usuario);

        assertEquals("Cancion descargada", servicioDescarga.descargar());
    }

    @Test
    public void descargaFallida(){
        Usuario usuario = new Usuario(12, "free");
        IServicioDescarga servicioDescarga = new ServicioDescargaProxy(new ServicioDecarga(), usuario);

        assertEquals("No tenes servicio Premium", servicioDescarga.descargar());
    }

    @Test
    public void usuarioInvalido(){
        Usuario usuario = new Usuario(12, "sdadfa");
        IServicioDescarga servicioDescarga = new ServicioDescargaProxy(new ServicioDecarga(), usuario);

        assertEquals("Tipo de usuario inválido", servicioDescarga.descargar());
    }

}