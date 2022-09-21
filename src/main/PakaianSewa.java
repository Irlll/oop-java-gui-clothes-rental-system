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
abstract class info {
    public abstract void setWaktuSewa(double waktuSewa);

    public abstract void setWatkuKembali(double waktuKembali);
}

interface denda {
    double denda = 50000;

    void totalDenda(String nama);
}

public class PakaianSewa extends info implements denda {
    private String namaPenyewa;
    private double hargaSewa;
    private double stok;
    private double jumlahSewa;
    private double waktuSewa = 0;
    private double waktuKembali = 0;
    public static double totalBayar = 0;

    public PakaianSewa(String namaPenyewa, double hargaSewa, double stok, double jumlahSewa) {
        this.namaPenyewa = namaPenyewa;
        this.hargaSewa = hargaSewa;
        this.stok = stok;
        this.jumlahSewa = jumlahSewa;
    }

    @Override
    public void setWaktuSewa(double waktuSewa) {
        this.waktuSewa = waktuSewa;
    }

    @Override
    public void setWatkuKembali(double waktuKembali) {
        this.waktuKembali = waktuKembali;
    }

    public void sewa() {
        if (this.stok >= this.jumlahSewa) {
            this.stok -= this.jumlahSewa;
            this.totalBayar = this.hargaSewa * this.jumlahSewa * this.waktuSewa;

            System.out.println("\n=====================================");
            System.out.println("Pakaian tersedia. Sewa berhasil.");
            System.out.println("=====================================\n");
        } else {
            System.out.println("==============================================================");
            System.out.println("\nPakaian tidak tersedia. Jumlah sewa melebihi persedediaan \n");
            System.out.println("==============================================================");
            System.exit(0);
        }
    }

    public void sewa(String voucher) {
        if (voucher == "pbo") {

            if (this.stok >= this.jumlahSewa) {
                this.stok -= this.jumlahSewa;
                this.totalBayar = this.hargaSewa * this.jumlahSewa * this.waktuSewa * 0.8;

                System.out.println("\n=====================================");
                System.out.println("Pakaian tersedia. Sewa berhasil.");
                System.out.println("=====================================\n");
            } else {
                System.out.println("==============================================================");
                System.out.println("\nPakaian tidak tersedia. Jumlah sewa melebihi persedediaan \n");
                System.out.println("==============================================================");
                System.exit(0);
            }
        } else {
            System.out.println("Voucher salah. Harga normal");
            if (this.stok >= this.jumlahSewa) {
                this.stok -= this.jumlahSewa;
                this.totalBayar = this.hargaSewa * this.jumlahSewa * this.waktuSewa;

                System.out.println("\n=====================================");
                System.out.println("Pakaian tersedia. Sewa berhasil.");
                System.out.println("=====================================\n");
            } else {
                System.out.println("==============================================================");
                System.out.println("\nPakaian tidak tersedia. Jumlah sewa melebihi persedediaan \n");
                System.out.println("==============================================================");
                System.exit(0);
            }
        }
    }

    public void totalDenda(String nama) {
        if (this.waktuKembali > this.waktuSewa) {
            double hariDenda = this.waktuKembali - this.waktuSewa;
            double totalDenda = this.hargaSewa * hariDenda + denda;
            this.totalBayar += totalDenda;
            System.out.println(nama + " kena denda " + totalDenda);
        } else {
            System.out.println(nama + " tidak dikenai denda. Pakaian dikembalikan tepat waktu");
        }
    }

    public void info() {
        System.out.println("==========================");
        System.out.println("======= Info Sewa ========");
        System.out.println("==========================");
        System.out.println("Nama            : " + this.namaPenyewa);
        System.out.println("==========================");
        System.out.println("======= Detail Sewa ======");
        System.out.println("==========================");
        System.out.println("Harga sewa/hari : " + this.hargaSewa);
        System.out.println("Jumlah Sewa     : " + this.jumlahSewa);
        System.out.println("Waktu Sewa      : " + this.waktuSewa + " hari");
        System.out.println("Waktu Kembali   : " + this.waktuKembali + " hari");
        System.out.println("Total bayar     : " + this.totalBayar);
        System.out.println("==========================");
        System.out.print("Status denda    : ");
        totalDenda(this.namaPenyewa);
        System.out.println("Total           : " + this.totalBayar);
        System.out.println("==========================");
    }
}
