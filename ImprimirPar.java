package alexis;

public class ImprimirPar {
	public static class Par<F, S> {
        private F primero;
        private S segundo;

        public Par(F primero, S segundo) {
            this.primero = primero;
            this.segundo = segundo;
        }

        @Override
        public String toString() {
            return "(" + primero + ", " + segundo + ")";
        }
    }
	
	public static class Persona {
		private String nombre;
		
		public Persona(String nombre) {
			this.nombre = nombre;
		}
		
		@Override
        public String toString() {
            return nombre;
        }
	}
	
	public static <F,S> void imprimirPar(Par<F,S> par) {
		System.out.println(par);
	}
	
	public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Camisas", 50);
        Par<Double, Boolean> par2 = new Par<>(16.4, true);
        Par<Persona, Integer> par3 = new Par<>(new Persona("Alexis"), 20);

        imprimirPar(par1);
        imprimirPar(par2);
        imprimirPar(par3);
    }
}
