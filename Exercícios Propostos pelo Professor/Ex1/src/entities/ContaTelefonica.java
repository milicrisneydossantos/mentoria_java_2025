package entities;

public class ContaTelefonica {
    
    private String numero;
    private String plano;
    private int limiteDadosMB;
    private int dadosConsumidosMB;
    private double valorMensalBase;
    private double valorPorMBExcelente;

    public ContaTelefonica(String numero, String plano, int limiteDadosMB, int dadosConsumidosMB, double valorMensalBase, double valorPorMBExcelente) {
        this.numero = numero;
        this.plano = plano;
        this.limiteDadosMB = limiteDadosMB;
        this.dadosConsumidosMB = dadosConsumidosMB;
        this.valorMensalBase = valorMensalBase;
        this.valorPorMBExcelente = valorPorMBExcelente;
    }

    public double getValorPorMBExcelente() {
        return valorPorMBExcelente;
    }

    public void setValorPorMBExcelente(double valorPorMBExcelente) {
        this.valorPorMBExcelente = valorPorMBExcelente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public int getLimiteDadosMB() {
        return limiteDadosMB;
    }

    public void setLimiteDadosMB(int limiteDadosMB) {
        this.limiteDadosMB = limiteDadosMB;
    }

    public int getDadosConsumidosMB() {
        return dadosConsumidosMB;
    }

    public void setDadosConsumidosMB(int dadosConsumidosMB) {
        this.dadosConsumidosMB = dadosConsumidosMB;
    }

    public double getValorMensalBase() {
        return valorMensalBase;
    }

    public void setValorMensalBase(double valorMensalBase) {
        this.valorMensalBase = valorMensalBase;
    }

    @Override
    public String toString() {
        return "ContaTelefonica{" + "numero=" + numero + ", plano=" + plano + ", limiteDadosMB=" + limiteDadosMB + ", dadosConsumidosMB=" + dadosConsumidosMB + ", valorMensalBase=" + valorMensalBase + ", valorPorMBExcelente=" + valorPorMBExcelente + '}';
    }
    
    public int registarConsumoDados(int MB){
        return dadosConsumidosMB +=MB;
    }
    
    public double calcularExcedenteMB(){
        if(dadosConsumidosMB>=limiteDadosMB){
            return (dadosConsumidosMB - limiteDadosMB);
        }else{
            return 0.0;
        }
    }
    
    public double calcularValorAPagar(){
        return calcularExcedenteMB()* valorPorMBExcelente + valorMensalBase;
    }

    

    
}
