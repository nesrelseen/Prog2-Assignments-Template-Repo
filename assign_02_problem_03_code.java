//Abdelrahman mostafa
//202106362
import java.util.*;
public class abdo {
    public static void Star(int n)
    {
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int k= sc.nextInt();
      Star(k);
    }
}
