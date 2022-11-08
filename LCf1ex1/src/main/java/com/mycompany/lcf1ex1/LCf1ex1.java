package com.mycompany.lcf1ex1;

import java.util.Scanner;

public class LCf1ex1 {

    public static void main(String[] args) {
        
      
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o valor a ser emprestado, em reais:");
        double C = sc.nextDouble();
        
        System.out.println("Insira a quantidade de meses:");
        int t = sc.nextInt();
        
        double x = 1;
        
        for (int i=0;i<t;i++) {
            x = 1.02 * x;
        }
        
        double M = C * x;
        
        System.out.printf("Valor total a ser pago: R$ %.2f", M);
      

    }
}
