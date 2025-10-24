/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

public class Paypal implements PagoDescuento{
    
    private static final double DESCUENTO_PORCENTAJE = 0.05; // 5% de descuento

    // 4. Implementación del método heredado de PagoConDescuento.
    
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * DESCUENTO_PORCENTAJE;
        System.out.printf("[Paypal] Descuento aplicado (5%%): $%.2f\n", descuento);
        return monto - descuento; // Devuelve el monto final con descuento.
    }

    // 4. Implementación del método heredado de Pago.
    
    @Override
    public void procesarPago(double monto) {
        System.out.printf("[Pago Paypal] Procesando monto final $%.2f.\n", monto);
        System.out.println("[Paypal] Redirigiendo a la pasarela segura...");
    }
}
