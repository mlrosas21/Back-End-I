package Clase4;

public abstract class Manejador {
    protected int loteObjetivo;
    protected int pesoObjetivo;
    protected String estadoEnvase;

    protected Manejador siguienteManejador;

    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador manejador) {
        this.siguienteManejador = manejador;
    }

    public abstract String pasaControl(Articulo art);

}
