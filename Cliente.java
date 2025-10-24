/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

// Cliente.java - Implementa Notificable para recibir actualizaciones.

// 5. Implementa Notificable, por lo que debe definir el método recibirNotificacion().
public class Cliente implements Notificable{
    
    private String nombre;
    
    // Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // 5. Implementación del contrato Notificable.
    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("[NOTIFICACION a " + nombre + "]: " + mensaje);
    }
    
    public String getNombre() {
        return nombre;
    }
}

