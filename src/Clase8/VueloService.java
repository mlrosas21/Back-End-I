package Clase8;

import java.util.ArrayList;

public class VueloService {

    private ArrayList<Vuelo> listadoVuelos = new ArrayList<>();

    public ArrayList<Vuelo> getListadoVuelos() {
        return listadoVuelos;
    }

    public ArrayList<Vuelo> buscarVuelo(String origen, String destino, String fechaSalida){
        ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
        for(Vuelo vuelo : listadoVuelos){
            if(vuelo.getOrigen().equalsIgnoreCase(origen) && vuelo.getDestino().equalsIgnoreCase(destino) && vuelo.getFechaSalida().equals(fechaSalida)){
                vuelosEncontrados.add(vuelo);
            }
        }
        return vuelosEncontrados;
    }
}
