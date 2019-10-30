
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
    /**
     * Constructor  
     */
    public Pedido(Fecha fecha,Cliente cliente,LineaPedido linea1,LineaPedido linea2){
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
        importe = linea1.getCantidad() * linea1.getProducto().getPrecio() +
        linea2.getCantidad() * linea2.getProducto().getPrecio();
        return importe;        
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double  getIva() {
        double importe = 0;
        importe = linea1.getProducto().getPrecio()* IVA + linea2.getProducto().getPrecio()* IVA ;
        return importe;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double  getImporteTotal() {
        double importe = 0;
        importe = getIva() + getImporteAntesIva();
        return importe;
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String toString2 = String.format(
                "%20s %8.2f€\n %20s %8.2f€\n %20s %8.2f€" , "IMPORTE SIN IVA: ", getImporteAntesIva(),
                "IVA: ", getIva() ,
                "IMPORTE TOTAL: " , getImporteTotal());
        String toString = String.format("FECHA PEDIDO: " + getFecha() +  "\nDATOS DEL CLIENTE" +  "\n" 
                + getCliente() + "\n" + "\n ****** Articulos en el pedido *******" + "\n"
                + linea1.toString() + "\n" + linea2.toString() + "\n" + "\n ***** A pagar *****" + "\n" + toString2 + "\n");

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
    public String getPedidoActual() {
        return this.toString();
    }

}
