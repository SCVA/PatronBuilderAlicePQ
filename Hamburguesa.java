// ====================== Producto ======================
import java.util.*;

class Hamburguesa {
    private String tipoPan;
    private String proteina;               // "res", "pollo"
    private String terminoCarne;           // "3/4", "medio", "bien cocido"
    private String preparacionProteina;    // "plancha", "frita", "empanada y frita"
    private List<String> quesos = new ArrayList<>();
    private List<String> vegetales = new ArrayList<>();
    private List<String> salsas = new ArrayList<>();
    private boolean tocineta;
    private boolean dobleCarne;
    private String tamano;                 // "simple", "doble"

    // Setters (builder access)
    public void setTipoPan(String tipoPan) { this.tipoPan = tipoPan; }
    public void setProteina(String proteina) { this.proteina = proteina; }
    public void setTerminoCarne(String terminoCarne) { this.terminoCarne = terminoCarne; }
    public void setPreparacionProteina(String prep) { this.preparacionProteina = prep; }
    public void addQueso(String q) { if (q != null) this.quesos.add(q); }
    public void addVegetales(List<String> v) { if (v != null) this.vegetales.addAll(v); }
    public void addSalsas(List<String> s) { if (s != null) this.salsas.addAll(s); }
    public void setTocineta(boolean t) { this.tocineta = t; }
    public void setDobleCarne(boolean d) { this.dobleCarne = d; }
    public void setTamano(String t) { this.tamano = t; }
    public String getDescripcion() { return descripcion(); }

    public String descripcion() {
        return "Hamburguesa{"
                + "pan='" + tipoPan + '\''
                + ", proteina='" + proteina + '\''
                + ", terminoCarne='" + terminoCarne + '\''
                + ", preparacionProteina='" + preparacionProteina + '\''
                + ", quesos=" + quesos
                + ", vegetales=" + vegetales
                + ", salsas=" + salsas
                + ", tocineta=" + tocineta
                + ", dobleCarne=" + dobleCarne
                + ", tamano='" + tamano + '\''
                + '}';
    }
}
