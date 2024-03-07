package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
   
    @SuppressWarnings("rawtypes")
    static OrdenamientoSeleccion os;
    @SuppressWarnings("rawtypes")
    static OrdenamientoMezcla om;

    @BeforeAll public static void setUp() {
        os = new OrdenamientoSeleccion<Integer>();
        om = new OrdenamientoMezcla<Integer>();
    }

    @SuppressWarnings("unchecked")
    @Test public void testOrdSelRec() {
        Integer arreglo[]={20,10,5,40,30,15};
        os.ordenar_rec(arreglo,0,arreglo.length-1);
        assertEquals(arreglo[0],5);
        assertEquals(arreglo[1],10);
        assertEquals(arreglo[2],15);
        assertEquals(arreglo[3],20);
        assertEquals(arreglo[4],30);
        assertEquals(arreglo[5],40);  
    }
    @SuppressWarnings("unchecked")
    @Test public void testOrdMezRec(){
        Integer arreglo[]={20,10,5,40,30,15};
        om.ordenar(arreglo);
        assertEquals(arreglo[0],5);
        assertEquals(arreglo[1],10);
        assertEquals(arreglo[2],15);
        assertEquals(arreglo[3],20);
        assertEquals(arreglo[4],30);
        assertEquals(arreglo[5],40);
    }
    @Test public void testBusBinRec(){
        int ele_bus = 455;
        int arreglo[]={10,20,25,30,35,40,45,50};
        int i=AppBusquedaBinaria.busquedaBinariaRec(arreglo,ele_bus,0,arreglo.length-1);
        assertEquals(i,-1);
        ele_bus = 45;
        i=AppBusquedaBinaria.busquedaBinariaRec(arreglo,ele_bus,0,arreglo.length-1);
        assertEquals(i,6);

    }
    @Test public void testMCDRec(){
       
       int mcd = AppMCD.mcd_rec(6,124);
       assertEquals(mcd, 2 );
      
       mcd = AppMCD.mcd_rec(124,6);
       assertEquals(mcd, 2 );

    }
   
    
}