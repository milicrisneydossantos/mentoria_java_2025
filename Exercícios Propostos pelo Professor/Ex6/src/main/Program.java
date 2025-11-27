package main;

import entities.Cliente;
import entities.Fatura;

public class Program {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Empresa XPTO, Lda.", "5000009999","923999000");
        Fatura fatura = new Fatura("FT-2025-0001", "2025-06-01", 250000.0);
        
        fatura.atualizarValor(275000.0);
        
        fatura.associarCliente(cliente);
        
        System.out.println(fatura);
    }
}
