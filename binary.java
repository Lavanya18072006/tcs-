import java.util.*;

public class binary {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a num:- ");
      int num = sc.nextInt(); // 10
      String s = "";
      while(num > 0){
          s = num%2 + s;
          num/=2;
      }
      System.out.println(s);
    }
}