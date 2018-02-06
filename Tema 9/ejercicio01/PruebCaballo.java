package ejercicio01;

/**
 * Ejercicio
 *
 * @author christian
 */
public class PruebCaballo {

    public static void main(String[] args) {

        Caballo a = new Caballo("Samana", "canela", 5, 70);
        Caballo l = new Caballo("Pegaso", "blanco", 8, 50);

        System.out.println("Hola, me llamo " + a.getNombre());
        System.out.println("Soy de color " + a.getColor());
        System.out.println("Mi edad es " + a.getEdad());
        System.out.println("Los concursos ganados son " + a.getConcursosGanados());
        a.cabalga();
        a.relincha();

        System.out.println("Hola, yo soy " + l.getNombre());
        System.out.println("Soy de color " + l.getColor());
        System.out.println("Mi edad es " + l.getEdad());
        System.out.println("Los concursos ganados son " + l.getConcursosGanados());
        l.rumia();
        l.cabalga();
    }
}