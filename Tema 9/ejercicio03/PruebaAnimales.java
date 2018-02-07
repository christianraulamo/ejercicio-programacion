package ejercicio03;

/**
 *
 * @author christian
 */
public class PruebaAnimales {

    public static void main(String[] args) {
        Pinguino paco = new Pinguino(Sexo.MACHO);
        System.out.println("Soy " + paco.getSexo());
        paco.come("peces");
        paco.programa();
        paco.vuela();
        paco.nada();
        paco.ponHuevo();
        paco.limpiate();
        paco.duerme();
        
        System.out.println();
        Perro samana = new Perro(Sexo.HEMBRA);
        System.out.println("Soy " + samana.getSexo());
        samana.dameLaPata();
        samana.ladra();
        samana.caza();
        samana.amamanta();
        samana.cuidaCrias();
        samana.anda();
        samana.duerme();

        System.out.println();
        Lagarto pedro = new Lagarto(Sexo.MACHO);
        System.out.println("Soy " + pedro.getSexo());
        pedro.tomaElSol();
        pedro.baniate();
        pedro.esconderse();
        pedro.duerme();
        
        System.out.println();
        Canario piolin = new Canario (Sexo.HEMBRA);
        System.out.println("Soy " + piolin.getSexo());
        piolin.canta();
        piolin.caza();
        piolin.come("pipas");
        piolin.pia();
        piolin.ponHuevo();
        piolin.limpiate();
        piolin.vuela();
        piolin.duerme();
        
        System.out.println();
        Gato garfiel = new Gato (Sexo.MACHO);
        Gato mini = new Gato (Sexo.HEMBRA);
        System.out.println("Soy " + garfiel.getSexo());
        garfiel.ronronea();
        garfiel.maulla();
        garfiel.caza();
        garfiel.amamanta();
        garfiel.cuidaCrias();
        garfiel.anda();
        garfiel.come("pescado");
        garfiel.peleaCon(mini);
        garfiel.duerme();
        
    }
}
