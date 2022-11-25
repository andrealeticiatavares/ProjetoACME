package UserInterface;

import Model.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionarios f1, f2,f3,f4;

        f1 = new Chefe(1234,"Juia", 10000,15,500);
        f2 = new Comissionado(1235, "Victor",5000,35);
        f3 = new Horista(1236, "Andrea",80,150);
        f4 = new Empreiteiro(1237, "Jose",5800);

        System.out.println("Chefe -> "+f1.getNumRegistro()+" - "+f1.getNome()+" - R$"+ f1.calcularSalario());
        System.out.println("Comissionado -> "+f2.getNumRegistro()+" - "+f2.getNome()+" - R$"+ f2.calcularSalario());
        System.out.println("Horista -> "+f3.getNumRegistro()+" - "+f3.getNome()+" - R$"+ f3.calcularSalario());
        System.out.println("Empreiteiro -> "+f4.getNumRegistro()+" - "+f4.getNome()+" - R$"+ f4.calcularSalario());
    }
}
