package miPrincipal;

public class AppMCD {
    public static void menu(){
        System.out.println("******************************");
        System.out.println("***  Máximo Común Divisor  ***");
        System.out.println("******************************");

        System.out.println("Versión Iterativa");
        int n,m;
        n = 6;
        m = 124;
        System.out.println("MCD de "+n+" y m= "+m+"= "+mcd_ite(n,m));
        n = 124;
        m = 6;
        System.out.println("MCD de "+n+" y m= "+m+"= "+mcd_ite(n,m));
        n = 5;
        m = 5;
        System.out.println("MCD de "+n+" y m= "+m+"= "+mcd_ite(n,m));

        n = 8;
        m = 15;
        System.out.println("MCD de "+n+" y m= "+m+"= "+mcd_ite(n,m));

        System.out.println("Versión Recursiva");
        n = 6;
        m = 124;
        System.out.println("MCD de "+n+" y m= "+m+"= "+mcd_rec(n,m));
        n = 124;
        m = 6;
        System.out.println("MCD de "+n+" y m= "+m+"= "+mcd_rec(n,m));
    }
    public static int mcd_ite(int n,int m)
    {
       //coloque el códifo faltante

    }
    public static int mcd_rec(int n,int m){

        //coloque el código faltante
        
            
    }
    
}
