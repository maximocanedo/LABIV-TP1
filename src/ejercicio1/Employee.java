package ejercicio1;

public class Employee {
	private String name;
	private int age;
	private final int ID;  
	static int cont = 999;  
	
	public Employee(){
		 cont++;   
		 this.ID= cont;  
		 this.name = "Unknown";
		 this.age = 99;
	 }
	public Employee(String name, int age){
		 cont++;  
		 this.ID = cont;  
		 this.name = name;
		 this.age = age;
	 }
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return this.age;
	}
	public void setEdad(int age) {
		this.age = age;
	}
	public int getID() {
		return ID;
	}
	
	// Employee.toString() method
	@Override
	public String toString() {
		return "Employee: " + this.name + ", age: " + this.age + ", ID: " + this.ID ;
	}
	
	public static int getNextID() {
		return cont + 1;
	}
	
	
	
	
}
