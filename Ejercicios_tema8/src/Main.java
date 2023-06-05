
public class Main {
    public static void main(String[] args) {
      Persona Persona = new Persona();
      Persona.setNombre ("Beatriz");
      Persona.setEdad(34);
      Persona.setTelefono("15-4455-7743");

      System.out.println(Persona.getNombre());
      System.out.println(Persona.getEdad());
      System.out.println(Persona.getTelefono());
    }
}