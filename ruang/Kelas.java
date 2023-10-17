package ruang;
import java.util.Scanner;
import java.util.ArrayList;


public class Kelas {
    ArrayList<Mahasiswa> totalSiswa = new ArrayList<Mahasiswa>();

    public void tambahSiswa(Scanner scanner){
        // INPUT NAMA
        System.out.print("Masukkan Nama = ");
        String nama= scanner.nextLine();
        Gender gender;

        // INPUT UMUR
        byte umur;
        while(true){
            System.out.print("Masukkan Umur = ");
            if(scanner.hasNextByte()){
                umur = scanner.nextByte();
                break;
            }
            else{
                System.out.println("Input error");
            }
        }
        scanner.nextLine();
        do{
            System.out.println("Gender? [L/P]");
            String inputGender = scanner.nextLine();
            if(inputGender.equalsIgnoreCase("L")){
                gender = Gender.values()[1];
                break;
            }
            else if(inputGender.equalsIgnoreCase("P")){
                gender = Gender.values()[0];
                break;
            }}while(true);
        //Menambah mahasiswa ke dalam totalSiswa
        totalSiswa.add(new Mahasiswa(nama,umur,gender));
    }

    //Menampilkan info kelas
    void printInfoKelas(){
        System.out.println("Total siswa adalah = " +totalSiswa.size());
        for(Mahasiswa i : totalSiswa){
            System.out.println("Nama    : " + i.nama);
            System.out.println("Umur    : " + i.umur);
            System.out.println("Gender  : " + i.gender );
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kelas ob = new Kelas();
        ob.printInfoKelas();
        String confirm;
        while(true){
            System.out.println("Tambah Mahasiswa? [Y/N]");
            confirm = scanner.nextLine();
            if(confirm.equalsIgnoreCase("Y")){
                ob.tambahSiswa(scanner);
            }
            else if(confirm.equalsIgnoreCase("N")){
                break;
            }
        }

        ob.printInfoKelas();
        System.out.println("Selesai");

    }
}

class Mahasiswa{
    String nama;
    byte umur;
    Gender gender;

    Mahasiswa(String nama, byte umur, Gender gender){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
    }

}

enum Gender {
    PEREMPUAN,
    LAKI
}
