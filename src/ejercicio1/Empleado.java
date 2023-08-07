package ejercicio1;

public class Empleado {
	/* Properties */
	private final int id;
	private String nombre;
	private int edad;
	/* Static properties */
	private static int idCounter = 999;
	
	/* Static methods */
	public static int getNextID() {
		return idCounter + 1;
	}
	/* Constructors */
	public Empleado() {
		idCounter++;
		this.id = idCounter;
		this.nombre = "Unknown";
		this.edad = 0;
	}
	public Empleado(String nombre, int edad) {
		idCounter++;
		this.id = idCounter;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/* Getters */
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	/* Setters */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/* Other methods */
	@Override
	public String toString() {
		return "Empleado { id: " + getId() + ", nombre: " + getNombre() + ", edad: " + getEdad() + " }";
	}
	
}
