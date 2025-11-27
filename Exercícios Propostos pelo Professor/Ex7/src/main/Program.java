package main;

import entities.Camiao;
import entities.Carro;
import entities.Veiculo;

public class Program {
    public static void main(String[] args){
        Carro carro = new Carro(4, 5, "LD-10-20-AA", "Toyota", "Corolla");
        Camiao camiao = new Camiao(18.0, 3, "LD-30-40-BB", "Mercedes", "Actros");
        Veiculo veiculo = new Veiculo();
        
        carro.adicionarLista(carro);
        camiao.adicionarLista(camiao);
        
        veiculo.imprimirLista();
    }
}
