package entities;

public class Carro extends Veiculo{
    private int numerosPortas;
    private int capacidadePassageiros;

    public Carro() {
    }

    public Carro(int numerosPortas, int capacidadePassageiros) {
        this.numerosPortas = numerosPortas;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public Carro(int numerosPortas, int capacidadePassageiros, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numerosPortas = numerosPortas;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getNumerosPortas() {
        return numerosPortas;
    }

    public void setNumerosPortas(int numerosPortas) {
        this.numerosPortas = numerosPortas;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca = " + marca + ", modelo = " + modelo +  ", matricula = " + matricula + ", numerosPortas=" + numerosPortas + ", capacidadePassageiros=" + capacidadePassageiros + '}';
    }

    @Override
    public void descrever() {
        System.out.println("Carro e um Veiculo");
    }
    
}
