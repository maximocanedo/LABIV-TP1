package ejercicio1;

public class Empleado {
	
	private String Nombre;
	private int Edad;
	
	private final int id;  
	static int cont=999;  
	
	public Empleado(){
		 cont++;   
		 this.id= cont;  
		 this.Nombre="sin nombre";
		 this.Edad=99;
	 }
	public Empleado(String nombre,int edad){
		 cont++;  
		 this.id= cont;  
		 this.Nombre=nombre;
		 this.Edad=edad;
	 }
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int getId() {
		return id;
	}
	
	//Metodo toString()
	@Override
	public String toString() {
		return "Empleado=" + Nombre + ", Edad=" + Edad + ", ID=" + id ;
	}
	
	public static int devuelveProximoID() {
		return cont +1;
	}
	
}
