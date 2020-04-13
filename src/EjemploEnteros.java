
public class EjemploEnteros {

	public static void main(String[] args) {
		
		// edad = 28 No compila porque falta definir el valor de la variable
		int edad; // Declaracion de la variable
		edad = 28; // Inicializacion de la variable
		
		// System.out.println("edad"); No compila porque el parameteo no es la variable, es un String
		System.out.println(edad); // Variable como parametro
		
		edad = 37; // Sobreescribimos el valor de la variable
		System.out.println(edad);
		
		edad = 35 + 99; // Asignamos el valor del resultado de una operacion aritmetica
		System.out.println(edad);
		
		System.out.println("Mi edad es " + edad); // Concatenamos un String con la variable edad usando +

	}

}
