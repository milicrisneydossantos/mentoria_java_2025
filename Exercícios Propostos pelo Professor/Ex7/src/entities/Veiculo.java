package entities;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
       
    static List <Veiculo> list = new ArrayList<>();
    
    public Veiculo(){
    }

    public Veiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    public void descrever(){
        System.out.println("Veiculo");
    }
    
    public void adicionarLista(Veiculo veiculo){
        list.add(veiculo);
    }
    
    public void imprimirLista(){
        for(Veiculo x: list){
            System.out.println(x);
            x.descrever();
        }
    }
}
