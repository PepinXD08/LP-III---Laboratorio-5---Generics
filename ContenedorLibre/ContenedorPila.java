package EJERCICIOS;

import java.util.ArrayList;

public class ContenedorPila<F, S> {
    private ArrayList<Par<F, S>> pila;

    public ContenedorPila() {
        this.pila = new ArrayList<>();
    }

 
    public void agregarPar(F primero, S segundo) {
        pila.add(new Par<>(primero, segundo));
    }

    public Par<F, S> extraerPar() {
        if (!pila.isEmpty()) {
            return pila.remove(pila.size() - 1);
        }
        return null;
    }

    public Par<F, S> obtenerPar(int indice) {
        return pila.get(indice);
    }

    public ArrayList<Par<F, S>> obtenerTodosLosPares() {
        return pila;
    }

    public void mostrarPares() {
        System.out.println("--- Contenido de la Pila (Del más reciente al más antiguo) ---");
        for (int i = pila.size() - 1; i >= 0; i--) {
            System.out.println(pila.get(i).toString());
        }
    }
}