import java.util.Scanner;
public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel total dan rata2
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        //isi dgn nilai input dari pengguna
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        //gunakan perulangan unt menghitung jml keseluruhan nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        //hitung rata2
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
    }  
}
