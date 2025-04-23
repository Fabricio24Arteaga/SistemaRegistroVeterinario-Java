package Ejemplo1;
public class Propietario {
    private int idPropietario;
    private String nombre;
    private int telefono;
    private String email;
    private String direccion;

    public Propietario(int id, String nombre, int telefono, String email,String direccion){
        this.idPropietario = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }
    
    public void mostrarDatos(){
        System.out.println("[" + idPropietario + "] " + nombre + " | Tel: " + telefono + " | Email: " + email + " | Direccion: " + direccion);
    }
    
            
}
