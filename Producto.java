/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

// Producto.java - Representa un artículo que se puede pagar.

// Implementa Pagable, por lo que debe definir el método calcularTotal().
public class Producto implements Pagable {
    
    private String nombre;
    private double precio;

    // Constructor para inicializar los atributos.
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // 2. Implementación del contrato Pagable.
    @Override
    public double calcularTotal() {
        return this.precio; // El total de un producto es simplemente su precio.
    }

    // Método de acceso para mostrar información.
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
