public class Main {
    public static void main(String[] args) {
        Coche elCoche = new Coche();
        elCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + elCoche.puertas);
        System.out.println (suma (20, 30, 5));
        }

    private static int suma(int a, int b, int c) {
        return a + b + c;
    }

}

