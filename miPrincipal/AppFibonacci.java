package miPrincipal;

import java.util.Scanner;

public class AppFibonacci {
    public static void menu(){
        System.out.println("******************************");
        System.out.println("***   Serie de Fibonacci  ***");
        System.out.println("******************************");

        Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un valor:");
		int n = entrada.nextInt();

        //Invoco función iterativa
        double f = fibonacciIte(n);
        System.out.println("Versión Iterativa");
        System.out.println("El termino "+n+" es "+f);


		//invoco funcion recursiva;
		f = fibonacciRec(n);
        System.out.println("Versión Recursiva");
		//muestro el resultado
		System.out.println("El termino "+n+" es "+f);

		//entrada.close();
       

    }
    static double fibonacciIte(int n) {
		double f=1,r1=1,r2=1;
		for (int i=3;i<=n;i++) {
			f=r1+r2;
			r1=r2;
			r2=f;
		}
		return f;
	}
    static double fibonacciRec(int n) {
		double f;
		if (n<=2)
		{
			f=1;
		}
		else
		{
			f = fibonacciRec(n-1)+fibonacciRec(n-2);
		}
		return f;
		
	}
    
}
