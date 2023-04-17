public class Videojuego {
    protected String titulo;
    protected int horasEst;
    protected String compania;
    protected String genero;
    protected boolean entregado;

    public Videojuego() {
        this.horasEst = 10;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEst) {
        this.titulo = titulo;
        this.horasEst = horasEst;
    }

    public Videojuego(String titulo, int horasEst, String compania, String genero) {
        this.titulo = titulo;
        this.horasEst = horasEst;
        this.compania = compania;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEst() {
        return horasEst;
    }

    public void setHorasEst(int horasEst) {
        this.horasEst = horasEst;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
            return ((Videojuego) a).titulo == (this).titulo;
        } else {
            return ((Serie)a).cantTemp == ((Serie)this).cantTemp;
        }
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEst=" + horasEst +
                ", compania='" + compania + '\'' +
                ", genero='" + genero + '\'' +
                ", entregado=" + entregado +
                '}';
    }
}
