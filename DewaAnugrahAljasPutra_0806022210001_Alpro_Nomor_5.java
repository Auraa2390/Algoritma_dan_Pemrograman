import java.util.Scanner;
public class DewaAnugrahAljasPutra_0806022210001_Alpro_Nomor_5 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan nama anda : ");
        String nama = input.nextLine();

        System.out.print("Masukkan jenis kelamin anda (L/P) : ");
        char kelamin = input.next().charAt(0);

        System.out.print("Apakah anda sudah menikah? (Y/T) : ");
        char menikah = input.next().charAt(0);

        if (kelamin == 'L' && menikah == 'Y'){
            System.out.println("Hello Mr." + nama);
        } else if (kelamin == 'L' && menikah == 'T'){
            System.out.println("Hello Mr." + nama);
        } else if (kelamin == 'P' && menikah == 'Y'){
            System.out.println("Hello Mrs." + nama);
        } else if (kelamin == 'P' && menikah == 'T'){
            System.out.println("Hello, Ms." + nama);
        } else if (kelamin == 'l' && menikah == 'y'){
            System.out.println("Hello Mr." + nama);
        } else if (kelamin == 'l' && menikah == 't'){
            System.out.println("Hello Mr." + nama);
        } else if (kelamin == 'p' && menikah == 'y'){
            System.out.println("Hello Mrs." + nama);
        } else if (kelamin == 'p' && menikah == 't'){
            System.out.println("Hello, Ms." + nama);
        }
    }
}
