/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ecommerce;

// 1. Interfaz Pagable: Contrato para cualquier cosa que pueda tener un costo total.
public interface Pagable {
    
    // Método abstracto: obliga a las clases que la implementen a definir cómo calcular su total.
    double calcularTotal(); 
}

