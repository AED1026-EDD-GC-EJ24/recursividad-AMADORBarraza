package miPrincipal;

public class AppFibRecursivode40a50 {
    
	public static void menu() {

		System.out.println("******************************");
        System.out.println("***Midiendo Serie Fibonacci***");
        System.out.println("******************************");

		//instancia de Performance para tomar mediciones
		Performance p =new Performance();
		
		
		int desde = 40;//termino inicial
		int hasta = 50; //termino final
		double ant = -1;
		for (int i=desde;i<=hasta;i++)
		{
			//inicializar contado
			//cont = -1;
			//comenzamos a tomar el tiempo
			p.start();
			//invocamos a la funcion recirsiva
			double f = AppFibonacci.fibonacciRec(i);
			
			//detenemos e tiempo
			p.stop();
			System.out.print("f("+i+") = "+f+", "+p.getMillis()+
					   " ms, "+AppFibonacci.getContador()+" veces.");
			//si no es el primero entonces calculamos el incremento de tiempo
			if(ant>=0)
			{
				System.out.println(" Incr = "+f/ant);
			}
			else
			{
				System.out.println();
			}
			//ahora, el término anteror será el que recien calculamos
			ant = f;
			
		}
	}
	

}
