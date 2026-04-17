package ofuscado;
import javax.swing.JOptionPane;

/**
 * Crear un cubo.
 * 
 * @author Adrián José Martínez Medina
 * @version 1.0
 */
public class Cubo {

    private float lado;

    /**
     * Constructor que inicializa el lado del cubo.
     * @param lado Longitud del lado del cubo.
     */
    public Cubo(float lado) {
        this.lado = lado;
    }

    /**
     * Obtiene el valor del lado.
     * @return El lado del cubo.
     */
    public float getLado() {
        return lado;
    }

    /**
     * Establece el valor del lado.
     * @param lado El nuevo valor del lado.
     */
    public void setLado(float lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área de la base del cubo (lado * lado).
     * @return El área de la base.
     */
    public float calcularAreaBase() {
        return lado * lado;
    }

    /**
     * Calcula el volumen del cubo (lado^3).
     * @return El volumen del cubo.
     */
    public float calcularVolumen() {
        return lado * lado * lado;
    }

    /**
     * Solicita al usuario el valor del lado mediante un diálogo de entrada.
     * @return El valor introducido como float.
     */
    public static float solicitarLado() {
        String longitud = JOptionPane.showInputDialog("Introduce la longitud del lado del cubo:");
        
        if (longitud != null) {
            return Float.parseFloat(longitud);
        } else {
            return 0;
        }
    }

    /**
     * Muestra el área de la base en una ventana de diálogo.
     */
    public void imprimirArea() {
        JOptionPane.showMessageDialog(null, "El área de la base es: " + calcularAreaBase());
    }

    /**
     * Muestra el volumen en una ventana de diálogo.
     */
    public void imprimirVolumen() {
        JOptionPane.showMessageDialog(null, "El volumen del cubo es: " + calcularVolumen());
    }

    /**
     * Método principal para ejecutar la aplicación.
     * Crea tres cubos y determina cuál es el más grande.
     */
    public static void main(String[] args) {
        Cubo[] cubos = new Cubo[3];

        
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Configuración del Cubo " + (i + 1));
            float l = solicitarLado();
            cubos[i] = new Cubo(l);
            cubos[i].imprimirArea();
            cubos[i].imprimirVolumen();
        }

        Cubo mayor = cubos[0];
        int indice = 1;
        for (int i = 1; i < cubos.length; i++) {
            if (cubos[i].calcularVolumen() > mayor.calcularVolumen()) {
                mayor = cubos[i];
                indice = i + 1;
            }
        }

        JOptionPane.showMessageDialog(null, "El Cubo " + indice + " es el mayor con un volumen de: " + mayor.calcularVolumen());
    }
}
