package ejercicio03;

/**
 *
 * @author christian
 */
public class Lagarto extends Animal {

  public Lagarto() {}

  public Lagarto(Sexo s) {
    super(s);
  }

  public void tomaElSol() {
    System.out.println("Estoy tomando el Sol");
  }

  public void baniate() {
    System.out.println("Me estoy bañando");
  }

  public void escondete() {
    System.out.println("Me he camufrado, ya no me puedes ver");
  }
}
