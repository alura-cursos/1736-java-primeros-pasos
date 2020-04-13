
public class EjercicioTablaMultiplicacion {

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 10; contador++) {	
			for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
				int resultado = contador * multiplicacion;
				System.out.print(resultado);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
