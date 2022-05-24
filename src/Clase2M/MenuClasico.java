package Clase2M;

public class MenuClasico extends Menu{
    public MenuClasico(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase();
    }

    @Override
    public double prepararMenu() {
        System.out.println("Preparando pedido...");
        System.out.println("Menu: Clásico");
        return calcularPrecio();
    }
}
