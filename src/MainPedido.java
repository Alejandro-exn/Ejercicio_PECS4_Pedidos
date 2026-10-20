
public class MainPedido {

    public static void main(String[] args) {

        Pedido pedido = new Pedido("Joaquin", 127.27);
        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("Ventas totales: " + Pedido.getVentasTotales());

        pedido.confirmar();
        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("Ventas totales: " + Pedido.getVentasTotales());

        pedido.confirmar();
        System.out.println("Ventas totales: " + Pedido.getVentasTotales());
    }
}