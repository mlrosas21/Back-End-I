package Clase8;

import java.util.ArrayList;
import java.util.Date;

public class BuscadorFacade implements IBuscador{
    private HotelService hotelService;
    private VueloService vueloService;

    public BuscadorFacade() {
        this.hotelService = new HotelService();
        this.vueloService = new VueloService();
    }

    public HotelService getHotelService() {
        return hotelService;
    }

    public VueloService getVueloService() {
        return vueloService;
    }

    @Override
    public void resultadoBusqueda(String fechaIngreso, String origen, String destino) {
        Hotel hotelEncontrado = this.hotelService.buscarHotel(destino, fechaIngreso);
        ArrayList<Vuelo> vueloEncontrado = this.vueloService.buscarVuelo(origen, destino, fechaIngreso);

        System.out.println("Se encontro el hotel: "+hotelEncontrado);
        System.out.println("Se encontro el vuelo: "+vueloEncontrado);
    }
}
