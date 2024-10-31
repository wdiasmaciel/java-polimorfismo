package veiculo;

public class Veiculo {
    String chassi;
    public Veiculo(String chassi) {
        this.chassi = chassi;
    }
    public String toString(){
        return "Chassi: " + this.chassi;
    }
}