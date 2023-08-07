package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[] {
				new Empleado("M�ximo Canedo", 20),
				new Empleado("Adri�n Su�rez", 40),
				new Empleado(),
				new Empleado("Hector da Silva", 40),
				new Empleado("In�s Gregoria", 50)
		};
		for(Empleado e: empleados) {
			System.out.println(e.toString());
		}
		System.out.println("El siguiente empleado tendr� el ID #" + Empleado.getNextID() + ". ");
	}

}
