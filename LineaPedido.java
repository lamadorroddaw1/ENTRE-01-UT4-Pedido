
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *   @author Lander Amador Rodriguez
 */
public class LineaPedido
{
    private Producto producto;
    private int cantidad;

    /**
     * Constructor  
     */
    public LineaPedido(Producto producto, int cantidad)    {
        producto = this.producto;
        cantidad = this.cantidad;
    }

    /**
     * accesor para el producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * accesor para la cantidad de producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * obtiene una nueva línea de pedido copia idéntica de la actual
     */
    public String obtenerCopia() {
        String copia = "";
        copia = producto.obtenerCopia();
        return copia;
    }

    /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     */
    public String toString() {
        String toString ="";
        System.out.printf("% 10 %-10s","cantidad: " + cantidad);
        return toString;
    }
}
