// 12S24028 - Rotua Immanuela Tampubolon
// 12S24001 - Petra Ignatius Pengayoman Naibaho
import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];

        fungsi1(nama);
        fungsi2(nama);
    }
    
    public static void fungsi1(String[] nama) {
        int i;

        for (i = 0; i <= 3; i++) {
            nama[i] = "";
        }
    }
    
    public static void fungsi2(String[] nama) {
        int x, z;

        for (x = 0; x <= 3; x++) {
            nama[x] = input.nextLine();
            if (nama[x].equals("---")) {
                nama[x] = "";
                z = x;
                x = 4;
            } else {
                z = x;
            }
        }
        fungsi3(nama);
    }
    
    public static void fungsi3(String[] nama) {
        int c;

        for (c = 0; c <= 3; c++) {
            if (nama[c].equals("")) {
            } else {
                System.out.println(nama[c]);
            }
        }
    }
}
