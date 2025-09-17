// ====================== CocineroBBQ (Concrete Builder) ======================
import java.util.*;

class CocineroBBQ implements Cocinero {
    private Hamburguesa burg;

    @Override public void reset() { burg = new Hamburguesa(); }
    @Override public void tostarPan() { burg.setTipoPan("ajonjolí"); }
    @Override public void cocinarCarne(String termino) {
        burg.setProteina("res");
        burg.setTerminoCarne(termino != null ? termino : "3/4");
        burg.setPreparacionProteina("plancha");
    }
    @Override public void freirCarne() { /* opcional: variante */ }
    @Override public void empanarYFreirPollo() { /* No aplica */ }

    @Override public void agregarQueso(String tipo) { burg.addQueso(tipo != null ? tipo : "Cheddar"); }
    @Override public void agregarVegetales(List<String> lista) {
        burg.addVegetales(lista != null ? lista : Arrays.asList("cebolla crispy"));
    }
    @Override public void agregarSalsas(List<String> lista) {
        List<String> base = new ArrayList<>(Arrays.asList("BBQ"));
        if (lista != null) base.addAll(lista);
        burg.addSalsas(base);
    }
    @Override public void agregarTocineta() { burg.setTocineta(true); }
    @Override public void armar() { /* */ }
    @Override public void envolver() { /* */ }
    @Override public Hamburguesa getResultado() { return burg; }
}

