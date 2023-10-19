import java.util.Scanner;

public class UTS06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String konfirmasi, keluarga ,namaHarta, pendidikan;
        int jumlahKuliah, jumlahSMA, jumlahSMP, jumlahSD;
        double pengahasilan1th, pajak, nilaiHarta;
        System.out.println("Bayar pajak anda disini");
        System.out.print("Apakah anda memiliki usaha?(y/t): ");
        konfirmasi = sc.nextLine();
        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Masukkan pengahasilan dalam 1 tahun: ");
            pengahasilan1th = sc.nextDouble();               
                System.out.print("Masukkan nama harta anda: ");
                sc.nextLine();
                namaHarta = sc.nextLine();
                System.out.print("Masukkan nilai jual harga: ");
                nilaiHarta = sc.nextDouble();
                System.out.print("Apakah anda sudah berkeluarga?(y/t): ");
                sc.nextLine();
                keluarga = sc.nextLine();
                if (keluarga.equalsIgnoreCase("y")) {
                    System.out.println("Masukkan jumlah anak anda sesuai tingkat pendidikan(SD,SMP,SMA,KULIAH)");
                    
                    System.out.print("Masukkan jumlah anak yang kuliah: ");
                    jumlahKuliah = sc.nextInt();
                    
                    System.out.print("Masukkan jumlah anak yang SMA: ");
                    jumlahSMA = sc.nextInt();
                    
                System.out.print("Masukkan jumlah anak yang SMP: ");
                jumlahSMP = sc.nextInt();
                
                System.out.print("Masukkan jumlah anak yang SD: ");
                jumlahSD = sc.nextInt();
                
                if (jumlahSMA == 1 && jumlahKuliah == 1) {
                    if (nilaiHarta >= 50000000) {
                        pajak = (nilaiHarta * 0.1 + pengahasilan1th)* 0.15;
                        System.out.println("Pajak yang perlu anda bayar " + (int) pajak);
                    } else {
                        pajak = (nilaiHarta * 0.05 + pengahasilan1th)* 0.15;
                        System.out.println("Pajak yang perlu anda bayar " + (int) pajak);
                    }
                }
            }
            else if (keluarga.equalsIgnoreCase("t")) {
                pajak = (nilaiHarta + pengahasilan1th)* 0.15;
                System.out.println("Pajak yang perlu anda bayar " + (int) pajak);  
            }else{
                System.out.println("input salah");
                
            }
        }
    }
}    