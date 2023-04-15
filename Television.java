public class Television extends Electrodomestico {
    float resolucion;
    boolean tdt;

    public Television() {
        this.resolucion = 20;
        this.tdt = false;
    }

    public Television(int precio, int peso) {
        this.setPrecioBase(precio);
        this.setPeso(peso);
    }

    public Television(int resolucion, boolean tdt) {
        super();
        this.setResolucion(resolucion);
        this.setTdt(tdt);
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.getResolucion() > 40) {
            this.setPrecioBase((int) (this.getPrecioBase() * 1.3));
        }
        if (this.isTdt()) {
            this.setPrecioBase((int) (getPrecioBase() + 50));
        }
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", tdt=" + tdt +
                ", precioBase=" + getPrecioBase() +
                ", color='" + getColor() + '\'' +
                ", consumo=" + getConsumo() +
                ", peso=" + getPeso() +
                '}';
    }
}
