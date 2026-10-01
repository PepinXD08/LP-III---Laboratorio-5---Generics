package EJERCICIOS;

import java.util.ArrayList;

public class ContenedorCola<F, S> {
    private ArrayList<Par<F, S>> cola;

    public ContenedorCola() {
        this.cola = new ArrayList<>();
    }


    public void agregarPar(F primero, S segundo) {
        cola.add(new Par<>(primero, segundo));
    }

    public Par<F, S> extraerPar() {
        if (!cola.isEmpty()) {
            return cola.remove(0);
        }
        return null;
    }

    public Par<F, S> obtenerPar(int indice) {
        return cola.get(indice);
    }

    public ArrayList<Par<F, S>> obtenerTodosLosPares() {
        return cola;
    }

    public void mostrarPares() {
        System.out.println("--- Contenido de la Cola (Del primero al último) ---");
        for (Par<F, S> par : cola) {
            System.out.println(par.toString());
        }
    }
}