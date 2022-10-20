import java.util.Scanner;

public class DewaAnugrahAljasPutra_0806022210001_Alpro_Nomor_2 {
    public static void main(String[] args){
        Scanner nilai = new Scanner (System.in);

        System.out.print("Masukkan nilai rapor anda : ");
        int rapor = nilai.nextInt();

        System.out.println("Nilai rapor anda adalah " + rapor);

        if (rapor == 75 && rapor <= 100){
            System.out.println("Selamat anda lulus");
        } else if (rapor < 75) {
            System.out.println("Maaf, anda tidak lulus");
        } else {}
    }
    
}
