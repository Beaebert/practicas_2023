package be.ebert;

public class TipoDeDatos {
    public static void main(String[] args) {
      //numeros enteros
      byte num1 = 1; //ocupa 1 byte (8 bits)
      short num2 = 2; //ocupa 2 bytes
      int num3 = 3; //ocupa 4 bytes
      long num4 = 4; //ocupa 8 bytes
      //numeros decimales o flotantes
      float num5 = 4.5F; //ocupa 4 bytes
      double num6 = 5.66; //ocupa 8 bytes
      //tipo caracter
      char aa = 'a'; /* el tipo char es literalmente un solo caracter
                      y debe ser declarado entre comillas simples */
      //cadenas de texto
      String nombre = "Beatriz Ebert"; /* todo caracter, texto y espacios, y
                                   deben declararse entre comillas dobles */
      //booleanos
      boolean verdadero = true; //ocupa 1 bit
      boolean falso = false; //ocupa 1 bit
      //tipos envoltorios
      Integer numero = null;

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(num6);
    System.out.println(aa);
    System.out.println(nombre);
    System.out.println(verdadero);
    System.out.println(falso);
    System.out.println(numero);
    }
}
