package Clase6;

import java.util.HashMap;

public class Serie implements ISerie{
    private String nombre;

    public Serie(String nombre, String link) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getSerie(String nombreSerie) {
        HashMap<String,String> listaSeries = new HashMap<>();
        /* listaSeries.put("Mad Men",)

        if(series.containsKey(nombreSerie)){
            return series.get(nombreSerie);
        }
        */

        return "aaa";
    }
}
