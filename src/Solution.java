import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class Solution {
    static int B = 0;
    static int H = 0;
    static boolean flag = true;
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        if(flag){
            int area = B * H ;
            System.out.println(area);
            
        }
    }
}
