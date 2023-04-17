public class Serie extends Videojuego{
    protected String genero;
    protected String nombre;
    protected String creador;
    protected int cantTemp;
    protected boolean entregado;

    public Serie() {
        this.cantTemp = 3;
        this.entregado = false;
    }

    public Serie(String nombre, String creador) {
        this.nombre = nombre;
        this.creador = creador;
    }

    public Serie(String nombre, String creador, String genero, int cantTemp) {
        this.nombre = nombre;
        this.creador = creador;
        this.genero = genero;
        this.cantTemp = cantTemp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getCantTemp() {
        return cantTemp;
    }

    public void setCantTemp(int cantTemp) {
        this.cantTemp = cantTemp;
    }

    public void devolver() {
        this.entregado = false;
    }

    public void entregar() {
        this.entregado = true;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public boolean compareTo(Object a) {
        if (a instanceof Videojuego) {
            return ((Videojuego) a).titulo == ((Videojuego) this).titulo;
        } else {
            return ((Serie)a).cantTemp == this.cantTemp;
        }
    }

    @Override
    public String toString() {
        return "Serie{" +
                "genero='" + this.genero + '\'' +
                ", nombre='" + this.nombre + '\'' +
                ", creador='" + this.creador + '\'' +
                ", cantTemp=" + this.cantTemp +
                ", entregado=" + this.entregado +
                '}';
    }
}