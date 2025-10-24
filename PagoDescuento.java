/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ecommerce;

public interface PagoDescuento extends Pago {
    
// 4. Interfaz PagoConDescuento: Extiende el contrato de Pago, añadiendo la capacidad de descuento.
      
    // Método abstracto: obliga a definir cómo se aplica un descuento a un monto.
    double aplicarDescuento(double monto);
}

