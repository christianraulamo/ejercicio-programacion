package ejercicio03;

/**
 *
 * @author christian
 */
public class PruebaAnimales {

    public static void main(String[] args) {
        Pinguino tux = new Pinguino(Sexo.MACHO);
        tux.come("palomitas");
        tux.programa();

        Perro laika = new Perro(Sexo.HEMBRA);
        laika.duerme();
        laika.dameLaPata();
        laika.amamanta();
        laika.cuidaCrias();

        Lagarto godzilla = new Lagarto(Sexo.MACHO);
        godzilla.tomaElSol();
        godzilla.duerme();
    }
}
