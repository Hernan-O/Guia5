import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 8;
    }

    public Password(String contra) {
        this.contrasena = contra;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void contraRandom(int longitud) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String nuevaContra = "";
        for (int i = 0; i < longitud; i++) {
            int random = (int) (Math.random() * chars.length() - 1) + 1;
            nuevaContra += chars.charAt(random);
        }
        this.setContrasena(nuevaContra);
        this.setLongitud(longitud);
    }

    public boolean esFuerte(int longitud) {
        char[] caracteres = new char[60];
        int min = 0, may = 0, num = 0;
        int i;
        for (i = 0; i < longitud; i++) {
            caracteres[i] = this.contrasena.charAt(i);
            if (Character.isUpperCase(caracteres[i])) {
                may++;
            } else if (Character.isLowerCase(caracteres[i])) {
                min++;
            } else {
                num++;
            }
        }
        return num > 5 && min > 1 && may > 2;
    }

    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}