package ejercicio1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	private static int cont=999;
	
	public Empleado() {
		this("sin nombre",99);
	}
	
	public Empleado(String nombre, int edad) {
		this.id=++cont;
		this.nombre=nombre;
		if(edad > 0) {
			this.edad=edad;				
		}
		else {
			System.out.println("La edad ingresada no es válida. Se pondrá un valor por defecto");
			this.edad=99;
		}				
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad > 0) {
			this.edad=edad;
		}else {
			System.out.println("Debe ingresar una edad válidad. Se pondrá un valor por defecto");
			this.edad=99;
		}
	}

	public int getId() {
		return id;
	}
	
	public static int devuelveProximoID() {
		return cont+1;
	}

	@Override
	public String toString() {
		return "Empleado: " + this.nombre + ", Edad: " + this.edad + ", Legajo: " + this.id;
	}	

}
