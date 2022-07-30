Problem Description:- https://www.interviewbit.com/problems/noble-integer/
 
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.

Input Format
First and only argument is an integer array A.

Output Format
Return 1 if any such integer p is found else return -1.

Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]
 
Example Output
Output 1:

 1
Output 2:

 -1
   
 Solution:- https://www.youtube.com/watch?v=g1a28MG9_p8
   
 public class Solution {
    public int solve(int[] A) {
        
        Arrays.sort(A);
        if(A[A.length-1]==0) return 1;
        for(int i=0;i<A.length-1;i++) {
            if(A[i]!=A[i+1]){
               int count = A.length-i-1;
               if(count == A[i]) {
                   return 1;
               }   
            }    
        }
        
        return -1;
    }
}
