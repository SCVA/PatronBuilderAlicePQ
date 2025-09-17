// ====================== Mesero (Director) ======================
class Mesero {
    private Cocinero cocinero;
    private Hamburguesa resultado;

    public Mesero(Cocinero cocinero) {
        this.cocinero = cocinero;
    }

    public void cambiarCocinero(Cocinero nuevo) {
        this.cocinero = nuevo;
    }

    public Pedido tomarPedido(Cliente cliente) {
        return cliente.hacerPedido();
    }

    public void preparar(Pedido pedido) {
        cocinero.reset();
        cocinero.tostarPan();
        cocinero.cocinarCarne(pedido.termino);
        cocinero.agregarQueso(pedido.queso);
        cocinero.agregarVegetales(pedido.vegetales);
        cocinero.agregarSalsas(pedido.salsas);
        if (pedido.tocineta) cocinero.agregarTocineta();
        cocinero.armar();
        cocinero.envolver();
        resultado = cocinero.getResultado();
        if (pedido.tamano != null && pedido.tamano.equalsIgnoreCase("doble")) {
            resultado.setDobleCarne(true);
            resultado.setTamano("doble");
        } else {
            resultado.setTamano("simple");
        }
    }

    public Hamburguesa entregar() {
        return resultado;
    }
}
