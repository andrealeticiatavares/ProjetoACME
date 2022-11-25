package Model;

public class Horista extends Funcionarios{
    private double valorHora;
    private double numHoras;

    public Horista(int numRegistro, String nome, double valorHora, double numHoras) {
        super(numRegistro, nome);
        this.valorHora = valorHora;
        this.numHoras = numHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    @Override
    public double calcularSalario() {
        return numHoras*valorHora;
    }
}
