//Abdelrahman mostafa
//202106362
import java.util.*;
public class abdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int minSum = Integer.MAX_VALUE;
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    int sum = a[j] + a[k] + j - k;
                    if (sum < minSum) { minSum = sum; }
                }
            }
            System.out.println(minSum);
        }
    }
        }
