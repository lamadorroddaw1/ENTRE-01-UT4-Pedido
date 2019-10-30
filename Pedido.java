
/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 * @author Lander Amador Rodriguez
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;
    private Producto producto;
    /**
     * Constructor  
     */
    public Pedido(Fecha fecha,Cliente cliente,LineaPedido linea1,
    LineaPedido linea2){
        this.fecha = fecha;
        this.cliente = cliente;
        this.linea1 = linea1;
        this.linea2 = linea2;
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente  getCliente() {
        return cliente;
    }

    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public  double getImporteAntesIva() {
        double importe = 0;
        importe = linea1.getCantidad() * producto.getPrecio();
        return importe;  
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double  getIva() {
        double importe = 0;
        importe = producto.getPrecio() * IVA;
        return importe;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double  getImporteTotal() {
        double importe = 0;
        importe = linea1.getCantidad() * producto.getPrecio() * IVA;
        return importe;
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String toString = String.format(getFecha() +  "\nDATOS DEL CLIENTE" +  "\n" 
        + getCliente() + "\n****** Articulos en el pedido *******" + "\n"
        + getPedidoActual() + "\n***** A pagar *****" + "\n" + 
        "IMPORTE SIN IVA: " + getImporteAntesIva() + "\n" +
        "IVA: "+  getIva() + "\n" + 
        "IMPORTE TOTAL: " + getImporteTotal()) + "\n";        
        return toString;
    }

    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
     public boolean masAntiguoQue(Pedido otro) {        
        return fecha.antesQue(otro.getFecha());
    }

    /**
     * devuelve una referencia al pedido actual
     */
    public  String  getPedidoActual() {
        return producto.getNombre();
    }

}
