package main;
import entities.PedidoOnlineSimples;

public class Program {
        public static void main(String[] args) {
        
        PedidoOnlineSimples pedido = new PedidoOnlineSimples("PED-2025-001","Headset Bluetooth",3, 15000.0);        
                
        double valorTotal = pedido.calcularValor();
        
        pedido.marcarComoPago();
        
        pedido.marcarComoEnviado();
        
        System.out.println(pedido.getNumeroPedido());
        
        System.out.println(pedido.getDescricaoProduto());
        
        System.out.println(pedido.getEstado());
        
        System.out.println(valorTotal);
     
    }
}
