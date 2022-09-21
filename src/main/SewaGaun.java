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
public class SewaGaun extends PakaianSewa {
    private String warnaGaun;
    private String namaGaun;
    private int ukuranPinggang;
    private int ukuranDada;
    private int ukuranPinggul;

    public SewaGaun(String namaPenyewa, String namaGaun, double hargaSewa, int ukuranPinggang, int ukuranDada,
            int ukuranPinggul, double stok, double jumlahSewa, String warnaGaun) {
        super(namaPenyewa, hargaSewa, stok, jumlahSewa);
        this.warnaGaun = warnaGaun;
        this.namaGaun = namaGaun;
        this.ukuranPinggang = ukuranPinggang;
        this.ukuranDada = ukuranDada;
        this.ukuranPinggul = ukuranPinggul;
    }

    public void detailinfo() {
        System.out.println("==========================");
        System.out.println("===== Detail Pakaian =====");
        System.out.println("==========================");
        System.out.println("Nama Gaun       : " + this.namaGaun);
        System.out.println("Warna Gaun      : " + this.warnaGaun);
        System.out.println("Ukuran pinggang : " + this.ukuranPinggang);
        System.out.println("Ukuran dada     : " + this.ukuranDada);
        System.out.println("Ukuran pinggul  : " + this.ukuranPinggul);
        super.info();
    }
}
