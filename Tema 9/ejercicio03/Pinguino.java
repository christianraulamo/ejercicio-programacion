package ejercicio03;

/**
 *
 * @author christian
 */
public class Pinguino extends Ave {

    public Pinguino() {
    }

    public Pinguino(Sexo s) {
        super(s);
    }

    public void vuela() {
        System.out.println("Soy un pingüino, no puedo volar");
    }

    public void programa() {
        System.out.println("Soy un pingüino y no tengo dedos para poder programar");
    }

    public void nada() {
        System.out.println("Estoy nadando");
    }
}
