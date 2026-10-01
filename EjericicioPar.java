package alexis;

public class EjericicioPar {
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
		
		@Override
	    public String toString() {
	        return "(" + primero + ", " + segundo + ")";
	    }
	}
	
	public static void main(String[] args) {
	    Par<String, Integer> producto = new Par<>("Camisas", 50);
        System.out.println("Producto: " + producto.getPrimero());
        System.out.println("Cantidad: " + producto.getSegundo());

        Par<Double, Double> coordenadas = new Par<>(16.409, 71.537);
        System.out.println("Ubicación: " + coordenadas);
	}
}
