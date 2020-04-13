
public class EjemploDecimales {

	public static void main(String[] args) {
		// int salario = 1250.88 No compila porque un valor decimal no cabe en una variable tipo int
		double salario = 1250.88;
		System.out.println(salario);
		
		double edad = 28; // Numeros enteros si pueden ser asignados a variables tipo double
		double salarioMitad = salario / 2; 
		System.out.println(salarioMitad); // Podemos usar variables directamente en operaciones matematicas
		
		int division = 1250 / 3; // Compila, a pesar de resultar en un valor decimal
		System.out.println(division); // Ignora por completo la parte decimal, NO redondea, solo toma la parte entera
	}
	
}
