package Clase7;

public class Main {
    public static void main(String[] args) {

        for (int i=0; i<1000000; i++){
            Arbol arbol = ArbolFactory.getArbol("Ornamental");
            arbol.plantar();

            Arbol arbol1 = ArbolFactory.getArbol("Frutal");
            arbol1.plantar();

        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
