package com.mycompany.lcf1ex1;

import java.util.Scanner;

public class LCf1ex1 {

    public static void main(String[] args) {
        
/*        
		Scanner leia = new Scanner(System.in);
		
		double montante, c=0, capital, meses, t=0; 
		
		do {
		System.out.print("\t\tOlá, bem vindo a Ada emprestimos.\nEscolha a carta de crédito abaixo:\n"
				+ "1 - R$ 2.000,00\n2 - 5.000,00\n3 - 10.0000,00 \n4 - 20.000,00"
				+ "\nDigite o número da opção desejada: ");
		capital=leia.nextInt();
		
		if (capital <1 || capital >4){
			System.out.println("Opção inválida, tente novamente!!!\n\n");
		}
		
		}while(capital <1 || capital >4);
	
		
		if (capital ==1) {
			c=2000;
		}
		if (capital ==2) {
			c=5000;
		}
		if (capital ==3) {
			c=10000;
		}
		if (capital ==4) {
			c=20000;
		}
		
		
		System.out.print("\n\nQuanto tempo deseja pagar?"
				+ "\n1 - 12 meses\n2 - 24 meses\n3 - 36 meses\n4 - 48 meses\nDigite o número da opção desejada: ");
		meses=leia.nextInt();
		
		do {
			if (meses <1 || meses >4){
				System.out.println("Opção inválida, tente novamente!!!\n\n");
			}
		
		if(meses==1){
			t=12;
		}
		if(meses==2){
			t=24;
		}
		if(meses==3){
			t=36;
		}
		if(meses==4){
			t=48;
		}
		
		
		
		
		}while(capital <1 || capital >4);
		
		montante = c * Math.pow((1.02), t);
		
		System.out.printf("\nValor a ser pago: %.2f", montante);
		
		leia.close();
*/
      
       
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
