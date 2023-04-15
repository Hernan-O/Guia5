import java.util.Scanner;

public class Electrodomestico {
    private int precioBase;
    private String color;
    private char consumo; //De la a a la f;
    private int peso;

    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.peso = 5;
        this.consumo = 'F';
    }

    public Electrodomestico(int precio, int peso) {
        this.peso = peso;
        this.precioBase = precio;
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precioBase = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void elegirColor() {
        System.out.println("Que color será el electrodomestico:\n1-Blanco\n2-Negro\n3-Rojo\n4-Azul\n5-Gris");
        Scanner col = new Scanner(System.in);
        switch (col.nextInt()) {
            case 1 -> setColor("Blanco");
            case 2 -> setColor("Negro");
            case 3 -> setColor("Rojo");
            case 4 -> setColor("Azul");
            case 5 -> setColor("Gris");
            default -> System.out.println("Nao nao nao!");
        }
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra == 'a' || letra == 'A' || letra == 'B' || letra == 'b' || letra == 'c' || letra == 'C' || letra == 'd' || letra == 'D' || letra == 'e' || letra == 'E' || letra == 'F' || letra == 'f') {
        } else {
            this.setConsumo('F');
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }

    public void comprobarColor(String color) {
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris") || color.equalsIgnoreCase("Rojo")) {
        } else {
            this.setColor("Blanco");
        }

    }

    public void precioFinal() {
        char opc = this.getConsumo();
        int peso = this.getPeso();
        switch (opc) {
            case 'A', 'a' -> this.setPrecioBase(this.getPrecioBase() + 100);
            case 'B', 'b' -> this.setPrecioBase(this.getPrecioBase() + 80);
            case 'C', 'c' -> this.setPrecioBase(this.getPrecioBase() + 60);
            case 'D', 'd' -> this.setPrecioBase(this.getPrecioBase() + 50);
            case 'E', 'e' -> this.setPrecioBase(this.getPrecioBase() + 30);
            case 'F', 'f' -> this.setPrecioBase(this.getPrecioBase() + 10);
        }
        if (peso < 19)
            this.setPrecioBase(this.getPrecioBase() + 10);
        else if (peso > 19 && peso < 49)
            this.setPrecioBase(this.getPrecioBase() + 50);
        else if (peso > 49 && peso < 79)
            this.setPrecioBase(this.getPrecioBase() + 80);
        else if (peso > 79)
            this.setPrecioBase(this.getPrecioBase() + 100);
    }
}
