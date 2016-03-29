/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonaci;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Fibbonaci {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah : ");
        int n = input.nextInt();
        
        for (int i = n; i > 0; i--)
            System.out.print(fibbonaci(i) + " ");
    }
    
    public static int fibbonaci(int n) {
        if (n <= 1) return n;
        else return fibbonaci(n-1) + fibbonaci(n-2);
    }
    
}
