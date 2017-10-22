import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int n=A.compareTo(B);
        if(n>0){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
       char[] character=A.toCharArray();
    	   character[0]=Character.toUpperCase(character[0]);
    	   A=String.valueOf(character);
    	   System.out.print(A);
    	   character=B.toCharArray();
    	   character[0]=Character.toUpperCase(character[0]);
    	   B=String.valueOf(character);
    	   System.out.print(" "+B);
       }
    }

