import java.io.*;
import java.util.*;

public class Predictive{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i != n) {
                System.out.print(" ");
            }

            long c = a + b;
            a = b;
            b = c;
        }
    }
}