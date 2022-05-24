package Clase7;

public class Arbol {
    private String tipo;
    private int alto;
    private int horizontal;
    private String color;

    public Arbol(String tipo) {
        this.tipo = tipo;
        if(tipo.equalsIgnoreCase("ornamental")) {
            this.setAlto(200);
            this.setHorizontal(400);
            this.setColor("verde");
        } else if (tipo.equalsIgnoreCase("frutal")){
            this.setAlto(500);
            this.setHorizontal(300);
            this.setColor("rojo");
        }
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void plantar() {
        System.out.println("Se planto un arbol del tipo "+ tipo+" que mide "+this.getAlto()+" de alto, "+this.getHorizontal()+" de ancho y es de color "+this.getColor());
    }
}
