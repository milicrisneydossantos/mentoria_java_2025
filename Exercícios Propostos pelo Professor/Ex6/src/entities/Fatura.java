package entities;

public class Fatura {
    private String numero;
    private String dataEmissao;
    private double valor;
    private Cliente cliente;

    public Fatura() {
    }

    public Fatura(String numero, String dataEmissao, double valor) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Fatura{" + "numero=" + numero + ", dataEmissao=" + dataEmissao + ", valor=" + valor + ", cliente=" + cliente + '}';
    }
    
    
    
    public void atualizarValor(double valor){
        if(valor > 0){
            this.valor = valor;
        }else{
            System.out.println("Falha, valores negativos nao permitidos!");
        }
    }
    
    public void associarCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
