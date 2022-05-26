package Clase8;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("24/05/2022", "31/05/2022", "Buenos Aires", "Madrid");
        Vuelo vuelo2 = new Vuelo("24/05/2022", "31/05/2022", "Buenos Aires", "Madrid");
        Hotel hotel1 = new Hotel("24/05/2022", "31/05/2022", "Madrid");

        BuscadorFacade buscador = new BuscadorFacade();

        buscador.getHotelService().getListadoHoteles().add(hotel1);
        buscador.getVueloService().getListadoVuelos().add(vuelo1);
        buscador.getVueloService().getListadoVuelos().add(vuelo2);

        buscador.resultadoBusqueda("24/05/2022", "Buenos Aires", "Madrid");

    }
}
