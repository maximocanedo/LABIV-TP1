package ejercicio1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Empleado vEmp[] = new Empleado[5];
		Scanner entrada = new Scanner(System.in);
		String nombreEmpleado;
		int edadEmpleado;
		int i;
		
		for(i=0; i < vEmp.length; i++) {
			if(i % 2 == 0) {
				System.out.print("Ingrese nombre del empleado: ");
				nombreEmpleado = entrada.nextLine();
				System.out.print("Ingrese edad: ");
				edadEmpleado = entrada.nextInt();
				
				vEmp[i]= new Empleado(nombreEmpleado,edadEmpleado);
								
				entrada.nextLine();
			}else {
				vEmp[i]=new Empleado();
			}
			
			System.out.println(vEmp[i].toString() + "\n");
			System.out.println("El próximo ID será el " + Empleado.devuelveProximoID() + "\n");
		}		
				
		entrada.close();
	}

}

