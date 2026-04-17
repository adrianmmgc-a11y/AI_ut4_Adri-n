package ofuscado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorCubos {

    private List<Cubo> listaDeCubos = new ArrayList<>();

    public void poblarLista(int cantidad) {
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
}