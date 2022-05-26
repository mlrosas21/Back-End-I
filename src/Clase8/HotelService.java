package Clase8;

import java.util.ArrayList;
import java.util.Date;

public class HotelService {

    private ArrayList<Hotel> listadoHoteles = new ArrayList<>();

    public ArrayList<Hotel> getListadoHoteles() {
        return listadoHoteles;
    }

    public Hotel buscarHotel(String ciudad, String fechaEntrada) {
        for (Hotel hotel : listadoHoteles) {
            if (hotel.getCiudad().equalsIgnoreCase(ciudad) && hotel.getFechaEntrada().equals(fechaEntrada)) {
                return hotel;
            }
        }
        return null;
    }
}
