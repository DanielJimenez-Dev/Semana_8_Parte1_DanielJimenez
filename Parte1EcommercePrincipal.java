/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerce;


public class Parte1EcommercePrincipal {

    // EcommerceMain.java - Clase principal para demostrar la funcionalidad.
    
    
    public static void main(String[] args) {
        
        System.out.println("=== INICIO SIMULACION E-COMMERCE ===");

        // 1. Configuración inicial
        Cliente cliente = new Cliente("Daniel Jimenz");
        
        Producto lapiz = new Producto("Cuaderno", 20.50);
        Producto cuaderno = new Producto("Lapiz A4", 5.00);
        Producto mochila = new Producto("Mochila Deportiva", 45.00);

        // 2. Creación del Pedido
        Pedido miPedido = new Pedido(cliente);
        miPedido.agregarProducto(lapiz);
        miPedido.agregarProducto(cuaderno);
        miPedido.agregarProducto(mochila);

        // Mostrar el detalle y el total (uso de Pagable)
        miPedido.mostrarDetalle(); 
        
        double totalPedido = miPedido.calcularTotal(); // Total: 51.50

        // 3. Procesamiento de Pago con Polimorfismo

        // Opción A: Pago con Tarjeta de Crédito (solo implementa Pago)
        System.out.println("\n--- Pago con Tarjeta (Sin Descuento) ---");
        Pago pagoTarjeta = new TarjetaCredito(); // Referencia Pago apunta a TarjetaCredito
        pagoTarjeta.procesarPago(totalPedido); // Llama al método procesarPago de TarjetaCredito

        // Opción B: Pago con PayPal (implementa PagoConDescuento)
        System.out.println("\n--- Pago con PayPal (Con Descuento) ---");
        Paypal pagoPaypal = new Paypal(); // Usamos la clase concreta para acceder a aplicarDescuento
        
        // Aplicar el descuento primero
        double totalConDescuento = pagoPaypal.aplicarDescuento(totalPedido); // Descuento 5%
        
        // Procesar el pago con el monto reducido
        pagoPaypal.procesarPago(totalConDescuento); 

        // 4. Notificación de cambios (uso de Notificable)
        System.out.println("\n--- Notificación de Estado ---");
        // El método cambiarEstado notifica automáticamente al cliente (uso de Notificable).
        miPedido.cambiarEstado("EN PROCESO");
        miPedido.cambiarEstado("ENVIADO"); 
        
        System.out.println("\n=== FIN SIMULACION ===");
    }
}
