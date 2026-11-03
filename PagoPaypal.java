package EstrategiaPago;

public class PagoPaypal implements EstrategiaPago {
    @Override
    public String pagar(double monto) {
        return "Pagando $" + monto + " con PayPal";
    }
}