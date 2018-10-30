package javaapp_02_valostombosszead;

import java.util.Random;

public class JavaApp_02_ValosTombOsszead {

    public static void main(String[] args) {
        double[] tomb1 = veletlenValosTomb(10, -30, 30);
        double[] tomb2 = veletlenValosTomb(10, -30, 30);
        double[] tomb3 = new double[10];
        for (int i = 0; i < tomb1.length; i++) {
            tomb3[i] = tomb1[i]+tomb2[i];
            String s = String.format("%10f + %10f = %10f", tomb1[i], tomb2[i], tomb3[i]);
            //System.out.println(tomb1[i] + " + " + tomb2[i] + " = " + tomb3[i]);
            System.out.println(s);
        }
    }
    
    public static double[] veletlenValosTomb(int db, int min, int max){
        Random rnd = new Random();
        
        double[] t= new double[db];
        for (int i = 0; i < db; i++) {
            t[i] = (double)(rnd.nextDouble()*(max-min)+min);
        }
        
        return t;
    }
    
}
