public class Minoristas extends Clientes{
    private int descuento;

    public Minoristas(int nroFac, int fecha, String nombre, String domicilio, float CUIT, int cant, String item, int precioUnit, int descuento) {
        super(nroFac, fecha, nombre, domicilio, CUIT, cant, item, precioUnit);
        this.descuento = descuento;
    }
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public void precioFinal(){
        this.precioTot = (int) (precioTot*(1-(float)this.descuento/100));
    }

    @Override
    public String toString() {
        return "Minoristas{" +
                "descuento=" + descuento +
                ", nroFac=" + nroFac +
                ", fecha=" + fecha +
                ", Nombre='" + Nombre + '\'' +
                ", Domicilio='" + Domicilio + '\'' +
                ", CUIT=" + CUIT +
                ", cant=" + cant +
                ", item='" + item + '\'' +
                ", precioUnit=" + precioUnit +
                ", precioTot=" + precioTot +
                '}';
    }
}
