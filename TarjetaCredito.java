/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

// MediosDePago.java - Clases que implementan los diferentes tipos de Pago.

// Implementa la interfaz Pago.

class TarjetaCredito implements Pago{
    
    // 4. Implementación del contrato Pago.
    @Override
    public void procesarPago(double monto) {
        System.out.printf("[Pago Tarjeta] Procesando $%.2f. Cargo realizado en 3 cuotas.\n", monto);
    }
}
