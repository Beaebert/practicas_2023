
public class Main {
    public static void main(String[] args) {
        Cliente elCliente = new Cliente();

        elCliente.setNombre ("Sofia");
        elCliente.setEdad(24);
        elCliente.setTelefono("15-4455-7743");
        elCliente.setCredito(150000);

        System.out.println(elCliente.getNombre());
        System.out.println(elCliente.getEdad());
        System.out.println(elCliente.getTelefono());
        System.out.println(elCliente.getCredito());
    }
}


