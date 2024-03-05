package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("       RECURSIVIDAD      ");
            System.out.println("*************************");
            System.out.println(" 1) LADRILLOS");
            System.out.println(" 2) Factorial");
            System.out.println(" 3) Números Naturales");
            System.out.println(" 4) Suma Dígitos");
            System.out.println(" 5) Recursividad Indirecta");
            System.out.println(" 6) Máximo Común Divisor");
            System.out.println(" 7) Búsqueda Binaria");
            System.out.println(" 8) Ordenamiento Selección");
            System.out.println(" 9) Torres de Hanoi");
            System.out.println("10) Serie de Fibonacci");
            System.out.println("11) Performance Serie Fibonacci");
            System.out.println("12) Ordenación por Mezclas");
            System.out.println("");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppLadrillos.menu();
               break;
            case 2:
               AppFactorial.menu();
               break;
            case 3:
               AppNaturales.menu();
               break;
            case 4:
               AppSumaDigitos.menu();
               break;
            case 5:
               AppAlfabeto.menu();
               break;
            case 6:
               AppMCD.menu();
               break;
            case 7:
               AppBusquedaBinaria.menu();
               break;
            case 8:
               AppSeleccion.menu();
               break;
            case 9:
               AppHanoi.menu();
               break;
            
            case 10:
               AppFibonacci.menu();
               break;
            case 11:
               AppFibRecursivode40a50.menu();
               break;
            case 12:
               AppMezcla.menu();
               break; 
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }
}