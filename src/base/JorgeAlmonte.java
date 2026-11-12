package base;

public class JorgeAlmonte {

    public static void main(String[] args) {

        int librosDisponibles = 10;

        System.out.println("Libros iniciales: " + librosDisponibles);

        librosDisponibles = actualizarLibros(librosDisponibles, -4);
        System.out.println("Préstamo realizado.");

        librosDisponibles = actualizarLibros(librosDisponibles, 2);
        System.out.println("Devolución realizada.");

        librosDisponibles = actualizarLibros(librosDisponibles, -15);

        System.out.println("Libros finales: " + librosDisponibles);
    }

    public static int actualizarLibros(int librosActuales, int cantidad) {

        int nuevoTotal = librosActuales + cantidad;

        if (nuevoTotal < 0) {
            System.out.println("ERROR: no puede haber libros negativos.");
        }

        return nuevoTotal;
    }
}

