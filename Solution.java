import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isNegative = n < 0;
        n = Math.abs(n);

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (isNegative) {
            sum = -sum;
        }

        System.out.println(sum);
    }
}