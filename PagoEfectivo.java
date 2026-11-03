package EstrategiaPago;

public class PagoEfectivo implements EstrategiaPago {
    @Override
    public String pagar(double monto) {
        return "Pagando $" + monto + " en efectivo";
    }
}