import java.util.Scanner;
public class Pemilihan2Percobaan2_14 {
    public static void main(String[] args) {
        double diskon, total_bayar;
        String member;
        int pilihan_menu, harga = 0;

        Scanner input14 = new Scanner(System.in);
         System.out.println("-------------------------");
         System.out.println("===== MENU KAFE JTI =====");
         System.out.println("-------------------------");
         System.out.println("1. Ricebowl");
         System.out.println("2. Ice Tea");
         System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
         System.out.println("-------------------------------------");
         System.out.print("Masukan angka dari menu yang dipilih = ");

         pilihan_menu = input14.nextInt();
         input14.nextLine();
         System.out.print("Apakah Punya Member(y/n) ? = ");
         member = input14.nextLine();
         System.out.println("-------------------------------------");

         if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan String
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);


            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling =" + harga);
                
            } else {
                System.out.println("Masukkan Pilihan Menu Yang Benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah            
            }
            
            // Menghitung eksekusi lebih lanjut jika pilihan salah
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            
        } else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 12000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundlingm = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------");    
        } 
        }
            
        
        