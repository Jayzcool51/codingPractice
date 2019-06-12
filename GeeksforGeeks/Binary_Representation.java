/*
Write a program to print Binary representation of a given number N.
*/
import java.util.*;
public class Binary_Representation{
    static String bin(int i){
         StringBuilder sb=new StringBuilder();
        int n=i;
        while(n>=1){
            sb.append(n%2);
            n=n/2;
        }
        return sb.reverse().toString();
        
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		while(testcase>0){
		    int number=sc.nextInt();
		    String result=bin(number);
		    String padded=String.format("%014d",(Integer.parseInt(result)));
         System.out.println(padded);
		    testcase=testcase-1;
		}
        }
}