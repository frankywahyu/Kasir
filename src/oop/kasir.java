/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class kasir {
    public static void main(String[] args) {
        kasir();

    }

    public static void kasir() {
        Scanner masuk = new Scanner(System.in);
        String nmKsr;
        double diskon1, diskon2, diskon3;
        int jmlBrg, hrgBrg = 0;
        int totalHrg, total, bayar = 0, pembayaran;
        int kodeBrg, ulangi;
        String[] namaBrg = {"Buku", "Penggaris", "Penghapus", "Bolpoin"};

        System.out.println("Identitas : Franky Wahyu Prasetyo / XR6 / 25");
        System.out.println("==Toko Buku Kencana==");

        System.out.print("Nama Kasir : ");
        nmKsr = masuk.nextLine();

        do {
            System.out.print("Masukkan kode barang : ");
            kodeBrg = masuk.nextInt();

            if (kodeBrg == 1) {
                hrgBrg = 3500;
                System.out.println("Nama barang : " + namaBrg[0]);
                System.out.println("Harga Rp" + hrgBrg);
            } else if (kodeBrg == 2) {
                hrgBrg = 3000;
                System.out.println("Nama barang : " + namaBrg[1]);
                System.out.println("Harga Rp" + hrgBrg);
            } else if (kodeBrg == 3) {
                hrgBrg = 1500;
                System.out.println("Nama barang : " + namaBrg[2]);
                System.out.println("Harga Rp" + hrgBrg);
            } else if (kodeBrg == 4) {
                hrgBrg = 3000;
                System.out.println("Nama barang : " + namaBrg[3]);
                System.out.println("Harga Rp" + hrgBrg);
            } else {
                System.out.println("Pilihan tidak ada");
                System.exit(0);
            }

            System.out.print("Masukkan jumlah barang : ");
            jmlBrg = masuk.nextInt();

            totalHrg = hrgBrg * jmlBrg;
            System.out.println("Total Harga Rp" + (int) totalHrg);

            if (totalHrg > 500000) {
                diskon3 = 0.3;
                total = (int) (totalHrg * diskon3);
                bayar = (int) (totalHrg - total);
                System.out.println("Selamat anda mendapatkan diskon 50%");
                System.out.println("Bayar Rp" + bayar);
            } else if (totalHrg > 200000) {
                diskon2 = 0.2;
                total = (int) (totalHrg * diskon2);
                bayar = (int) (totalHrg - total);
                System.out.println("Selamat anda mendapatkan diskon 20%");
                System.out.println("Bayar Rp" + bayar);
            } else if (totalHrg > 100000) {
                diskon1 = 0.1;
                total = (int) (totalHrg * diskon1);
                bayar = totalHrg - total;
                System.out.println("Selamat anda mendapatkan diskon 10%");
                System.out.println("Bayar Rp" + bayar);
            } else if (totalHrg < 100000) {
                System.out.println("Bayar Rp" + bayar);
            }

            System.out.print("Masukkan uang pembayaran Rp");
            pembayaran = masuk.nextInt();

            if (pembayaran == bayar) {
                System.out.println("Uang pembayaran pas");
            } else if (pembayaran > bayar) {
                int kembalian = pembayaran - bayar;
                System.out.println("Uang pembayaran lebih");
                System.out.println("Uang kembalian Rp" + kembalian);
            } else if (pembayaran < bayar) {
                int kurang = bayar - pembayaran;
                System.out.println("Mohon maaf uang pembayaran kurang Rp" + kurang);
            }

            System.out.println("Ulangi program ? ");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Jawab : ");
            ulangi = masuk.nextInt();

        } while (ulangi == 1);
        System.out.println("Terima kasih");
    }

}


