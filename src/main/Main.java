/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * Scanner input = new Scanner(System.in);
         * System.out.print("Masukkan nama               : "); String nama =
         * input.nextLine(); System.out.print("Masukkan jumlah hari sewa   : "); double
         * waktuSewa = input.nextDouble();
         * System.out.print("Masukkan jumlah hari kembali: "); double waktuKembali =
         * input.nextDouble(); System.out.print("Masukkan jumlah sewa        : ");
         * double jumlah = input.nextDouble(); SewaGaun SHPeach = new SewaGaun(nama,
         * "Sweet Heart Gown", 500000, 88, 88, 88, 2, jumlah, "Peach");
         * SHPeach.setWaktuSewa(waktuSewa); SHPeach.setWatkuKembali(waktuKembali);
         * SHPeach.sewa(); SHPeach.detailinfo();
         */

        Welcome wlc = new Welcome();
        wlc.setVisible(true);
        wlc.pack();
        wlc.setLocationRelativeTo(null);
        wlc.setDefaultCloseOperation(Welcome.EXIT_ON_CLOSE);

    }

}
