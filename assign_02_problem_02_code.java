//Abdelrahman mostafa
//202106362
import java.util.*;

public class abdo {

    static void solve(int n)
    {
      for (int i=1;i<=12;i++)
      {
          System.out.println(n + " * " + i + " = " + n*i);
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        solve(n);

    }
}
