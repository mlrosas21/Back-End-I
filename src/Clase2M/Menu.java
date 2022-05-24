package Clase2M;

public abstract class Menu {
    private double precioBase;

    public Menu(double precioBase) {
        this.precioBase = precioBase;
    }

    public void armarMenu() {
        System.out.println("Armando menú...");
    }

    public abstract double calcularPrecio();

    public double getPrecioBase() {
        return precioBase;
    }

    public abstract double prepararMenu();

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
