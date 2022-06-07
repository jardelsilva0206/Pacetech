/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jardel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double cotacaoDolar;
       
        System.out.println("Digite a cotação atual do dólar($1 dólar = R$ ??):");
        cotacaoDolar = leitor.nextDouble();
        int continua = 1;
        int opcao = 0;
        float temperatura=0;
        float resultado = 0;
        double valorAconverter = 0;
        double valorConvertido = 0;
        
        while(continua==1){
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Converter temperatura Celsius para Fahrenheit ou Fahrenheit para Celsius");
            System.out.println("2 - Converter Reais para Dólar ou Dólar para Reais:");
            opcao = leitor.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("1 - Deseja converter Fahrenheit para Celsius");
                    System.out.println("2 - Deseja converter Celsius para Fahrenheit");
                    opcao = leitor.nextInt();
                    System.out.println("Informe a temperatura a ser convertida:");
                    temperatura = leitor.nextFloat();
                    if(opcao==1){
                        resultado = (temperatura-32)*5/9;
                        System.out.println(temperatura+"° Fahrenheit equivalem a "+
                                new DecimalFormat(".##").format(resultado)+"° Celsius");
                    }else{
                        if(opcao==2){
                            resultado = temperatura*9/5+32;
                            System.out.println(temperatura+"° Celsius equivalem a "+
                                    new DecimalFormat(".##").format(resultado)+"° Fahrenheit");
                        }else{
                            System.out.println("Opção inválida.");
                            break;
                        }
                    }
                    
                    break;
                case 2:
                    System.out.println("1 - Deseja converter Dólar para Reais");
                    System.out.println("2 - Deseja converter Reais para Dólar");
                    opcao = leitor.nextInt();
                    System.out.println("Informe o valor a ser convertido:");
                    valorAconverter = leitor.nextFloat();
                    if(opcao==1){
                        valorConvertido=valorAconverter*cotacaoDolar;
                        System.out.println("$ "+valorAconverter+" equivalem a R$ "
                                +new DecimalFormat(".##").format(valorConvertido)+" "
                                + "na cotação atual.");
                    }else{
                        if(opcao==2){
                            valorConvertido=valorAconverter/cotacaoDolar;
                        System.out.println("R$ "+valorAconverter+" equivalem a $ "+
                                new DecimalFormat(".##").format(valorConvertido)+" "
                                + "na cotação atual.");
                        }else{
                            System.out.println("Opção inválida");
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja fazer mais alguma conversão? (1-sim/2-não)");
                    continua = leitor.nextInt();
            while(!(continua==1||continua==2)){
                        System.out.println("Opção inválida!");
                        System.out.println("Deseja fazer mais alguma conversão? (1-sim/2-não)");
                        continua = leitor.nextInt();      
            }
            
        }
    }
    
}
