Chips Factory:- https://www.interviewbit.com/problems/chips-factory/

A chips factory is packing chips in packets.
The packets of chips are represented as an array A.
Find the packet of chips which are empty (Ai = 0) and move them to the end of the array.
Return the resultant array.
  
Example Input
Input 1:
A = [0, 1, 2, 3]
Input 2:

A = [1, 0, 0, 0]


Example Output
Output 1:
[1, 2, 3, 0]
Output 2:

[1, 0, 0, 0]

Solution:- 
public class Solution {
    public int[] solve(int[] A) {
      int[] B = new int[A.length];
      int start = 0, end = A.length - 1, i = 0;
      
      while(i<A.length) {
          if(A[i]==0) {
              B[end] = 0;
              end--;
          } else {
              B[start] = A[i];
              start++;
          }
          i++;
      }
      
      return B;
    }
}
