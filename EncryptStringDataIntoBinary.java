import java.util.*;
import java.lang.Math;

public class EncryptStringDataIntoBinary {
    public static void main(String x[]) {
        Scanner abc = new Scanner(System.in);
        char a[] = "Hellow".toCharArray();
        int n = a.length;
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) a[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int no = a[i];
            int sum = 0;
            int count = 0;
            while (no != 0) {
                int rem = no % 2;
                no = no / 2;
                int p = (int) Math.pow(10, count);
                sum = sum + rem * p;
                count++;
            }
            arr[i] = sum;
        }

        System.out.println("After converting to binary:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }
}
