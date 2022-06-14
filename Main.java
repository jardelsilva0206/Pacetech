/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana7;

/**
 *
 * @author Jardel
 */
public class Main {

    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Jardel","Silva",1000);
        Empregado emp2 = new Empregado("Leonel","Silva",2000);
        System.out.println("O empregado "+emp1.getNome()+" "+emp1.getSobrenome()+
                " recebe R$ "+emp1.getSalarioMensal()*12+" por ano.");
        System.out.println("O empregado "+emp2.getNome()+" "+emp2.getSobrenome()+
                " recebe R$ "+emp2.getSalarioMensal()*12+" por ano.");
     emp1.setSalarioMensal(emp1.getSalarioMensal()*1.1);
     emp2.setSalarioMensal(emp2.getSalarioMensal()*1.1);
     System.out.println("Depois do aumento de 10% o salário anual de "+emp1.getNome()+" "+
             emp1.getSobrenome()+" passou a ser de R$ "+emp1.getSalarioMensal()*12);
     System.out.println("Depois do aumento de 10% o salário anual de "+emp2.getNome()+" "+
             emp2.getSobrenome()+" passou a ser de R$ "+emp2.getSalarioMensal()*12);
    }
    
}
