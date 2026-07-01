import java.util.*;

public class Main5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:- ");
        int num = sc.nextInt();
        int res = 0;
        for(int i=1;i<=num/2;i++)
            if(num%i == 0) res += 1;
        System.out.println(res+1);
    }
}