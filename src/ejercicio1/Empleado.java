package ejercicio1;

public class Empleado {

	private final int ID;
	private String nombre;
	private int edad;
	
	static int idCounter = 999;
	
	public static int getNextID() {
		return idCounter + 1;
	}

	public Empleado() {
		idCounter++;
		this.ID = idCounter;
		this.nombre = "Unknown";
		this.edad = 0;
	}
	public Empleado(String nombre, int edad) {
		idCounter++;
		this.ID = idCounter;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getId() {
		return this.ID;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado { id: " + getId() + ", nombre: " + getNombre() + ", edad: " + getEdad() + " }";
	}
	
}
