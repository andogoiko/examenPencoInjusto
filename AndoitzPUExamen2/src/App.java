public class App {
    public static void main(String[] args) throws Exception {
        Utilidades metodos = new Utilidades();
        String cadena ;
        int num;

        // metodo1 prueba funcional

        cadena = "UUNoooo";
        num = metodos.textoANum(cadena);
        System.out.println("La cadena " + cadena + " es " + num);

        // metodo 2 prueba funcional

        cadena = "UUNoooo     dosss   cincooo juan";

        int [] metodo2 = new int[4];

        metodo2 = metodos.textoAArray(cadena);
        
        String arrayS = "";

        for(int i = 0; i < metodo2.length; i++){
            arrayS = arrayS + ", " + metodo2[i];
        }
        System.out.println("La cadena " + cadena + " es " + arrayS);

        // metodo 3 prueba funcional

        int[] arrayM3 = {4, 8, 9};
        String stringM3 = "";
        String solM3 = "";
        int valAbsol = 65;
        double [] metodo3 = metodos.regla3Array(arrayM3, valAbsol);

        for(int i = 0; i < arrayM3.length; i++){
            stringM3 = stringM3 + ", " + arrayM3[i];
        }
        for(int i = 0; i < metodo3.length; i++){
            solM3 = solM3 + ", " + metodo3[i];
        }
        System.out.println("La solucion de " + valAbsol + " por  "  + stringM3 + " es " + solM3);


        // metodo 4 prueba funcional

        cadena = "ochoooooo     maria   cincooo juan trece  tres uno";

        valAbsol = 88;
        double [] metodo4;
        String solM4 = "";
        metodo4 = metodos.StrARegla3Array(cadena, valAbsol);

        for(int i = 0; i < metodo4.length; i++){
            solM4 = solM4 + ", " + metodo4[i];
        }
        System.out.println("La cadena " + cadena + " en lista y valor absoluto de "  + valAbsol + " es " + solM4);


    }


}
