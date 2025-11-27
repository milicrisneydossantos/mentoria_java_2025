package main;

import entities.SensorTemperatura;

public class Program {
    public static void main(String [] args){
        SensorTemperatura sensorTemperatura = new SensorTemperatura ("Sala 01", "Laboratorio de Redes");
        
        sensorTemperatura.registarLeitura(22.5);
        sensorTemperatura.registarLeitura(23.0);
        sensorTemperatura.registarLeitura(24.2);
        sensorTemperatura.registarLeitura(21.8);
        sensorTemperatura.registarLeitura(23.5);
        
        sensorTemperatura.obterIntervalo();
        sensorTemperatura.obterMedia();
        
        System.out.println(sensorTemperatura);
    }
}
