package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Pedro",26);
		
		System.out.println(empleado1.toString());
		System.out.println("El próximo ID será el " + Empleado.devuelveProximoID() + "\n");
		
		Empleado empleado2 = new Empleado("Juan",49);
		
		System.out.println(empleado2.toString());
		System.out.println("El próximo ID será el " + Empleado.devuelveProximoID() + "\n");
		
		Empleado empleado3 = new Empleado("Matias",22);
		
		System.out.println(empleado3.toString());
		System.out.println("El próximo ID será el " + Empleado.devuelveProximoID() + "\n");
		
		Empleado empleado4 = new Empleado();
		
		System.out.println(empleado4.toString());
		System.out.println("El próximo ID será el " + Empleado.devuelveProximoID() + "\n");
				
		Empleado empleado5 = new Empleado();
		
		System.out.println(empleado5.toString());
		System.out.println("El próximo ID será el " + Empleado.devuelveProximoID() + "\n");
			
	}

}
