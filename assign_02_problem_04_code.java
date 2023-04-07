//Abdelrahman mostafa
//202106362
import java.util.*;
public class abdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int i,j,rows;
         rows= sc.nextInt();
        for(i = rows; i > 0; i--) {
            for(j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
