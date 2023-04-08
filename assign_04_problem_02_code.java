//Abdelrahman mostafa
//202106362
import java.util.*;
public class abdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j<n; j++) {
            if (a[j] <= 10) {
                System.out.println("A[" + j + "] = " + a[j]);
            }
        }
    }
        }
