package main;

import entities.Categoria;
import entities.Livro;

public class Program {
    
    public static void main(String[] args) {

        Categoria categoria1 = new Categoria("Tecnologia", "Livros técnicos e científicos na área de TI e Engenharia");
        Categoria categoria2 = new Categoria("Gestão", "Livros de administração, gestão de pessoas e negócios");
        Livro livro = new Livro("Introdução a Banco de Dados", "Silberschatz", 2011, categoria1);
        
        System.out.println(livro);
        
        livro.atualizarCategoria(categoria2);
        
        System.out.println(livro);
    }
    
}
