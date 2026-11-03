package EstrategiaPago;

public class Main {
    public static void main(String[] args) {
        // La fábrica crea la estrategia
        EstrategiaPago estrategia = FabricaPagos.crear("tarjeta");

        // El carrito usa la estrategia
        Carrito carrito = new Carrito(estrategia);
        carrito.agregar(100);
        carrito.agregar(50);
        System.out.println(carrito.pagar()); // Pagando $150.0 con tarjeta

        // Cambiamos de estrategia en tiempo de ejecución
        carrito.cambiarEstrategia(FabricaPagos.crear("paypal"));
        System.out.println(carrito.pagar()); // Pagando $150.0 con PayPal
    }
}