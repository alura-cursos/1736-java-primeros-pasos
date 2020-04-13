
public class EjemploConversiones {
	
	public static void main(String[] args) {
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; // Cast
		// este metodo imprime en consola
		System.out.println(variable1Entero);
		
		// int prueba = 122222222222222222; No compila porque el numero esta fuera del rango aceptado por int
		long prueba = 122222222222222222L; // Se especifica con L para asiganr valor a una variable tipo long
		
		int resultado = (int) variable1 + variable1Entero; // Forzamos el resultado en int
		System.out.println(resultado);
	}

}
