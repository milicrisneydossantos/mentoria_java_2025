package main;

import entities.Cliente;
import entities.Endereco;

public class program {
    public static void main(String[] args){
        String telefone = "923404040";
        
        Endereco endereco1 = new Endereco("Av. Deolinda Rodrigues, 1000", "Kinaxixi", "Luanda", "Angola");
        Cliente cliente = new Cliente("João Manuel","005000123LA044", "923000111", endereco1);
        
        System.out.println(cliente);
        
        Endereco endereco2 = new Endereco("Rua Direita do Camama, 250", "Camama","Luanda","Angola");

        cliente.atualizarEndereco(endereco2);
        cliente.atualizarTelefone(telefone);
        
        System.out.println(cliente);
    } 
}
