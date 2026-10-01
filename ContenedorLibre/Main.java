package EJERCICIOS;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA 1: CONTENEDOR COLA (Emparejamiento de Jugadores) ===");
        ContenedorCola<String, Integer> emparejamiento = new ContenedorCola<>();

        emparejamiento.agregarPar("Jett_Main", 24);
        emparejamiento.agregarPar("Omen_Smurf", 45);
        emparejamiento.agregarPar("Killjoy_Pro", 18);

        emparejamiento.mostrarPares();
        System.out.println("\nEntrando a partida (Extrayendo de la cola): " + emparejamiento.extraerPar());
        System.out.println("Entrando a partida (Extrayendo de la cola): " + emparejamiento.extraerPar());
        
        System.out.println("\nEstado actual de la cola de emparejamiento:");
        emparejamiento.mostrarPares();

        System.out.println("\n----------------------------------------------------\n");

        System.out.println("=== PRUEBA 2: CONTENEDOR PILA (Historial de Partidas) ===");
        ContenedorPila<String, Integer> historial = new ContenedorPila<>();

        historial.agregarPar("League of Legends", 12);
        historial.agregarPar("Fortnite", 8);
        historial.agregarPar("Valorant", 22);

        historial.mostrarPares();
        System.out.println("\nBorrando última partida del historial: " + historial.extraerPar());
        
        System.out.println("\nEstado actual del historial:");
        historial.mostrarPares();
    }
}