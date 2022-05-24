package Clase4;

public class ManejadorLote extends Manejador {

    @Override
    public String pasaControl(Articulo art) {
        String mensaje = "";
        if (art.getLote() >= 1000 && art.getLote() <= 2000) {
            mensaje = "LOTE: aprobado";
            this.getSiguienteManejador().pasaControl(art);

        } else {
            return "NO APROBADO";
        }
        return mensaje;
    }
}
