/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ASUS
 */
public class SewaKostum extends PakaianSewa {
    private String jenisKostum;
    private String namaKostum;
    private String ukuranKostum;

    public SewaKostum(String namaPenyewa, String namaKostum, String ukuran, double hargaSewa, double stok,
            double jumlahSewa, String jenisKostum) {
        super(namaPenyewa, hargaSewa, stok, jumlahSewa);
        this.jenisKostum = jenisKostum;
        this.namaKostum = namaKostum;
        this.ukuranKostum = ukuran;
    }
    

    public void detailinfo() {
        System.out.println("==========================");
        System.out.println("===== Detail Pakaian =====");
        System.out.println("==========================");
        System.out.println("Nama Kostum     : " + this.namaKostum);
        System.out.println("Jenis Kostum    : " + this.jenisKostum);
        System.out.println("Ukuran Kostum   : " + this.ukuranKostum);
        super.info();
    }
}
