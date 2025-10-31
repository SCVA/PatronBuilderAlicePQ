package udistrital.patronbuilderalicepq;
// ====================== Cocinero (Builder) ======================
import java.util.List;

interface Cocinero {
    void reset();
    void tostarPan();
    void cocinarCarne(String termino);
    void freirCarne();
    void empanarYFreirPollo();
    void agregarQueso(String tipo);
    void agregarVegetales(List<String> lista);
    void agregarSalsas(List<String> lista);
    void agregarTocineta();
    void armar();
    void envolver();
    Hamburguesa getResultado();
}
