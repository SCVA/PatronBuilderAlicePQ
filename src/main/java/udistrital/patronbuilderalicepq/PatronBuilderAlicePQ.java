/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package udistrital.patronbuilderalicepq;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class PatronBuilderAlicePQ {

    public static void main(String[] args) {
        // Director con un cocinero por defecto (Clásica)
        Mesero mesero = new Mesero(new CocineroClasica());

        // ================== Pedido 1: Clásica personalizada ==================
        System.out.println("=== Pedido 1: Hamburguesa Clásica Personalizada ===");
        Pedido p1 = Pedido.clasicaBasica();
        p1.tocineta = true;
        p1.salsas.add("ketchup");
        Cliente c1 = new Cliente(p1);

        System.out.println("Cliente realiza pedido de hamburguesa clásica con tocineta y ketchup.");
        Pedido pedido1 = mesero.tomarPedido(c1);
        mesero.cambiarCocinero(seleccionarCocinero(pedido1.getEstilo()));
        System.out.println("Mesero asigna cocinero de estilo: " + pedido1.getEstilo());
        mesero.preparar(pedido1);
        Hamburguesa h1 = mesero.entregar();
        System.out.println("Hamburguesa preparada:");
        System.out.println(h1.descripcion());
        System.out.println();

        // ================== Pedido 2: BBQ ==================
        System.out.println("=== Pedido 2: Hamburguesa BBQ Doble con Cebolla Crispy ===");
        Pedido p2 = new Pedido();
        p2.setEstilo("BBQ");
        p2.termino = "3/4";
        p2.queso = "Cheddar";
        p2.vegetales = Arrays.asList("cebolla crispy");
        p2.salsas = Arrays.asList("BBQ ahumada");
        p2.tocineta = true;
        p2.tamano = "doble";
        Cliente c2 = new Cliente(p2);

        System.out.println("Cliente realiza pedido de hamburguesa BBQ doble, término 3/4, cheddar, cebolla crispy, salsa BBQ ahumada y tocineta.");
        Pedido pedido2 = mesero.tomarPedido(c2);
        mesero.cambiarCocinero(seleccionarCocinero(pedido2.getEstilo()));
        System.out.println("Mesero asigna cocinero de estilo: " + pedido2.getEstilo());
        mesero.preparar(pedido2);
        Hamburguesa h2 = mesero.entregar();
        System.out.println("Hamburguesa preparada:");
        System.out.println(h2.descripcion());
        System.out.println();
    }

    private static Cocinero seleccionarCocinero(String estilo) {
        if ("BBQ".equalsIgnoreCase(estilo)) {
            return new CocineroBBQ();
        }
        if (!"Clasica".equalsIgnoreCase(estilo)) {
            System.err.println("Estilo no soportado (" + estilo + "). Se usará CocineroClasica por defecto.");
        }
        return new CocineroClasica();
    }
}
