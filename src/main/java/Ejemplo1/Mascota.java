package Ejemplo1;
public class Mascota {
    private int idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String sexo;
    private double peso;
    private int idPropietario;
    
    public Mascota(int id, String nombre, String especie, String raza, int edad, String sexo, double peso, int idPropietario) {
        this.idMascota = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.idPropietario = idPropietario;
    }
    
    public void mostrarDatos() {
        System.out.println("[" + idMascota + "] " + nombre + " | " + especie + " | " + edad + " años | Peso: " + peso + "kg");
    }
}
