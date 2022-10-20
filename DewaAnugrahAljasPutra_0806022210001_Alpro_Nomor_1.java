import java.util.Scanner;
public class DewaAnugrahAljasPutra_0806022210001_Alpro_Nomor_1 {
    public static void main(String[] args){
        Scanner suhu = new Scanner(System.in);
        Scanner konversi = new Scanner(System.in);

        double celcius;
        int ubah;

        System.out.print("Masukkan suhu dalam celcius : ");
        celcius = suhu.nextDouble();

        System.out.println("1 (Fahrenheit)");
        System.out.println("2 (Kelvin)");
        System.out.println("3 (Reamur)");
        System.out.print("Konversi ke :");
        ubah =konversi.nextInt();

        System.out.println(suhu + " C akan dikonversi ke "+ konversi );

        if(ubah == 1){
            System.out.println();
            double fahrenheit = (9/5 * celcius) + 32;

            System.out.println("suhu nya adalah " + fahrenheit + " F");
        }
        if(ubah == 2){
            System.out.println();
            double kelvin = celcius + 273.15;

            System.out.println("suhu nya adalah " + kelvin + " K");
        }
        if(ubah == 3){
            System.out.println();
            double reamur = 4/5 * celcius;

            System.out.println("suhu nya adalah " + reamur + " R ");
        }
        
    }
}
