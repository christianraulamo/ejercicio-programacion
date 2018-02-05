package ejercicio03;

/**
 *
 * @author christian
 */
public class PruebaAnimales {

    public static void main(String[] args) {
        Pinguino paco = new Pinguino(Sexo.MACHO);
        paco.come("peces");
        paco.programa();
        paco.vuela();
        paco.nada();
        paco.duerme();
        paco.ponHuevo();
        paco.limpiate();
        
        Perro samana = new Perro(Sexo.HEMBRA);
        samana.dameLaPata();
        samana.ladra();
        samana.caza();
        samana.amamanta();
        samana.cuidaCrias();
        samana.anda();
        samana.duerme();

        Lagarto pedro = new Lagarto(Sexo.MACHO);
        pedro.tomaElSol();
        pedro.baniate();
        pedro.esconderse();
        pedro.duerme();
        
        Canario piolin = new Canario (Sexo.HEMBRA);
        piolin.canta();
        piolin.caza();
        piolin.come("pipas");
        piolin.pia();
        piolin.ponHuevo();
        piolin.limpiate();
        piolin.vuela();
        piolin.duerme();
        
        Gato garfiel = new Gato (Sexo.MACHO);
        Gato mini = new Gato (Sexo.HEMBRA);
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
