public class Persona {
    private String nombre;
    private int dni;
    private int edad;
    private String sexo;
    private int peso;
    private int altura;

    public Persona() {
        this.nombre = "";
        this.altura = 0;
        this.peso = 0;
        this.sexo = "H";
        this.edad = 0;
    }

    public Persona(String nombrePersona, int edad, String sexo) {
        this.nombre = nombrePersona;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String sexo, int altura, int peso, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int calcularImc() {
        int flag;
        float alturaEnM = (float) this.altura / 100;
        float imc = (float) (this.peso / Math.pow(alturaEnM, 2));
        System.out.println("El IMC es:" + imc);
        if (imc < 20)
            flag = -1;
        else if (imc > 25)
            flag = 1;
        else
            flag = 0;
        return flag;
    }

    public boolean esMayorEdad() {
        return this.getEdad() >= 18;
    }

    public void comprobarSexo(String sexo) {
        if (!sexo.equals(getSexo()))
            this.setSexo("H");
    }

    public void generaDNI() {
        float nuevoDni = (float) Math.random() * 100000000;
        this.dni = ((int) nuevoDni);
    }

    public void mostrarMayor() {
        boolean romagnoli = this.esMayorEdad();
        System.out.print(this.getNombre());
        if (romagnoli)
            System.out.println(" es mayor de edad");
        else
            System.out.println(" es menor de edad");
    }
}
