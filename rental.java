package RentalMoto;

import java.util.Scanner;

public class rental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rental1.pilihan();
        System.out.print("Transaksi lagi Ya=1 Tidak=2 : ");
        int hari=input.nextInt();
        if(hari==1){
            //  pemangilan kelas rental dan methode pilihan
            //nama class.nama methode
            rental1.pilihan();
        }

    }
}

