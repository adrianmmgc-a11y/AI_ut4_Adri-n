<<<<<<< HEAD
package ofuscado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorCubos {

    private List<Cubo> listaDeCubos = new ArrayList<>();

    public void añadiraLista(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            float lado = Cubo.solicitarLado();
            listaDeCubos.add(new Cubo(lado));
        }
    }

   public void ordenarPorTamaño() {
    Collections.sort(listaDeCubos);
    }

    public boolean cabeElPrimeroEnElSegundo(Cubo c1, Cubo c2) {
        return c1.getLado() < c2.getLado();
    }

    public List<Cubo> getListaDeCubos() {
        return listaDeCubos;
    }
=======
package ofuscado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorCubos {

    private List<Cubo> listaDeCubos = new ArrayList<>();

    public void añadiraLista(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            float lado = Cubo.solicitarLado();
            listaDeCubos.add(new Cubo(lado));
        }
    }

   public void ordenarPorTamaño() {
    Collections.sort(listaDeCubos);
    }

    public boolean cabeElPrimeroEnElSegundo(Cubo c1, Cubo c2) {
        return c1.getLado() < c2.getLado();
    }

    public List<Cubo> getListaDeCubos() {
        return listaDeCubos;
    }
>>>>>>> b8b659579e72060a45ffcd15ee895c91cf9d0312
}