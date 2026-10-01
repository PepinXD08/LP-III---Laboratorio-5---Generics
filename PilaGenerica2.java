package laboratorio_5;

public class pila_generica {

    public static class ExcepcionPilaLlena extends RuntimeException {

        public ExcepcionPilaLlena(String mensaje) {
            super(mensaje);
        }
    }

    public static class ExcepcionPilaVacia extends RuntimeException {

        public ExcepcionPilaVacia(String mensaje) {
            super(mensaje);
        }
    }

    public static class Pila<E> {

        private final int tamanio;
        private int superior;
        private E[] elementos;

        public Pila() {
            this(10);
        }

        public Pila(int s) {
            tamanio = s > 0 ? s : 10;
            superior = -1;
            elementos = (E[]) new Object[tamanio];
        }

        public void push(E valorAMeter) {

            if (superior == tamanio - 1) {
                throw new ExcepcionPilaLlena(
                    String.format(
                        "La Pila esta llena, no se puede meter %s",
                        valorAMeter
                    )
                );
            }

            elementos[++superior] = valorAMeter;
        }

        public E pop() {

            if (superior == -1) {
                throw new ExcepcionPilaVacia(
                    "Pila vacia, no se puede sacar"
                );
            }

            return elementos[superior--];
        }

        public boolean contains(E elemento) {

            for (int i = superior; i >= 0; i--) {

                if (elementos[i] != null
                        && elementos[i].equals(elemento)) {
                    return true;
                }
            }

            return false;
        }

        // Compara dos pilas sin modificar las originales
        public boolean esIgual(Pila<E> otraPila) {

            if (this.superior != otraPila.superior) {
                return false;
            }

            for (int i = 0; i <= superior; i++) {

                if (elementos[i] == null && otraPila.elementos[i] == null) {
                    continue;
                }

                if (elementos[i] == null
                        || !elementos[i].equals(otraPila.elementos[i])) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Pila<Integer> pila1 = new Pila<>(5);
        Pila<Integer> pila2 = new Pila<>(5);
        Pila<Integer> pila3 = new Pila<>(5);

        pila1.push(10);
        pila1.push(20);
        pila1.push(30);

        pila2.push(10);
        pila2.push(20);
        pila2.push(30);

        pila3.push(10);
        pila3.push(20);
        pila3.push(40);

        System.out.println("¿Pila 1 y Pila 2 son iguales?: "
                + pila1.esIgual(pila2));

        System.out.println("¿Pila 1 y Pila 3 son iguales?: "
                + pila1.esIgual(pila3));

        System.out.println("\nContenido de Pila 1 después de comparar:");
        System.out.println(pila1.pop());
        System.out.println(pila1.pop());
        System.out.println(pila1.pop());

        System.out.println("\nContenido de Pila 2 después de comparar:");
        System.out.println(pila2.pop());
        System.out.println(pila2.pop());
        System.out.println(pila2.pop());
    }
}