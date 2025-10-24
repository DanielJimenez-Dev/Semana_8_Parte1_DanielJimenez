/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

// Pedido.java - Agrupa productos, calcula el total y notifica al cliente.

import java.util.ArrayList;
import java.util.List;


// 3. Implementamos Pagable (para calcular el total del pedido).
public class Pedido implements Pagable{
    
    private List<Producto> productos; // Lista de artículos en el pedido.
    private Cliente cliente;         // Cliente asociado al pedido.
    private String estado;           // Estado actual del pedido (Ej: "PENDIENTE", "ENVIADO").

    // Constructor: Inicializa la lista de productos, asigna el cliente y el estado inicial.
    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
    }

    // Método para añadir un producto a la lista.
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    // 3. Implementación del contrato Pagable (Polimorfismo).
    // El total del pedido es la suma de los totales de cada producto.
    @Override
    public double calcularTotal() {
        double total = 0;
        // Itera sobre la lista de productos.
        for (Producto p : productos) {
            // Llama a calcularTotal() del producto (método heredado de Pagable).
            total += p.calcularTotal(); 
        }
        return total;
    }
    
    // 5. Método para cambiar el estado y notificar al cliente.
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        
        // Notifica al cliente (el objeto Cliente implementa Notificable).
        String mensaje = "Su pedido ha cambiado de estado a: " + nuevoEstado;
        cliente.recibirNotificacion(mensaje);
    }
    
    // Método para mostrar el detalle del pedido (uso solo para fines de prueba).
    public void mostrarDetalle() {
        System.out.println("\n--- Detalle del Pedido ---");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Estado: " + estado);
        System.out.println("Productos: " + productos);
        System.out.printf("TOTAL del Pedido: $%.2f\n", calcularTotal());
        System.out.println("--------------------------");
    }
}
