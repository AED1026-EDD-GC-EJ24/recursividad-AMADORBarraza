package miPrincipal;

public class AppAlfabeto {
    public static void  menu(){
        System.out.println("************************");
        System.out.println(" RECURSIVIDAD INDIRECTA ");
        System.out.println("************************");
        System.out.println();
        metodoA('Z');
        System.out.println();
    }
    public static void metodoA(char c){
        metodoB(c);

    }
    public static void metodoB(char c){
        metodoA(c);

    }
}
