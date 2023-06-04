
public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf > 0) { System.out.println("Positivo");
        } else if (numeroIf < 0) {System.out.print("Negativo");
        } else numeroIf = 0; {
            System.out.print("Cero");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile == 0);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String Estacion = "Primavera";

        switch (Estacion) {
            case "Verano" -> System.out.println("Estamos en Verano");
            case "Otoño" -> System.out.println("Estamos en Otoño");
            case "Invierno" -> System.out.println("Estamos en Invierno");
            case "Primavera" -> System.out.println("Estamos en Primavera");
            default -> System.out.println("No se mencionó una Estación");
        }
    }
}