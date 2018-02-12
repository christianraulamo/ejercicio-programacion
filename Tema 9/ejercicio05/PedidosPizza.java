package ejercicio05;

/**
 * Ejercicio
 *
 * @author christian
 */
public class PedidosPizza {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Cuatro Quesos", "mediana");
        Pizza p2 = new Pizza("Vegetal", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("Jamon y Queso", "Pequeña");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}
