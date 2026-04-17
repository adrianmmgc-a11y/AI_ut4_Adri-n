public class Main {
    public static void main(String[] args) {
        GestorCubos gestor = new GestorCubos();


        System.out.println("--- Configuración de cubos de prueba ---");
        gestor.añadirLista(3);

        System.out.println("\n--- Ordenando cubos por tamaño ---");
        gestor.ordenarPorTamaño();
        for (Cubo c : gestor.getListaDeCubos()) {
            System.out.println("Cubo con lado: " + c.getLado() + " | Volumen: " + c.calcularVolumen());
        }

        System.out.println("\n--- Comprobando si el primer cubo cabe en el segundo ---");
        if (gestor.getListaDeCubos().size() >= 2) {
            Cubo c1 = gestor.getListaDeCubos().get(0);
            Cubo c2 = gestor.getListaDeCubos().get(1);
            
            boolean cabe = gestor.cabeElPrimeroEnElSegundo(c1, c2);
            
            System.out.println("¿El cubo de lado " + c1.getLado() + " cabe en el de lado " + c2.getLado() + "?: " + (cabe ? "Si" : "No"));
        }
    }
}
