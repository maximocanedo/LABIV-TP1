package ejercicio1;

public class Empleado {
	private int Id;
	private String Nombre;
	private int Edad;
	
	private int id;
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
	
	
	//Metodo toString()
	@Override
	public String toString() {
		return "Empleado=" + Nombre + ", Edad=" + Edad + ", ID=" + Id + "]";
	}
	
	
	
	
}
