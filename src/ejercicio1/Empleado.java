package ejercicio1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	private static int cont=999;  
	
	public Empleado(){
		 cont++;   
		 this.id= cont;  
		 this.nombre="sin nombre";
		 this.edad=99;
	 }
	public Empleado(String nombre,int edad){
		 cont++;  
		 this.id= cont;  
		 this.nombre=nombre;
		 this.edad=edad;
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
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	
	//Metodo toString()
	@Override
	public String toString() {
		return "Empleado: " + nombre + ", Edad: " + edad + ", Legajo: " + id ;
	}
	
	public static int devuelveProximoID() {
		return cont +1;
	}
	
}
