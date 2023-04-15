public class Lavadora extends Electrodomestico {
    int carga;

    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(int peso, int precio) {
        super();
        this.setPeso(peso);
        this.setPrecioBase(precio);
    }

    public Lavadora(int peso, int precio, int carga, String color, char consu) {
        super();
        this.setPrecioBase(precio);
        this.setPeso(peso);
        this.setCarga(carga);
        this.setConsumo(consu);
        this.setColor(color);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            super.setPrecioBase(super.getPrecioBase() + 50);
        }
    }
}
