package com.marioaliaga.string;

/**
 * Created by maliaga on 8/11/16.
 */
public class UsandoStringBuffer {

    private static String metodo1(int n){
        String resultado = "";
        for(int i = 0 ; i < n ; i++)
            resultado+= i + ", ";
        return resultado;
    }

    private static String metodo2(int n){
        StringBuffer resultado = new StringBuffer();
        for(int i = 0 ; i < n ; i++)
            resultado.append(i).append(", ");
        return resultado.toString();
    }

    public static void main(String ... agrs){
        int n = 300;
        long t1, t2;
        t1 = System.currentTimeMillis();
        metodo1(n);
        t2 = System.currentTimeMillis();
        System.out.println("Method 1: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        metodo2(n);
        t2 = System.currentTimeMillis();
        System.out.println("Method 2: " + (t2 - t1) + " ms");
    }
}
