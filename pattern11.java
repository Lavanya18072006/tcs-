import java.util.*;

public class pattern11{
    public static void main(String[] args) {
        int ip = 7;
        for(int i=1;i<ip;i++){
            for(int sp=1;sp<=ip-i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++){
                System.out.print('*');
            }
            System.out.println();
        }
         for(int i=ip;i>=1;i--){
            for(int sp=1;sp<=ip-i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
