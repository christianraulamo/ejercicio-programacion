package ejercicio01;

/**
 *
 * @author christian
 */
public class Caballo {

    private String nombre;
    private String color;
    private int edad;
    private int concursosGanadas;

    Caballo(String n, String c, int e, int cg) {
        this.nombre = n;
        this.color = c;
        this.edad = e;
        this.concursosGanadas = cg;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public int getConcursosGanados() {
        return this.concursosGanadas;
    }

    public void cabalga() {
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    public void relincha() {
        System.out.println("Hiiiiiiieeeeee");
    }

    public void rumia() {
        System.out.println("Ñam ñam ñam");
    }
}
