import java.util.Scanner;

public class tugasJobsheet6 {

    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        String buku;
        double harga = 20000.0, jumlah, total;
        System.out.print("Masukkan Jenis Buku : ");
        buku = input14.nextLine();
        System.out.print("Masukkan Jumlah Pembelian : ");
        jumlah = input14.nextDouble();
        if (buku.equalsIgnoreCase("kamus")) {
            if (jumlah > 2) {
                total = (harga * jumlah) - (0.12 * (harga * jumlah));
                System.out.println("Diskon 12%");
            } else {
                total = harga - (0.10 * harga);
                System.out.println("Diskon 10%");
            }
        } else if (buku.equals("novel")) {
            if (jumlah > 3) { 
                total = (jumlah * harga) - (0.9 * (harga * jumlah));
                System.out.println("Diskon 9%");
            } else if (jumlah <= 3) {
                total = (jumlah * harga) - (0.8 * (jumlah * harga));
                System.out.println("Diskon 8%");
            } else {
                total = (jumlah * harga) - (0.7 * (harga * jumlah));
                System.out.println("Diskon 7%");
            }
        } else {
            if (jumlah > 3) {
            total = (jumlah * harga) - (0.5 * (jumlah * harga));
            System.out.println("Diskon 5%");
        } else  {
            total = jumlah * harga;
            System.out.println("Tidak ada diskon");
            }
        } int totalBayar = (int) total;
        System.out.println("Total Pembayaran Anda = " + totalBayar);
    }
}