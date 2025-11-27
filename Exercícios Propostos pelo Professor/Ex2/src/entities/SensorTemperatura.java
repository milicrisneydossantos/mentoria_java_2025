package entities;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
    static double minima = 1;
    static double maxima = 0;
    static int soma = 0;
    static double media = 0;
    static double intervalo = 0;
    static double contador = 0;

    List<Double> list = new ArrayList<>();
    
    private String identificador;
    private String local;

    public SensorTemperatura(String identificador, String local) {
        this.identificador = identificador;
        this.local = local;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "SensorTemperatura{" + "identificador=" + identificador + ", local=" + local + ", leituraMinima=" + minima + ", leituraMaxima=" + maxima + ", media=" + media + ", intervalo de Temperatura=" + String.format("%.1f", intervalo) + '}';
    }  
    
    public void registarLeitura(double valor){
        list.add(valor);
    }
    
    public void obterMedia(){
        for (double x : list) {  
            contador++;
            soma +=x;
        }
        media = soma/contador;
    }
    public void obterIntervalo(){
        minima = list.get(0);
        for (double x : list) {          
            if(x<minima){
                minima=x;
            }
            if(x>maxima){
                maxima=x;
            }
        }
        intervalo = maxima-minima;
    }
}
