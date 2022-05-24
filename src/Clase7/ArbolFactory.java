package Clase7;

import java.util.HashMap;

public class ArbolFactory {
    private static final HashMap<String, Arbol> listaArboles = new HashMap<>();

    public static Arbol getArbol(String tipoDeArbol) {
        Arbol arbol = listaArboles.get(tipoDeArbol);

        if(arbol == null){
            arbol = new Arbol(tipoDeArbol);
            listaArboles.put(tipoDeArbol, arbol);
            System.out.println("Se creo el tipo de arbol: "+tipoDeArbol);
        }

        return arbol;
    }

}
