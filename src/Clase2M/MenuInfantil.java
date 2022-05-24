package Clase2M;

public class MenuInfantil extends Menu{
    private int cantJuguetes;

    public MenuInfantil(double precioBase, int cantJuguetes) {
        super(precioBase);
        this.cantJuguetes = cantJuguetes;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() + (3*cantJuguetes);
    }

    @Override
    public double prepararMenu() {
        System.out.println("Preparando pedido...");
        System.out.println("Menu: Infantil; Juguetes: "+this.cantJuguetes);
        return calcularPrecio();
    }
}
