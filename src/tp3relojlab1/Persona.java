package tp3relojlab1;

import java.util.Scanner;

import java.util.Scanner;

public class Persona {

    private String nombre;

    private String apellido;

    private int edad;

    private double altura;

    public Persona(String nombre, String apellido, int edad, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void comer() {
        System.out.println("no puede hablar parece que esta bueno el sanguche ");
    }

    public void hablar() {
        System.out.println("Hola ! buenas buenas...");
    }

    public void decirHora(Reloj r1) {
        System.out.println("La hora es: " + r1.getHora());
    }

    public void usarReloj(RelojFit r1) {

        int resp = 0;

        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Elija una opcion");
            System.out.println("1 salir");
            System.out.println("2 Restar dia");
            System.out.println("3 Incrementar Hora");
            System.out.println("4 Restar Hora");
            System.out.println("5 Mostrar Dia");
            System.out.println("6 Mostrar Hora");
            System.out.println("7 Limpiar pantalla");
            System.out.println("8 Incrementar dia");
              if (r1 instanceof RelojFit && resp!=1) {
                System.out.println("9 cuenta pasos");
                System.out.println("10 frecuencia");
            }
            resp = leer.nextInt();
          
            int cant;

            switch (resp) {
                case 1:
                    System.out.println("Hasta luego =) ");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dias a restar");
                    r1.restarDia(leer.nextInt());
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de hs a incrementar");
                    cant = leer.nextInt();
                    r1.incrementarHora(cant);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de hs a restar");
                    cant = leer.nextInt();
                    r1.restarHora(cant);
                    break;
                case 5:
                    System.out.println("Dia: "+r1.getDia());
                    break;
                case 6:
                    this.decirHora(r1);
                    break;
                case 7:
                    System.out.println("Nose como limpiar pantalla");
                    break;
                case 8:
                     System.out.println("Ingrese la cantidad de dias a incrementar");
                    cant = leer.nextInt();
                    r1.incrementarDia(cant);
                    break;
                case 9:
                    System.out.println("ingrese num entero para X luego para Y");
                    r1.cuentaPasos(leer.nextInt(), leer.nextInt());
                    break;
                case 10:
                    r1.frecuenciaAleatoria();
                    break;
                default:
                    break;
            }
        } while (resp != 1);
    }

}
