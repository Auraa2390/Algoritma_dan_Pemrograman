import java.util.Scanner;
public class DewaAnugrahAljasPutra_0806022210001_Alpro_Nomor_4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total jam kerja : ");
        int jam = input.nextInt();
        
        System.out.println("Total jam kerja anda adalah " + jam + " Jam");

        double kotor;
        double kobo;
        double bonus;

        if (jam > 40){
            kotor = 6*jam;
            bonus = (jam - 40) * 9 ;
            kobo = kotor + bonus;
            System.out.println("Gaji kotor + Bonus ;" + kobo);
        
            if (kobo <= 250){
            double pajak = kobo * 10/100;
            System.out.println("Pajak = " + pajak);
            double bersih = kobo - pajak;
            System.out.println("Gaji yang anda dapat adalah : " + bersih);
             } else if (kobo > 250){
            double pajak = kobo * 12/100;
            System.out.println("Pajak = " + pajak);
            double bersih = kobo - pajak;
            System.out.println("Gaji yang anda dapat adalah : " + bersih);
            }
        } else {
            kotor = 6 * jam;
            if (kotor <= 250){
                double pajak = kotor * 10/100;
                System.out.println("Pajak = " + pajak);
                double bersih = kotor - pajak;
                System.out.println("Gaji yang anda dapat adalah : " + bersih);
                 } else if (kotor > 250){
                double pajak = kotor * 12/100;
                System.out.println("Pajak = " + pajak);
                double bersih = kotor - pajak;
                System.out.println("Gaji yang anda dapat adalah : " + bersih);
                }
        }
        
        
    }
}
