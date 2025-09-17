// ====================== CocineroClasica (Concrete Builder) ======================
import java.util.*;

class CocineroClasica implements Cocinero {
    private Hamburguesa burg;

    @Override public void reset() { burg = new Hamburguesa(); }
    @Override public void tostarPan() { burg.setTipoPan("clásico"); }
    @Override public void cocinarCarne(String termino) {
        burg.setProteina("res");
        burg.setTerminoCarne(termino != null ? termino : "bien cocido");
        burg.setPreparacionProteina("plancha");
    }
    @Override public void freirCarne() { /* opcional */ }
    @Override public void empanarYFreirPollo() { /* No aplica */ }
    @Override public void agregarQueso(String tipo) { burg.addQueso(tipo != null ? tipo : "Americano"); }
    @Override public void agregarVegetales(List<String> lista) {
        burg.addVegetales(lista != null ? lista : Arrays.asList("lechuga", "tomate"));
    }
    @Override public void agregarSalsas(List<String> lista) {
        List<String> base = new ArrayList<>(Arrays.asList("mayonesa"));
        if (lista != null) base.addAll(lista);
        burg.addSalsas(base);
    }
    @Override public void agregarTocineta() { burg.setTocineta(true); }
    @Override public void armar() { /* */ }
    @Override public void envolver() { /* */ }
    @Override public Hamburguesa getResultado() { return burg; }
}

