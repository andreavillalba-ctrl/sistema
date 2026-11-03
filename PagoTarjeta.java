package EstrategiaPago;

public class PagoTarjeta implements EstrategiaPago {
    @Override
    public String pagar(double monto) {
        return "Pagando $" + monto + " con tarjeta";
    }
}