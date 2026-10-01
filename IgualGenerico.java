package laboratorio_5;

public class IgualGenerico {

    public static <T> boolean esIgualA(T objeto1, T objeto2) {

        if (objeto1 == null && objeto2 == null) {
            return true;
        }

        if (objeto1 == null || objeto2 == null) {
            return false;
        }

        return objeto1.equals(objeto2);
    }

    public static void main(String[] args) {

        System.out.println("Integer:");
        System.out.println(esIgualA(10, 10));
        System.out.println(esIgualA(10, 20));

        System.out.println("\nString:");
        System.out.println(esIgualA("Hola", "Hola"));
        System.out.println(esIgualA("Hola", "Adios"));

        System.out.println("\nObject:");
        Object objeto1 = new Object();
        Object objeto2 = objeto1;
        Object objeto3 = new Object();

        System.out.println(esIgualA(objeto1, objeto2));
        System.out.println(esIgualA(objeto1, objeto3));

        System.out.println("\nNull:");
        System.out.println(esIgualA(null, null));
        System.out.println(esIgualA(null, "Hola"));
    }
}