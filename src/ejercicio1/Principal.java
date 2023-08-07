package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[] {
				new Empleado("Máximo Canedo", 20),
				new Empleado("Adrián Suárez", 40),
				new Empleado(),
				new Empleado("Hector da Silva", 40),
				new Empleado("Inés Gregoria", 50)
		};
		for(Empleado e: empleados) {
			System.out.println(e.toString());
		}
		System.out.println("El siguiente empleado tendrá el ID #" + Empleado.getNextID() + ". ");
	}

}
