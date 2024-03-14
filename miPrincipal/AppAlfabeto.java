package miPrincipal;

public class AppAlfabeto {
    public static void  menu(){
        System.out.println("************************");
        System.out.println(" RECURSIVIDAD INDIRECTA ");
        System.out.println("************************");
     
        abecedario_Recursivo('a');
    }
   	 private static void abecedario_Recursivo(char ch) {
	        if (ch <= 'z') {
	            System.out.print(ch + " ");
	            abecedario_Recursivo((char)(ch + 1));
	        }
	    }
}
