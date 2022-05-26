package Clase9;

import java.util.ArrayList;
import java.util.HashMap;

public class RopaFactory {
    private static final HashMap<String,Ropa> listaRopa = new HashMap<>();

    public static Ropa FlyweightFactory(String tipo){
        Ropa ropa = listaRopa.get(tipo);
        if(ropa == null) {
            ropa = new Ropa(tipo);
            listaRopa.put(tipo, ropa);
        }
        return ropa;
    }
}
