package EstrategiaPago;

public class FabricaPagos {
    public static EstrategiaPago crear(String tipo) {
        switch (tipo) {
            case "tarjeta":
                return new PagoTarjeta();
            case "paypal":
                return new PagoPaypal();
            case "efectivo":
                return new PagoEfectivo();
            default:
                throw new IllegalArgumentException("Tipo de pago desconocido: " + tipo);
        }
    }
}