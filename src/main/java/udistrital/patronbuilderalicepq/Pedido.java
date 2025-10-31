package udistrital.patronbuilderalicepq;
// ====================== Pedido (Product Specification) ======================
import java.util.*;

class Pedido {
    public String estilo = "Clasica";
    public String termino = "bien cocido";
    public String queso = "Americano";
    public List<String> vegetales = new ArrayList<>(Arrays.asList("lechuga", "tomate"));
    public List<String> salsas = new ArrayList<>(Arrays.asList("mayonesa"));
    public boolean tocineta = false;
    public String tamano = "simple";

    public static Pedido clasicaBasica() {
        return new Pedido();
    }
}
