import java.util.Scanner;

public class ukl1 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

        System.out.println("Masukan Berat Paket (KG) : ");
        double berat = input.nextDouble();

        System.out.println("Masukan Jarak Tempuh (KM)");
        double jarak = input.nextDouble();

        System.out.println("Masukan Ukuran Paket Dengan CM");

        System.out.println("Masukan Panjang");
        double panjang = input.nextDouble();

        System.out.println("Masukan Lebar");
        double lebar = input.nextDouble();

        System.out.println ("Masukan Tinggi");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaperkg;
        if(jarak <= 10){
            biayaperkg = 4250;
        }

        else {
        biayaperkg = 6000;
        }

        double biayavolume;
        if (volume > 100){
            biayavolume = 50000;
        }
        else {
            biayavolume = 0;
        }

        double total = (biayaperkg * berat) + biayavolume;
        
        System.out.println("Jadi Total Harga Paket adalah : " + total);
        
        
    }
}