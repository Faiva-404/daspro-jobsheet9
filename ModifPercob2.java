import java.util.Scanner;

public class ModifPercob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //buat tipe integer dgn nama nilaiAkhir & berkapasitas 10
      int[] nilaiAkhir = new int[10];

      //buat struktur perulangan 
      for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir ke-"+i+" : ");
        nilaiAkhir[i] = sc.nextInt();
      }

      //tampilkan semua isi elemen dari array nilaiAkhir
      for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-"+i+" lulus!");
        }
        if (nilaiAkhir[i] < 70) {
            System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
        }
    }
    }
}