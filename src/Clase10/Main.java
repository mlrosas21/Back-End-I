package Clase10;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        try{
            ListaPromedio lista1 = new ListaPromedio(Arrays.asList(1,2,3,4,5,6,7,8,13));
            ListaPromedio lista2 = new ListaPromedio(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
            lista1.getPromedio();

        }catch (Exception e){
            logger.error("La lista es igual a 0");
        }

    }
}
