import java.util.Scanner;
public class DewaAnugrahAljasPutra_0806022210001_Alpro_Nomor_3 {
    public static void main(String[] args){
        Scanner angka = new Scanner (System.in);

        System.out.print("Masukkan angka :");
        int gage = angka.nextInt();

        int hasil = gage % 2;

        if (hasil == 0){
            System.out.println("genap");
        }
        if (hasil != 0){
            System.out.println("ganjil");
        }
        
    }
}
