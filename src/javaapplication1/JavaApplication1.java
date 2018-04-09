
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soucet =0, pocet = 0;
        while (true) {
            pocet++;
            System.out.print("vlož"+pocet+" . číslo: ");
            int vstup = sc.nextInt();
            if (vstup == 0) break;
            soucet = soucet + vstup;
            if (vstup < min) min = vstup;
            if (vstup > max) max = vstup;
            System.out.println("minimum: "+min);
            System.out.println("maximum "+max);
            System.out.println("průměr: "+((float) soucet/pocet++));
        }     
    }
}
