package RentalMoto;

import java.util.Scanner;

public class rental1 {
    int hari;
    int harga;
    int sewa;
    double sepeda;
    Scanner input = new Scanner(System.in);
    //    konstructor over loading rental untuK motor
    public rental1(int sewa){
        this.sewa=sewa;
        System.out.println("Sewa perhari :"+sewa);
    }
    //    konstructor over loading rental untuk mobil
    public rental1(int sepeda,int hari){
        this.sepeda=sepeda;
        this.hari=hari;
        int byr=sepeda*hari;
        System.out.println("Sewa perhari :"+byr);
    }
    public static void pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih Kendaraan :");
        System.out.println("1. Motor");
        System.out.println("2. Sepeda");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                rental1.motor();
                break;
            case 2:
                rental1.sepeda();
                break;
        }


    }
    //    methode motor
    public static void motor(){
        Scanner input = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Pilih Jenis Motor");
        System.out.println("======================");
        System.out.println("1.Honda vario");
        System.out.println("2.Honda beat");
        System.out.println("3.Yamaha Nmax");
        System.out.println("4.Yamaha Mio");
        System.out.print("Masukka pilihan : ");
        int pilih1=input.nextInt();
        switch(pilih1){
            case 1:
                rental1 vario=new rental1(80000);
                vario.tampilmotor();
                break;
            case 2:
                rental1 beat=new rental1(70000);
                beat.tampilmotor();
                break;
            case 3:
                rental1 Nmax=new rental1(100000);
                Nmax.tampilmotor();
                break;
            case 4:
                rental1 mio=new rental1(50000);
                mio.tampilmotor();
                break;
        }
    }
    //    methode sepeda
    public static void sepeda(){
        Scanner input = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Pilih Sepeda Gunung ");
        System.out.println("======================");
        System.out.println("1.Polygon");
        System.out.println("2.united");
        System.out.println("3.odessy");
        System.out.println("4.Atlantis");
        System.out.println("5.Aviator");
        System.out.print("Masukka pilihan : ");
        int pilih2=input.nextInt();
        switch(pilih2){
            case 1:
                rental1 polygon=new rental1(200000,1);
                polygon.tampilsepeda();
                break;
            case 2:
                rental1 united=new rental1(200000,1);
                united.tampilsepeda();
                break;
            case 3:
                rental1 odessy=new rental1(250000,1);
                odessy.tampilsepeda();
                break;
            case 4:
                rental1 atlantis=new rental1(200000,1);
                atlantis.tampilsepeda();
                break;
            case 5:
                rental1 aviator=new rental1(250000,1);
                aviator.tampilsepeda();
        }
    }
    void tampilmotor(){
        int jumlahharir2;
        Scanner input = new Scanner(System.in);
        System.out.print("lama sewa:");
        int jmhari=input.nextInt();
        jumlahharir2=jmhari*sewa;
        System.out.print("Anda memilih motor");
        System.out.println("Dengan harga sewa : "+jumlahharir2);
    }
    void tampilsepeda(){
        int jumlahhari;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa :");
        int jmhari=input.nextInt();
        jumlahhari=(int) (jmhari*sepeda*hari);
        System.out.print("Anda memilih sepeda");
        System.out.println("Dengan harga sewa : "+jumlahhari);
    }
}
