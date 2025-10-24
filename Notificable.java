/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ecommerce;

public interface Notificable {
    
    // 5. Interfaz Notificable: Contrato para cualquier objeto que deba recibir una notificación.
    
    // Método abstracto: recibe un mensaje y obliga a la clase a definir cómo manejarlo.
    void recibirNotificacion(String mensaje);
}

