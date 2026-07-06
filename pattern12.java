import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        int ip = 5;
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

