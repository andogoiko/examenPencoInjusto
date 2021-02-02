import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class UtilidadesTest {
    @Test
    @DisplayName("test1esLunes")
    public void test1(){
        //Preparación
        Utilidades metodos = new Utilidades();
        //Ejecución
        int valAbso = 100;
        int [] ejempl = {1, 2, 3, 4};
        
        double [] resul = metodos.regla3Array(ejempl, valAbso);
        //Confirmación
        assertEquals(ejempl, resul);
    }

    @Test
    @DisplayName("test1esLunes")
    public void test2(){
        //Preparación
        Utilidades metodos = new Utilidades();
        //Ejecución
        String ejempl = "UuuunnnOOO DOs SSeiSS";
        int valAbso = 60;
        double [] esperado = {6.66,13.33,40.0};
        double [] resul = metodos.StrARegla3Array(ejempl, valAbso)
        //Confirmación
        assertEquals(esperado, resul);
    }

    @Test
    @DisplayName("test1esLunes")
    public void test3(){
        //Preparación
        Utilidades metodos = new Utilidades();
        //Ejecución
        String ejempl = "1DAW3 SiEte nueveEE 3 cinco";
        int valAbso = 660;
        double [] esperado = {0,192.5,247.5,82.5};
        double [] resul = metodos.StrARegla3Array(ejempl, valAbso)
        //Confirmación
        assertEquals(esperado, resul);
    }
    @Test
    @DisplayName("test1esLunes")
    public void test4(){
        //Preparación
        Utilidades metodos = new Utilidades();
        //Ejecución
        String ejempl = "unnooooo dos 3 CUATRO fin";
        int valAbso = 660;
        double [] esperado = {1.5,3.0,4.5,6.0,0.0};
        double [] resul = metodos.StrARegla3Array(ejempl, valAbso)
        //Confirmación
        assertEquals(esperado, resul);
    }
    @Test
    @DisplayName("test1esLunes")
    public void test5(){
        //Preparación
        Utilidades metodos = new Utilidades();
        //Ejecución
        String ejempl = "Ceroooo 0 1 99";
        int valAbso = 660;
        double [] esperado = {0,0,60,0};
        double [] resul = metodos.StrARegla3Array(ejempl, valAbso)
        //Confirmación
        assertEquals(esperado, resul);
    }
}
