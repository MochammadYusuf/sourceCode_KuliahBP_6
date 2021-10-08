/*
 + Code by Mochammad Yusuf Pratama ( NPM 21082010063 )( Par B082 )
 + FIK Sistem Informasi UPN "Veteran" Jawa Timur
 + 
 + Input Output Documentation : 
 + https://myassignmentyusuf.wordpress.com/2021/10/08/portofolio-mata-kuliah-bahasa-pemrograman-1-5/
*/

package kuliah;

import java.util.Scanner;

public class kuliahBP_6 {
    
    public static void main(String[] args) {
        
        // Pemanggilan Scanner
        Scanner input = new Scanner(System.in);
        
        // Inisialisasi
        boolean stop = false;
        int menu, totalHarga = 0, hargaAkhir = 0, uangPembayaran, 
                kembalian = 0, jumlahBayar = 0;
        
        // Judul Program
        System.out.println("=======================================================");
        System.out.println("Kasir Toko Klontong Sederhana");
        System.out.println("=======================================================");
        System.out.println("Sedia : ");
        System.out.println("1. Aneka Sate.");
        System.out.println("2. Aneka Pecel.");
        System.out.println("3. Aneka Penyetan.");
        System.out.println("=======================================================");
        
        // Loop
        while(!stop) {
                                   
            // Input System (Pilih Menu)
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            System.out.println("=======================================================");
                                
            // Pengkondisian (Menu)
            switch(menu) {
                case 1: // Sate
                    int sate, tusuk;
                    System.out.println("Aneka Menu Sate dan Harga : ");
                    System.out.println("1. Sate Ayam Rp1.500 per Tusuk.");
                    System.out.println("2. Sate Kambing Rp3.000 per Tusuk.");
                    System.out.println("=======================================================");
                    System.out.print("Pilih Menu Sate : ");
                    sate = input.nextInt();
                        
                    switch(sate) {
                        case 1: // Sate Ayam
                            System.out.print("Masukkan Jumlah Tusuk Sate : ");
                            tusuk = input.nextInt();
                            totalHarga = tusuk * 1500;
                            jumlahBayar = jumlahBayar + totalHarga;
                            System.out.println("=======================================================");
                            System.out.println("Total Harga = Rp " + totalHarga);
                            System.out.println("Jumlah Pembayaran = Rp " + jumlahBayar);
                            break;
                        case 2: // Sate Kambing
                            System.out.print("Masukkan Jumlah Tusuk Sate : ");
                            tusuk = input.nextInt();
                            totalHarga = tusuk * 3000;
                            jumlahBayar = jumlahBayar + totalHarga;
                            System.out.println("=======================================================");
                            System.out.println("Total Harga = Rp " + totalHarga);
                            System.out.println("Jumlah Pembayaran = Rp " + jumlahBayar);
                            break;
                        default : 
                            System.out.println("Menu Sate Yang Anda Pilih Tidak Tersedia!");
                            break;
                    }
                        
                    break;
                case 2: // Pecel
                    int pecel, porsiPecel;
                    System.out.println("Aneka Menu Pecel dan Harga : ");
                    System.out.println("1. Lauk Ayam Rp13.000 per Porsi.");
                    System.out.println("2. Lauk Empal Rp15.000 per Porsi.");
                    System.out.println("=======================================================");
                    System.out.print("Pilih Menu Pecel : ");
                    pecel = input.nextInt();
                       
                    switch(pecel) {
                        case 1: // Pecel Lauk Ayam
                            System.out.print("Masukkan Jumlah Porsi Pecel : ");
                            porsiPecel = input.nextInt();
                            totalHarga = porsiPecel * 13000;
                            jumlahBayar = jumlahBayar + totalHarga;
                            System.out.println("=======================================================");
                            System.out.println("Total Harga = Rp " + totalHarga);
                            System.out.println("Jumlah Pembayaran = Rp " + jumlahBayar);
                            break;
                        case 2: // Pecel Lauk Empal
                            System.out.print("Masukkan Jumlah Porsi Pecel : ");
                            porsiPecel = input.nextInt();
                            totalHarga = porsiPecel * 15000;
                            jumlahBayar = jumlahBayar + totalHarga;
                            System.out.println("=======================================================");
                            System.out.println("Total Harga = Rp " + totalHarga);
                            System.out.println("Jumlah Pembayaran = Rp " + jumlahBayar);
                            break;
                        default : 
                            System.out.println("Menu Pecel Yang Anda Pilih Tidak Tersedia!");
                            break;
                    }
                      
                    break;

                case 3: // Penyetan
                    int penyetan, porsiPenyetan;
                    System.out.println("Aneka Menu Penyetan dan Harga : ");
                    System.out.println("1. Lauk Tahu/Tempe Rp5.000 per Porsi.");
                    System.out.println("2. Lauk Telur Rp7.000 per Porsi.");
                    System.out.println("3. Lauk Ayam Rp10.000 per Porsi.");
                    System.out.println("=======================================================");
                    System.out.print("Pilih Menu Penyetan : ");
                    penyetan = input.nextInt();
                       
                    switch(penyetan) {
                        case 1: // Penyetan Lauk Tahu Tempe
                            System.out.print("Masukkan Jumlah Porsi Penyetan : ");
                            porsiPenyetan = input.nextInt();
                            totalHarga = porsiPenyetan * 5000;
                            jumlahBayar = jumlahBayar + totalHarga;
                            System.out.println("=======================================================");
                            System.out.println("Total Harga = Rp " + totalHarga);
                            System.out.println("Jumlah Pembayaran = Rp " + jumlahBayar);
                            break;
                        case 2: // Penyetan Lauk Telur
                            System.out.print("Masukkan Jumlah Porsi Penyetan : ");
                            porsiPenyetan = input.nextInt();
                            totalHarga = porsiPenyetan * 7000;
                            jumlahBayar = jumlahBayar + totalHarga;
                            System.out.println("=======================================================");
                            System.out.println("Total Harga = Rp " + totalHarga);
                            System.out.println("Jumlah Pembayaran = Rp " + jumlahBayar);
                            break;
                        case 3: // Penyetan Lauk Ayam
                            System.out.print("Masukkan Jumlah Porsi Penyetan : ");
                            porsiPenyetan = input.nextInt();
                            totalHarga = porsiPenyetan * 10000;
                            jumlahBayar = jumlahBayar + totalHarga;
                            System.out.println("=======================================================");
                            System.out.println("Total Harga = Rp " + totalHarga);
                            System.out.println("Jumlah Pembayaran = Rp " + jumlahBayar);
                            break;
                        default : 
                            System.out.println("Menu Penyetan Yang Anda Pilih Tidak Tersedia!");
                            break;
                    }
                                                
                    break;
                default : 
                    System.out.println("Menu yang Anda Pilih Tidak Tersedia!");
                    break;
            }
                
            System.out.println("=======================================================");
                
            String jawab;
            boolean stopAsk = false;
            
            // Loop (Pertanyaan)
            while (!stopAsk) {
                System.out.print("Ingin Menambah Pesanan (Y/N) : ");

                jawab = input.next();

                if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                    continue;
                }

                stopAsk = true;

                if (jawab.toLowerCase().equals("n")) {
                    stop = true;
                }
                                        
            }
            
        }
        
