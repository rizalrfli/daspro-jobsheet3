import java.util.Scanner;
public class Siakad01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis , nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = (nilaiKuis*20/100) + (nilaiTugas*15/100) + (nilaiUAS*30/100) +(nilaiUTS*35/100 );

        System.out.println("Nama\t\t: " + nama );
        System.out.println("NIM\t\t: " +nim);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("Absen\t\t: " + absen);
        System.out.println("Nilai akhir\t: " + nilaiAkhir);
    }
}