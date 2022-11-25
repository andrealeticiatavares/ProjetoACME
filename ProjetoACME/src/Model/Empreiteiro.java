package Model;

public class Empreiteiro extends Funcionarios {
    private double valorEmpreita;

    public Empreiteiro(int numRegistro, String nome, double valorEmpreita) {
        super(numRegistro, nome);
        this.valorEmpreita = valorEmpreita;
    }

    public double getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(double valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }

    @Override
    public double calcularSalario() {
        return valorEmpreita;
    }
}
