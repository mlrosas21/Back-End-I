package Clase4;

public class ManejadorEnvase extends Manejador{

    @Override
    public String pasaControl(Articulo art) {
        if(art.getEnvasado().equalsIgnoreCase("sano") || art.getEnvasado().equalsIgnoreCase("casi sano")){
            return "Aprobado";
        } else {
            return "No aprobado";
        }
    }
}
