package Clase4;

public class AnalistaDeCalidad {
    private Manejador inicial;
    private final String MENSAJE_APROBADO = "APROBADO";

    public AnalistaDeCalidad() {
        this.inicial = new ManejadorLote();
        Manejador controlPeso = new ManejadorPeso();
        Manejador controlEnvase = new ManejadorEnvase();

        inicial.setSiguienteManejador(controlPeso);
        controlPeso.setSiguienteManejador(controlEnvase);
    }
}
