package Clase10;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaPromedio {
    private static final Logger logger = Logger.getLogger(ListaPromedio.class);
    private List<Integer> enteros = new ArrayList<>();

    public ListaPromedio(List<Integer> enteros) throws Exception {
        this.enteros = enteros;
        if(enteros.size()>5){
            logger.debug("La longitud de la lista es mayor 5");
        }
        if(enteros.size()>10){
            logger.debug("La longitud de la lista es mayor 10");
        }
        if(enteros.size()==0){
            throw new Exception();
        }
    }

    public int getSuma(){
        int suma = 0;
        for (int num : enteros){
            suma+=num;
        }
        logger.info(suma);
        return suma;
    }

    public float getPromedio(){
        int suma = this.getSuma();
        float promedio = suma / this.enteros.size();
        logger.info(promedio);
        return promedio;
    }



}