package main;
import entities.ContaTelefonica;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        ContaTelefonica conta = new ContaTelefonica("923404040","Pos-Pago",5000,0,10000.0,5.0);        
        
        System.out.println(conta.toString());
        
        conta.registarConsumoDados(2000);
        
        conta.registarConsumoDados(1500);
        
        int consumo = conta.registarConsumoDados(2500);
        System.out.println("total Consumido: " + consumo); 
        
        double excedente = conta.calcularExcedenteMB();
        System.out.printf("Limite: 5000 ---> Excedente: %.2f%n", excedente); 

        double total = conta.calcularValorAPagar();
        
        System.out.println("Total: " + total);

    }
}
