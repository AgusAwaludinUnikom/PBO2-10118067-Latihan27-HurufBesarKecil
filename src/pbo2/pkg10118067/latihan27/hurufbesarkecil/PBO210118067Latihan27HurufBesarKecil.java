/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan27.hurufbesarkecil;

import java.util.Scanner;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana mengubah kalimat dengan huruf yang
 *  berantakan menjadi huruf kecil dan kapital
 */
public class PBO210118067Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.print("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.next();
        
        System.out.println(" ");
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
        
        
    }
    
}
