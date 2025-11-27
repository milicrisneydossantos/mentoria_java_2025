package entities;

public class PedidoOnlineSimples {
    private String numeroPedido;
    private String descricaoProduto;
    private int quantidade;
    private double precoUnitario;
    private String estado;

    public PedidoOnlineSimples(String numeroPedido, String descricaoProduto, int quantidade, double precoUnitario) {
        this.numeroPedido = numeroPedido;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    
    public PedidoOnlineSimples(String numeroPedido, String descricaoProduto, int quantidade, double precoUnitario, String estado) {
        this.numeroPedido = numeroPedido;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "PedidoOnlineSimples{" + "numeroPedido=" + numeroPedido + ", descricaoProduto=" + descricaoProduto + ", quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + ", estado=" + estado + '}';
    }
    
    public double calcularValor(){
        return quantidade * precoUnitario;
    }
    
    public void marcarComoPago(){
        estado = "Pago";
    }
    
    public void marcarComoEnviado(){
        estado = "Enviado";
    }
    
}
