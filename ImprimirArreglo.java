package alexis;

public class ImprimirArreglo {
	public static class InvalidSubscriptException extends Exception {
        public InvalidSubscriptException(String mensaje) {
            super(mensaje);
        }
    }
	
	public static < E > void imprimirArreglo( E[] arregloEntrada ) {
		for ( E elemento : arregloEntrada ) {
			System.out.printf( "%s ", elemento );
		}
		System.out.println();
	}
	
	public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, int subindiceSuperior) throws InvalidSubscriptException {
        if (subindiceInferior < 0 || subindiceInferior >= arregloEntrada.length || subindiceSuperior < 0 || subindiceSuperior >= arregloEntrada.length || subindiceSuperior <= subindiceInferior) {
            throw new InvalidSubscriptException("Los subíndices ingresados no son válidos.");
        }

        int cantidad = 0;
        for (int i = subindiceInferior; i <= subindiceSuperior; i++) {
            System.out.printf("%s ", arregloEntrada[i]);
            cantidad++;
        }
        System.out.println();
        return cantidad;
    }
	
	public static void main( String args[] ) {
		Integer[] arregloInteger = { 1, 2, 3, 4, 5, 6 };
		Double[] arregloDouble = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] arregloCharacter = { 'H', 'O', 'L', 'A' };
		
		System.out.println( "El arreglo arregloInteger contiene:" );
		imprimirArreglo(arregloInteger);
		
		System.out.println( "\nEl arreglo arregloDouble contiene:" );
		imprimirArreglo(arregloDouble);
		
		System.out.println( "\nEl arreglo arregloCharacter contiene:" );
		imprimirArreglo(arregloCharacter);
		
		try {
            System.out.println("\nParte del arreglo Integer:");
            int cantidad = imprimirArreglo(arregloInteger, 1, 4);
            System.out.println("Cantidad de elementos impresos: " + cantidad);

            System.out.println("\nParte del arreglo Double:");
            cantidad = imprimirArreglo(arregloDouble, 2, 5);
            System.out.println("Cantidad de elementos impresos: " + cantidad);

            System.out.println("\nParte del arreglo Character:");
            cantidad = imprimirArreglo(arregloCharacter, 0, 2);
            System.out.println("Cantidad de elementos impresos: " + cantidad);

            System.out.println("\nProbando índices inválidos:");
            imprimirArreglo(arregloInteger, 4, 2);
        } catch (InvalidSubscriptException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
	}
}
