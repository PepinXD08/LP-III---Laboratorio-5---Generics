package alexis;

public class PilaGenerica {
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
                    String.format("La Pila esta llena, no se puede meter %s", valorAMeter)
                );
            }
            elementos[++superior] = valorAMeter;
        }

        public E pop() {
            if (superior == -1) {
                throw new ExcepcionPilaVacia("Pila vacia, no se puede sacar");
            }
            return elementos[superior--];
        }

        public boolean contains(E elemento) {
            for (int i = superior; i >= 0; i--) {
                if (elementos[i] != null && elementos[i].equals(elemento)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Pila<Integer> pilaInteger = new Pila<>(5);
        try {
            pilaInteger.push(10);
            pilaInteger.push(20);
            pilaInteger.push(30);
            pilaInteger.push(40);
            pilaInteger.push(50);

            System.out.println("¿Contiene el 30?: " + pilaInteger.contains(30));
            System.out.println("¿Contiene el 99?: " + pilaInteger.contains(99));

            System.out.println("Elementos de la pila:");
            while (true) {
                System.out.println(pilaInteger.pop());
            }
        } catch (ExcepcionPilaLlena e) {
            System.out.println(e.getMessage());
        } catch (ExcepcionPilaVacia e) {
            System.out.println(e.getMessage());
        }
    }
}