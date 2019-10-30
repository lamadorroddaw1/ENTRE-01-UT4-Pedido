
/**
 *  Clase para probar el resto de clases
 *  @author Lander Amador Rodriguez
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    public TestPedido()    {
        // crear pedido1
        pedido1 = new Pedido(new Fecha(4, 9, 2019), new Cliente("Juan Soto","Avda pio XII",
        "Pamplona", "Navarra"), 
        new LineaPedido(new Producto("Rotulador", 6.70),  20), 
        new LineaPedido(new Producto("Memoria USB 64 GB", 14.70),10));       

        // crear pedido2
        pedido2 = new Pedido(new Fecha(8,10, 2019), new Cliente("Elisa Nuin","C/ Rio Alzania 7",
        "Pamplona", "Navarra"), 
        new LineaPedido(new Producto("Sacapuntas manual", 16.64),  8), 
        new LineaPedido(new Producto(" Corrector tippex", 5.99), 20));
    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
      System.out.printf("Pedido 1" + "\n" + "-----------" + "\n" + pedido1.toString() + "\n");       
      System.out.printf("Pedido 2" + "\n" + "-----------" + "\n" + pedido2.toString()); 
      if(pedido1.masAntiguoQue(pedido2)){
       System.out.println("\nEl pedido 1 se ha realizado antes que el pedido 2");
      } 
      else{System.out.println("\nEl pedido 2 se ha realizado antes que el pedido 1");
      } 
    }
}
