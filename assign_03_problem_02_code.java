//Abdelrahman mostafa
//202106362
import java.util.*;
public class abdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 0, b = 1;
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}