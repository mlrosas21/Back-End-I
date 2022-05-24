package Clase4;

public class ManejadorPeso extends Manejador{
    @Override
    public String pasaControl(Articulo art) {
        if(art.getPeso()>=1200 && art.getPeso()<=1300){
            return "Aprobado";
        } else {
            return "NO Aprobado";
        }
    }
}
