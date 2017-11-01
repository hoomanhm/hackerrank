package hackerrank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.print(output(A));    
        
    }

	private static Object output(String A) {
		for(int i=0;i<(A.length()/2)+1;i++){
			String A1=A.substring(i,i+1);
			String A2=A.substring(A.length()-i-1,A.length()-i); 
            if(!(A1.equals(A2))) return "No";
		}
		return "Yes";
	}
}
