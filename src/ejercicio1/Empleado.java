package ejercicio1;

public class Empleado {
	private String Nombre;
	private int Edad;
	
	private final int Id;  
	static int cont=999;  
	
	public Empleado(){
		 cont++;   
		 this.Id= cont;  
		 this.Nombre="sin nombre";
		 this.Edad=99;
	 }
	public Empleado(String nombre,int edad){
		 cont++;  
		 this.Id= cont;  
		 this.Nombre=nombre;
		 this.Edad=edad;
	 }
	
	
	//Metodo toString()
	@Override
	public String toString() {
		return "Empleado=" + Nombre + ", Edad=" + Edad + ", ID=" + Id + "]";
	}
	
	public static int devuelveProximoID() {
		return cont +1;
	}
	
	
	
	
}
