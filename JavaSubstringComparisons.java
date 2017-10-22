import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubstringComparisons {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> sub=new ArrayList<>();
        
        for(int i=0;i+k<=s.length();i++){
        	sub.add(s.substring(i, i+k));
        }
        smallest=sub.get(0);
        largest=sub.get(0);
        for (String string : sub) {
			if(string.compareTo(smallest)<0){
				smallest=string;
			}
			if (string.compareTo(largest)>0) {
				largest=string;
			}
		}
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
