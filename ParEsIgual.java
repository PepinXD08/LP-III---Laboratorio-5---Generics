package alexis;

public class ParEsIgual {
	public static class Par<F,S> {
		private F primero;
		private S segundo;
	
		public Par(F primero, S segundo) {
		    this.primero = primero;
		    this.segundo = segundo;
		}
		
		public F getPrimero() {
	        return primero;
	    }
		
		public S getSegundo() {
			return segundo;
		}
		
		public void setPrimero(F primero) {
	        this.primero = primero;
	    }
		
		public void setSegundo(S segundo) {
	        this.segundo = segundo;
	    }
		
		public boolean esIgual(Par<F,S> otro) {
			return primero.equals(otro.primero) && segundo.equals(otro.segundo);
		}
		
		@Override
	    public String toString() {
	        return "(" + primero + ", " + segundo + ")";
	    }
	}
	
	public static void main(String[] args) {
		Par<Integer, Integer> producto = new Par<>(286, 75);
		Par<Integer, Integer> producto2 = new Par<>(135, 90);
		System.out.println("Producto 1: " + producto.getPrimero() + ", " + producto.getSegundo());
		System.out.println("Producto 2: " + producto2.getPrimero() + ", " + producto2.getSegundo());
		System.out.println("¿Son iguales?: " + producto.esIgual(producto2));

		Par<Double, Double> coordenadas = new Par<>(16.4, 16.4);
		Par<Double, Double> coordenadas2 = new Par<>(16.4, 16.4);
		System.out.println("Coordenadas 1: " + coordenadas.getPrimero() + ", " + coordenadas.getSegundo());
		System.out.println("Coordenadas 2: " + coordenadas2.getPrimero() + ", " + coordenadas2.getSegundo());
		System.out.println("¿Son iguales?: " + coordenadas.esIgual(coordenadas2));
	}
}

