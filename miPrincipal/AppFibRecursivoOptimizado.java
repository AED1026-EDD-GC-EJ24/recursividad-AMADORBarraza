package miPrincipal;
import java.util.Hashtable;
import java.util.Scanner;

public class AppFibRecursivoOptimizado {
    public static void menu(){
        System.out.println("******************************");
        System.out.println("***  Fibonacci Optimizado  ***");
        System.out.println("******************************");
        //inicializar la tabla
        Hashtable<Integer,Double>t = new Hashtable<Integer,Double>();
        t.put(1, 1d); //1d ->1 convertido a double
        t.put(2,1d); //1d ->1 convertido a double
        //Solicitar ingresar el valor de n
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿ Cuantos terminos quiere ver?:");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            double f = AppFibonacci.fibonacciRecOptimizado(i,t);
            System.out.println("fib("+i+")= "+f);
        }

    }
    
}
