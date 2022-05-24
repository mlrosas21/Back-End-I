package Clase2M;

public class MenuVegetariano extends Menu{
    private boolean especias;
    private int salsas;

    public MenuVegetariano(double precioBase, boolean especias, int salsas) {
        super(precioBase);
        this.especias = especias;
        this.salsas = salsas;
    }

    public double incluyeEspecias() {
        if(this.especias){
            return 0.01;
        } else {
            return 0;
        }
    }

    @Override
    public double calcularPrecio() {
        double precioMenuVeggie = getPrecioBase() + (2*this.salsas) + (getPrecioBase()*incluyeEspecias());
        return precioMenuVeggie;
    }

    @Override
    public double prepararMenu() {
        System.out.println("Preparando pedido...");
        System.out.println("Menú: Veggie; Especias: "+this.especias+"; Salsas: "+this.salsas);
        return calcularPrecio();
    }
}
