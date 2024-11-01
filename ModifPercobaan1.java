import java.util.Scanner;
public class ModifPercobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //buat tipe integer dgn nama bil dgn kapasitas 4 element
        int[] bil = new int[4];

        //isi element dgn angka
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }

    }
    
}