        System.out.println("=======================================================");
        
        // Kartu Member
        String kartuMember;
        boolean loop = false;
                                      
        // Pengkondisian dan Looping Kartu Member
        while(!loop) {
            
            System.out.print("Memiliki Kartu Member Toko Klontong [Y/N] : ");
            kartuMember = input.next();
            
            if(!kartuMember.toLowerCase().equals("y") && !kartuMember.toLowerCase().equals("n")) {
                continue;
            }
            
            if(loop = true) {
                
                if(kartuMember.toLowerCase().equals("y")) {
                    // Memiliki Kartu
                    hargaAkhir = (int)(jumlahBayar - (jumlahBayar * 0.05));
                    System.out.println("Harga Member : " + hargaAkhir);
                    System.out.print("Uang Pembayaran : ");
                    uangPembayaran = input.nextInt();
                    kembalian = uangPembayaran - hargaAkhir;
                } else if(kartuMember.toLowerCase().equals("n")) {
                    // Tidak Memiliki Kartu
                    System.out.println("Tidak Mendapatkan Diskon");
                    System.out.println("Jumlah Pembayaran = Rp " + jumlahBayar);
                    System.out.print("Uang Pembayaran : ");
                    uangPembayaran = input.nextInt();
                    kembalian = uangPembayaran - jumlahBayar;
                }
                
            }
            
        }
        
        // Pengkondisian Kembalian
        if(kembalian == 0) {
            System.out.println("Uang Anda Pas");
        } else if(kembalian > 0) {
            System.out.println("Uang Kembali : Rp " + kembalian);
        } else if(kembalian < jumlahBayar || kembalian < hargaAkhir){
            System.out.println("Uang Anda Kurang!!!");
        }
        
        // Penutup Program
        System.out.println("=======================================================");
        System.out.println("Terima Kasih Telah Mampir.");
        System.out.println("=======================================================");
        
    }
    
}