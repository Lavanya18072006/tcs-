import java.util.*;

public class primenumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENter a num:- ");
      int num = sc.nextInt(); // 9
      Boolean isPrime = true;
      for(int i=2;i<=num/2;i++){
          if(num%i==0){
            isPrime = false;
            break;
          }
      }
      if(isPrime)
        System.out.println("Prime");
      else 
        System.out.println("Not Prime");
    }
}