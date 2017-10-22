import java.util.Scanner;

/**
 * Created by Piyush on 02-07-2017.
 */
public class StaticBlock {
    static private int height;
    static private int width;
    static
    {
        Scanner s = new Scanner(System.in);
        width=s.nextInt();
        height=s.nextInt();
        if(width<0||height<0)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
            System.out.println(height*width);
    }
static public void main(String args[]){}
}
