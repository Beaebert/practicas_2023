public class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public void setNombre (String nombre) {
      this.nombre = nombre;
    }
    public void setEdad (int edad){
      this.edad = edad;
    }
    public void setTelefono (String telefono) {
      this.telefono = telefono;
    }

    public String getNombre ( ) {
        return this.nombre;
    }
    public int getEdad () {
        return this.edad;
    }
    public String getTelefono (){
        return this.telefono;
    }
}
