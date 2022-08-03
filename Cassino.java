/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetosemana1cursodev;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jardel
 */
public class Cassino {
    public static void main(String[] args) {
        ArrayList<Integer> numerosSorteados = new ArrayList<Integer>();
        int numero = 0;
        int maiorNumero = 0;
        int menorNumero = 2147483647;
        while(numero!=-1){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Informe o número sorteado:"));
            if(numero!=-1){
                numerosSorteados.add(numero);
            }
            if(numerosSorteados.isEmpty()){
                maiorNumero = numero;
                menorNumero = numero;
            }else{
             if(numero<menorNumero){
                 menorNumero=numero;
             }
             if(numero>maiorNumero){
                 maiorNumero=numero;
             }
            }
        }
        System.out.println("Os números sorteados foram: "+numerosSorteados);
        System.out.println("Quantidade de números sorteados: "+numerosSorteados.size());
        System.out.println("Maior número sorteado: "+maiorNumero);
        System.out.println("Menor número sorteado: "+menorNumero);
    }
}
