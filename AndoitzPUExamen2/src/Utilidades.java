import java.util.*;

public class Utilidades{

    public static int textoANum(String cadena){
        int resul = 0;

        cadena = cadena.trim().toLowerCase();
        cadena = cadena.replaceAll("(.)\\1+", "$1");
        System.out.println(cadena);

        if (cadena.equals("uno")){
            resul=1;
        }
        else if (cadena.equals("dos")){
            resul=2;
        }
        else if (cadena.equals("tres")){
            resul=3;
        }
        else if (cadena.equals("cuatro")){
            resul=4;
        }
        else if (cadena.equals("cinco")){
            resul=5;
        }
        else if (cadena.equals("seis")){
            resul=6;
        }
        else if (cadena.equals("siete")){
            resul=7;
        }
        else if (cadena.equals("ocho")){
            resul=8;
        }
        else if (cadena.equals("nueve")){
            resul=9;
        }
        return resul;
    }

    public static int[] textoAArray(String cadena){
        String[] palabras = cadena.trim().toLowerCase().replaceAll("(.)\\1+", "$1").split("\\s+");
        int [] resul = new int[palabras.length];

        for (int i = 0; i < resul.length; i++) {
            resul[i] = textoANum(palabras[i]);
        }

        return resul;

    }

    public static double to2Deci(double valor) {
        return Math.floor(valor * 100) / 100d;
    }

    public static double[] regla3Array(int[] array, int valAbso) {
        double[] result = new double[array.length];
        int sumaTot = 0;
        for (int i = 0; i < array.length; i++) {
            sumaTot = sumaTot + array[i];
        }
        for (int i = 0; i < array.length; i++) {
            result[i] = to2Deci(array[i] * valAbso / (double) sumaTot);
        }
        return result;
    }

    public static double[] StrARegla3Array(String cadena, int valAbso){
        int[] paso1 = textoAArray(cadena);

        double[] resul = regla3Array(paso1, valAbso);


        return resul;
    }
    

}