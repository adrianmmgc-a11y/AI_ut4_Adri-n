package ofuscado;


/** Metodo rebuscado para sumar hasta 100 con un bucle do while.
 * Antes ofuscado, ya refactorizado.
 */
public class Main {
	public static void main(final String[] args) {
		int contadorfinal = 0;
		int incremento = 15;
		int sumaalcontador = 20;
		int contador = 0;
		do {
			sumaalcontador = 10 + incremento;
			contador = contador + sumaalcontador;
			contador++;
			if (contador < 10) {
				contadorfinal = 15;
				contador = contador - 1;
			} else {
				contadorfinal = 10;
				contador = contador - 1;
			}
			int aux;
			aux = contador;
			contadorfinal = aux;
		} while (contador < 100);
	}
}
