import java.util.Scanner;

public class Clientes {
    protected int nroFac;
    protected int fecha;
    protected String Nombre;
    protected String Domicilio;
    protected float CUIT;
    protected int cant;
    protected String item;
    protected int precioUnit;
    protected int precioTot;

    public Clientes(int nroFac, int fecha, String nombre, String domicilio, float CUIT, int cant, String item, int precioUnit) {
        this.nroFac = nroFac;
        this.fecha = fecha;
        Nombre = nombre;
        Domicilio = domicilio;
        this.CUIT = CUIT;
        this.cant = cant;
        this.item = item;
        this.precioUnit = precioUnit;
        this.precioTot = getPrecioTot();
    }

    public int getNroFac() {
        return nroFac;
    }

    public void setNroFac(int nroFac) {
        this.nroFac = nroFac;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public float getCUIT() {
        return CUIT;
    }

    public void setCUIT(float CUIT) {
        this.CUIT = CUIT;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nroFac=" + nroFac +
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

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(int precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getPrecioTot() {
        return precioTot;
    }

    public void setPrecioTot() {
        this.precioTot = this.precioUnit*this.cant;
    }


}
