import java.util.Scanner;
public class ArrayBilangan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //buat tipe integer dgn nama bil dgn kapasitas 4 element
        int[] bil = new int[4];

        //isi element dgn angka
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);
    }
}