/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspraktik;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class UTSPraktik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //deklarasi
       int hargabarang , kodebarang, diskon, jumlahbarang, jumlahharga;
       double hasildiskon;
       String namabarang, kasir;
       
       //membuat scanner
       Scanner input = new Scanner(System.in);
       
       //deskripsi
      
       //pensil
       int s = 2000;
       int pensil = 2000;
       System.out.println ("harga buku = " +"Rp " +s);
       
       //buku
       int f = 2500;
       int buku = 2500;
       System.out.println ("harga buku = " +"Rp " +f);
       
       //penggaris
       int g = 1500;
       int penggaris = 1500;
       System.out.println ("harga buku = " +"Rp " +g);
       
       //penghapus
       int h = 500;
       int penghapus = 500;
       System.out.println ("harga buku = " +"Rp " +h);
       
       //tepak
       int e = 15000;
       int tepak = 15000;
       System.out.println ("harga buku = " +"Rp " +e);
       
       //papantulis
       int t = 45000;
       int papantulis = 45000;
       System.out.println ("harga buku = " +"Rp " +t);
       
       //pulpen
       int p = 8000;
       int pulpen = 8000;
       System.out.println ("harga buku = " +"Rp " +p);
       
       //kertasa4
       int k = 30000;
       int kertasa4 = 30000;
       System.out.println ("harga buku = " +"Rp " +k);
       
       //binder
       int r = 20000;
       int binder = 20000;
       System.out.println ("harga buku = " +"Rp " +r);
       
       System.out.println ("Jumlah pensil yang akan anda beli = ");
       int jumlahbuku = input.nextInt();
       System.out.println ("Jumlah yang akan dibeli " + jumlahbuku);
       int jumlahhargabuku = s*jumlahbuku;
       System.out.println ("totalharga = " +"Rp" + jumlahhargabuku);
       
       
    }
    
}
 