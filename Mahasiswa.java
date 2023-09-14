import java.util.Scanner;

public class Mahasiswa {

    String nama,jurusan;
    int umur;
    double ipk;


    public Mahasiswa(String nama, int umur, String jurusan){
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa = ");
        int jumlahSiswa = scanner.nextInt();
        Mahasiswa kumpul[] = new Mahasiswa[jumlahSiswa];
        System.out.println("Masukkan data tiap mahasiswa");
        for(int i = kumpul.length;i > 0; i--){
            System.out.println("Mahasiswa ke - " + (i));
            System.out.print("Nama    = ");
            scanner.nextLine();
            String namaSiswa = scanner.nextLine();
            System.out.print("Jurusan = ");
            String   jurusan = scanner.nextLine();
            System.out.print("Umur    = ");
            int umurSiswa = scanner.nextInt();
            kumpul[i-1] = new Mahasiswa(namaSiswa, umurSiswa, jurusan);
        }
        System.out.println();
        //  for(int i = 1;i <= kumpul.length; i++){
        //     System.out.println("Mahasiswa ke - " + i);
        //     System.out.print("Nama    = ");
        //     System.out.println(kumpul[i-1].nama);
        //     System.out.print("Umur    = ");
        //     System.out.println(kumpul[i-1].umur);
        //     System.out.print("Jururan = ");
        //     System.out.println(kumpul[i-1].jurusan);
        //  }

        System.out.print("ingin cari mahasiswa bernama apa ? ");
        scanner.nextLine();
        String cari = scanner.nextLine();
        for(int i = kumpul.length;i > 0; i--){
            if(kumpul[i-1].nama.equals(cari)){
                System.out.print("Nama    = ");
                System.out.println(kumpul[i-1].nama);
                System.out.print("Umur    = ");
                System.out.println(kumpul[i-1].umur);
                System.out.print("Jururan = ");
                System.out.println(kumpul[i-1].jurusan);
            }
            else{
                System.out.println("tidak ada siswa berumur " + cari);
            }

        }
        scanner.close();

        // Mahasiswa m1 = new Mahasiswa("Ibnu", 18, 3.0);

        // System.out.println("NAMA : " + m1.nama);
        // System.out.println("UMUR : " + m1.umur);
        // System.out.println("IPK  : " + m1.ipk);
    }
    
}
