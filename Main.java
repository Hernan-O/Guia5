import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el ejercicio que desea realizar");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()) {
            case 1 -> ejercicio1();
            case 2 -> ejercicio2();
            case 3 -> ejercicio3();
            case 4 -> ejercicio4();
            case 5 -> ejercicio5();
            default -> System.out.println("Nao Nao! que ta fazendo!?!?!?");
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

    public static void arregloDePasswords() {
        System.out.println("Cuantos passwords quieres:");
        Scanner scan = new Scanner(System.in);
        int cant = scan.nextInt();
        Password[] contras = new Password[cant];
        for (int i = 0; i < cant; i++) {
            contras[i] = new Password();
            System.out.println("Ingrese la longitud del password");
            contras[i].contraRandom(scan.nextInt());
        }
        for (int j = 0; j < cant; j++) {
            System.out.println("\nLa contraseña " + j + " es: " + contras[j].getContrasena());
            System.out.println("El password " + j + " es fuerte? " + contras[j].esFuerte(contras[j].getLongitud()));
        }
    }

    public static void ejercicio3() {
        Electrodomestico[] arrayElec = new Electrodomestico[10];
        arrayElec = generarElec(10);
        int precioTeles = 0, precioLavadoras = 0, precioFinal = 0, i;
        for (i = 0; i < 10; i++) {
            System.out.println(arrayElec[i].toString() + "\n--------------------------");
        }
        for (i = 0; i < 10; i++) {
            if (arrayElec[i] instanceof Lavadora) {
                arrayElec[i].precioFinal();
                precioLavadoras = precioLavadoras + arrayElec[i].getPrecioBase();
            } else {
                arrayElec[i].precioFinal();
                precioTeles = precioTeles + arrayElec[i].getPrecioBase();
            }
            precioFinal = precioFinal + arrayElec[i].getPrecioBase();
        }
        System.out.println("El precio final de las teles es:" + precioTeles + "\nEl precio final de las lavadoras es:" + precioLavadoras + "\nEl precio final de toda la compra es:" + precioFinal);
    }

    public static Electrodomestico[] generarElec(int dimension) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Television(20, true);
        electrodomesticos[1] = new Television(40, false);
        electrodomesticos[2] = new Television(32, false);
        electrodomesticos[3] = new Television(32, true);
        electrodomesticos[4] = new Television(80, true);
        electrodomesticos[0].setColor("Rojo");
        electrodomesticos[1].setColor("Blanco");
        electrodomesticos[2].setColor("Gris");
        electrodomesticos[3].setColor("Rojo");
        electrodomesticos[4].setColor("Negro");
        electrodomesticos[0].setConsumo('B');
        electrodomesticos[1].setConsumo('C');
        electrodomesticos[2].setConsumo('A');
        electrodomesticos[3].setConsumo('D');
        electrodomesticos[4].setConsumo('E');
        electrodomesticos[0].setPeso(40);
        electrodomesticos[1].setPeso(58);
        electrodomesticos[2].setPeso(100);
        electrodomesticos[3].setPeso(34);
        electrodomesticos[4].setPeso(12);
        electrodomesticos[0].setPrecioBase(130);
        electrodomesticos[1].setPrecioBase(200);
        electrodomesticos[2].setPrecioBase(300);
        electrodomesticos[3].setPrecioBase(1650);
        electrodomesticos[4].setPrecioBase(40);
        electrodomesticos[5] = new Lavadora(22, 180, 55, "azul", 'F');
        electrodomesticos[6] = new Lavadora(50, 400, 100, "verde", 'A');
        electrodomesticos[7] = new Lavadora(18, 220, 45, "blanco", 'B');
        electrodomesticos[8] = new Lavadora(28, 120, 65, "negro", 'C');
        electrodomesticos[9] = new Lavadora(32, 280, 75, "rojo", 'D');
        return electrodomesticos;
    }

    public static void ejercicio4() {
        Serie[] series = new Serie[5];
        Videojuego[] videojuego = new Videojuego[5];
        videojuego = generarVideojuego(5);
        series = generarSerie(5);
        int i = 0, VJE = 0, SE = 0, VJHE = 0, SCT = 0, maxVJ = 0, maxS = 0;
        for (i = 0; i < 5; i++) {
            System.out.println(videojuego[i].toString());
            System.out.println("--------------------------------------------------------------");
            System.out.println(series[i].toString());
            if (videojuego[i].isEntregado()) {
                VJE++;
            }
            if (series[i].isEntregado()) {
                SE++;
            }
            if (series[i].cantTemp > maxS) {
                maxS = series[i].cantTemp;
                SCT = i;
            }
            if (videojuego[i].horasEst > maxVJ) {
                maxVJ = videojuego[i].horasEst;
                VJHE = i;
            }
        }
        System.out.println("\n---------------------------------------------------------\nEl juego con mas horas es:" + videojuego[VJHE].toString() + "\nLa serie con mas temporadas es:" + series[SCT].toString());
        System.out.println(videojuego[3].compareTo(videojuego[3]));
        System.out.println(series[3].compareTo(series[3]));
    }

    public static Serie[] generarSerie(int dimension) {
        Serie[] aux = new Serie[5];
        aux[0] = new Serie("La ola", "Carlitos Tevez", "Accion", 4);
        aux[1] = new Serie("El Resplandor", "Juan Roman Riquelme", "Suspenso", 102);
        aux[2] = new Serie("Hola", "No se sabe", "Comedia", 1);
        aux[3] = new Serie("Futbol", "Guille", "Deporte", 369);
        aux[4] = new Serie("Programacion", "Chaldugod", "Documental", 5);
        aux[3].entregar();
        aux[0].entregar();
        return aux;
    }

    public static Videojuego[] generarVideojuego(int dimension) {
        Videojuego[] aux = new Videojuego[5];
        aux[0] = new Videojuego("Fornait", 130, "Epic Games", "Accion");
        aux[1] = new Videojuego("Tony Hawk's Pro Skater 4", 1300, "Neversoft", "Deporte");
        aux[2] = new Videojuego("Stardew Valley", 800000, "Si", "Chill");
        aux[3] = new Videojuego("Rocket League", 4000000, "Psyonix", "Autos"); //Jsjjsjsj cuantas horas tenia, era el tin
        aux[4] = new Videojuego("Minecraft", 20, "Mojang", "Chill");
        aux[0].entregar();
        aux[1].entregar();
        aux[4].entregar();
        return aux;
    }
    public static void ejercicio5(){
        Clientes[] cli = new Clientes[100];
        cli[0] = new Minoristas(25,11,"Roman","Bolivia 3350",45032300,11,"Yerba",400,30);
        cli[0].setPrecioTot();
        ((Minoristas)cli[0]).precioFinal();
        System.out.println(cli[0].toString());
    }

}