# Semana 8
# Parte 1: Interfaces en un Sistema de E-commerce.

Este proyecto demuestra el uso de interfaces en Java para definir contratos de comportamiento, lo que permite la modularidad,
el polimorfismo por subtipo y un diseño orientado a objetos flexible.

- Conceptos: Interfaces (Contratos)
- Explicacion: Se utilizan para definir el qué (el comportamiento) sin definir el cómo (la implementación). Clases como Producto y Pedido se comprometen a implementar Pagable.
- Archivos Relevantes: Pagable.java, Notificable.java,Pago.java

- Concepto: Polimorfismo de subtipo
- Explicacion en el codigo: Tratar objetos de diferentes tipos de manera uniforme. Por ejemplo, la interfaz Pago permite procesar pagos a través de objetos TarjetaCredito o PayPal con el mismo método (procesarPago).
- Archivo relevantes: EcommerceMain.java

- Concepto: Herencia de Interfaces
- Explicacion: Una interfaz (PagoConDescuento) puede extender otra (Pago) para combinar y heredar contratos. Esto permite la creación de jerarquías de comportamiento.
- Archivo relevantes: PagoConDescuento.java

- Concepto: Implementación Múltiple
- Explicacion: La clase PayPal implementa los contratos de PagoConDescuento (y, por extensión, de Pago), demostrando cómo una clase puede adoptar múltiples roles.
- Archivo relevante: PayPal.java

- Concepto: Acoplamiento Bajo
- Explicacion: La clase Pedido interactúa con el cliente a través de la interfaz Notificable, no de la clase Cliente. Si se añade una nueva clase de notificación (ej., EmailService), el código del Pedido no necesita cambiar.
- Archivo: Pedido.java,Notificable.java
