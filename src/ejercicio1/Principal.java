package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		empleados[0] = new Empleado("M�ximo Canedo", 20);
		empleados[1] = new Empleado("Adri�n Su�rez", 40);
		empleados[2] = new Empleado();
		empleados[3] = new Empleado("Hector da Silva", 40);
		empleados[4] = new Empleado("In�s Gregoria", 50);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(empleados[i].toString());
		}
		System.out.println("El siguiente empleado tendr� el ID #" + Empleado.getNextID() + ". ");
	}

}
