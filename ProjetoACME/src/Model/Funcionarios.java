package Model;

//Classe abstrata só serve para referencias
public abstract class Funcionarios {
    protected int numRegistro;
    protected String nome;

    public Funcionarios(int numRegistro, String nome) {
        super();
        this.numRegistro = numRegistro;
        this.nome = nome;
    }

    //As classes abstratas me permitem criar as "clausulas contratuais" para
    //que as classesfilhas se compromentam a implementar
    public abstract double calcularSalario();

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
