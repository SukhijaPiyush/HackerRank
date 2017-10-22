import java.util.Scanner;

/**
 * Created by Piyush on 01-07-2017.
 */
public class LoopII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int  a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int storage = 0;
            int formula =(int)(a + Math.pow(2, 0) * b);
            storage += formula;
            System.out.print(storage+" ");
            for ( int j=1; j < n; j++) {
                int loop =(int)(Math.pow(2, j) * b);
                storage += loop;
                System.out.print(storage + " ");
            }
            System.out.println();
        }
    }
}

