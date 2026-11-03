package EstrategiaPago;

public class Carrito {
    private EstrategiaPago estrategia;
    private double total = 0;

    public Carrito(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public void agregar(double precio) {
        total += precio;
    }

    public void cambiarEstrategia(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public String pagar() {
        return estrategia.pagar(total);
    }
}