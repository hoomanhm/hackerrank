package hackerrank;

import java.util.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    SortedSet<String> subsetk = new TreeSet<String>();
    //SortedSet<String> sortedNames = new TreeSet<>();
    int count = 0;
    while(count <k){
    	for(int i = count; i< s.length()-k+1;i++) {
        subsetk.add(s.substring(i, i+k));
    	}
    count++;
    }
    
    smallest = subsetk.first();
    largest = subsetk.last();


    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'

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