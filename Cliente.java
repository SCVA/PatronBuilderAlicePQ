// ====================== Cliente ======================
class Cliente {
    private Pedido pedido;

    public Cliente(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido hacerPedido() {
        return pedido;
    }
}
