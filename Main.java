import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el ejercicio que desea realizar");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()) {
            case 1 -> ejercicio1();
            case 2 -> ejercicio2();
            case 3 -> ejercicio3();
        }
    }

    public static void ejercicio1() {
        Persona Roman = new Persona();
        Roman = cargaPersonita();
        Persona personoldi = new Persona(Roman.getNombre(), Roman.getEdad(), Roman.getSexo());
        System.out.println(Roman.toString());
        //pesoIdoneo(Roman);
        System.out.println(personoldi.toString());
        Persona perso = new Persona();
        System.out.println(perso.toString());
        Roman.mostrarMayor();
        personoldi.mostrarMayor();
        perso.mostrarMayor();
    }

    public static Persona cargaPersonita() {
        System.out.println("Ingrese el nombre:");
        Scanner scancito = new Scanner(System.in);
        String nombre = scancito.nextLine();
        System.out.println("Ingrese la edad:");
        int edad = scancito.nextInt();
        scancito.nextLine();
        System.out.println("Ingrese el sexo:");
        String sexo = scancito.nextLine();
        System.out.println("Ingrese el peso");
        int peso = scancito.nextInt();
        System.out.println("Ingrese la altura");
        scancito.nextLine();
        int altura = scancito.nextInt();
        Persona personaAux = new Persona();
        personaAux.setEdad(edad);
        personaAux.setNombre(nombre);
        personaAux.setAltura(altura);
        personaAux.setPeso(peso);
        personaAux.setSexo(sexo);
        return personaAux;
    }

    public static void pesoIdoneo(Persona personita) {
        int flag = personita.calcularImc();
        if (flag == 0)
            System.out.println("Está en su peso ideal");
        else if (flag == 1)
            System.out.println("Estás excedido de peso");
        else
            System.out.println("Estás en un peso inferior al requerido");
    }

    public static void ejercicio2() {
        Password romagnoli = new Password();
        romagnoli.contraRandom(40);
        System.out.println("La contraseña es:" + romagnoli.getContrasena());
        System.out.println("Es fuerte? " + romagnoli.esFuerte(romagnoli.getLongitud()));
        arregloDePasswords();
    }
    public static void arregloDePasswords(){
        System.out.println("Cuantos passwords quieres:");
        Scanner scan = new Scanner(System.in);
        int cant = scan.nextInt();
        Password[] contras = new Password[cant];
        for(int i = 0; i < cant; i++){
            contras[i] = new Password();
            System.out.println("Ingrese la longitud del password");
            contras[i].contraRandom(scan.nextInt());
        }
        for(int j = 0;j<cant;j++){
            System.out.println("\nLa contraseña "+j+" es: "+contras[j].getContrasena());
            System.out.println("El password "+j+" es fuerte? "+contras[j].esFuerte(contras[j].getLongitud()));
        }
    }

    public static void ejercicio3(){

    }
}