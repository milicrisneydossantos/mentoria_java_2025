package entities;

public class Camiao extends Veiculo {
    private double capacidadeCargaToneladas;
    private int numerosEixos;

    public Camiao() {
    }

    public Camiao(double capacidadeCargaToneladas, int numerosEixos) {
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
        this.numerosEixos = numerosEixos;
    }

    public Camiao(double capacidadeCargaToneladas, int numerosEixos, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
        this.numerosEixos = numerosEixos;
    }

    public int getNumerosEixos() {
        return numerosEixos;
    }

    public void setNumerosEixos(int numerosEixos) {
        this.numerosEixos = numerosEixos;
    }

    public double getCapacidadeCargaToneladas() {
        return capacidadeCargaToneladas;
    }

    public void setCapacidadeCargaToneladas(double capacidadeCargaToneladas) {
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public String toString() {
            return "Camiao{" + "marca = " + marca + ", modelo = " + modelo +  ", matricula = " + matricula +  ", capacidadeCargaToneladas = " + capacidadeCargaToneladas + ", numerosEixos = " + numerosEixos + '}';
    }

    @Override
    public void descrever() {
        System.out.println("Camiao e um Veiculo");
    }
    
}
