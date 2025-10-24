/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ecommerce;
    
    // 4. Interfaz Pago: Contrato básico para procesar un pago.
public interface Pago {
    // Método abstracto: recibe el monto a pagar y obliga a definir cómo procesar ese pago.
    void procesarPago(double monto);
}
